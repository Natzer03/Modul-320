package Model;

public class Magic_Caster extends Character{
    private String name = "Magic Caster";
    public Magic_Caster(String name, int hp, int ap) {
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

        System.out.println(super.getName() + " burns " + enemy.getName() + " with magic damage of" + hit +" | " + getWeapon().getName()+ " | ") ;
        this.log(this);
        this.log(enemy);
    }
}
