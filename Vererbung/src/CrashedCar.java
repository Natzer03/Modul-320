
public class CrashedCar extends Car {
    private int damageLevel;

    public CrashedCar(String model, double price, int damageLevel) {
        super(model, price);
        this.damageLevel = damageLevel;
    }

    public double getPrice() {
        return switch (damageLevel) {
            case 0 -> super.getPrice() - (super.getPrice() / 10);
            case 1 -> super.getPrice() - (super.getPrice() / 2);
            default -> 0;
        };
    }

    public int getDamageLevel() {
        return damageLevel;
    }

    public void setDamageLevel(int damageLevel) {
        this.damageLevel = damageLevel;
    }
}
