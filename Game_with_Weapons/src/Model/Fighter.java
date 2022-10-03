package Model;

public class Fighter extends Character{
    private String name = "Fighter";
    public Fighter(String name, int hp, int ap) {
        super(name, hp, ap);
        setWeapon(new Dagger());
        setCharacterClassName(name);
    }
    public String getName() {
        return name;
    }
    @Override
    public void attack(Character enemy) {
        int hit = getWeapon().use(this.getAp());
        enemy.setHp(enemy.getHp() - hit);

        System.out.println(super.getName() + " stabs " + enemy.getName() + " with damage of" + hit +" | " + getWeapon().getName()+ " | ") ;
        this.log(this);
        this.log(enemy);
    }
}
