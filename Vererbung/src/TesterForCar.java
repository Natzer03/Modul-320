import java.util.ArrayList;

public class TesterForCar {
    public static void main(String[] args) {
        Car ferrari = new UsedCar("Ferrari", 1000, 10000);
        Car smart = new CrashedCar("Smart", 2000, 0);
        Car ford = new MobilityCar("Ford", 0, 100);
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(ferrari);
        carList.add(smart);
        carList.add(ford);

        for (Car car : carList){
            System.out.println("Carmodel: " + car.getModel() + " Car price: " + car.getPrice());
        }
    }
}