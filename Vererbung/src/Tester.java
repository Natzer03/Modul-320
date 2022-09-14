public class Tester {
    public static void main(String[] args) {
        UsedCar usedCar = new UsedCar("Ferrari", 1000, 10);
        CrashedCar crashedCar = new CrashedCar("Smart", 2000, 1);

        System.out.println("UsedCar    | Preis: " + usedCar.getPrice());
        System.out.println("CrashedCar | Preis: " + crashedCar.getPrice());
    }
}