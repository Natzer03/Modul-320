package Model;

public class Dagger implements IWeapon {
    public Dagger(){}
    private String name = "Dagger";
    @Override
    public int use(int ap) {
        int firstStrike = (int) (Math.random() * (ap/2));
        int secondStrike = (int) (Math.random() * (ap/2));
        return firstStrike + secondStrike;
    }
    public String getName() {
        return name;
    }
}
