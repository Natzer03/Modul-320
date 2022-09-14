import java.util.ArrayList;

public class TesterForCar {
    public static void main(String[] args) {
        Car usedCar = new UsedCar("Ferrari", 1000, 10000);
        Car crashedCar = new CrashedCar("Smart", 2000, 0);
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(usedCar);
        carList.add(crashedCar);

        for (Car car : carList){
            System.out.println("Carmodel: " + car.getModel() + "|| Car price: " + car.getPrice());
        }
    }
}