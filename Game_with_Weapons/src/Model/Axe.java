package Model;

public class Axe implements IWeapon {
    public Axe(){}
    private String name = "Axe";
    @Override
    public int use(int ap) {
        return (int) (Math.random() * ap);
    }

    public String getName() {
        return name;
    }
}
