package Model;

public class Golem extends Character{
    private String name = "Golem";
    public Golem(String name, int hp, int ap) {
        super(name, hp, ap);
        setWeapon(new Axe());
        setCharacterClassName(name);

    }
    public String getName() {
        return name;
    }
    @Override
    public void attack(Character enemy) {
        int hit = getWeapon().use(this.getAp());
        enemy.setHp(enemy.getHp() - hit);

        System.out.println(super.getName() + " punches " + enemy.getName() + " with damage of " + hit +" | " + getWeapon().getName()+ " | ") ;
        this.log(this);
        this.log(enemy);
    }
}
