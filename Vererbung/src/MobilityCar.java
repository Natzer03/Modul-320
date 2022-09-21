public class MobilityCar extends Car {
    private int days;

    public double getMobilityCarPrice(int days) {
        return days * 72;
    }

    public MobilityCar(String model, double price, int days) {
        super(model, price);
        this.days = days;
    }

    public double getPrice() {
        return getDays() * 72;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
