package Model;

public class Character {

	private String name;
	private int hp; // health
	private int ap; // attack
	private int maxHp;
	private Character characterClass;

	private IWeapon weapon;
	
	public Character(String name, int hp, int ap) {
		this.name = name;
		this.hp = hp;
		this.maxHp = hp;
		this.ap = ap;
		//this.characterClass
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCharacterClassName(String characterClassName) {
	}

	public int getHp() {
		return hp;
	}

	protected void setHp(int hp) {
		if(hp < 0) {
			this.hp = 0;
		} else {
			this.hp = hp;
		}
	}

	public int getAp() {
		return ap;
	}

	public void setAp(int ap) {
		this.ap = ap;
	}
	
	public void heal() {
		this.hp = this.maxHp;
	}
	public void attack(Character enemy) {
		int hit = weapon.use(this.getAp());
		enemy.setHp(enemy.getHp() - hit);

		System.out.println("| "+ this.getName() +" | " +this.name + " hit " + enemy.name + " with " + hit +" with " + weapon.getName()) ;
		this.log(this);
		this.log(enemy);
	}

	public IWeapon getWeapon(){
		return weapon;
	}
	public void setWeapon(IWeapon weapon) {
		this.weapon = weapon;
	}

	protected void log(Character character) {
		System.out.println(character.getName() +": " + "hp=" + character.getHp());
	}
}
