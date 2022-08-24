import java.util.Scanner;

public class Start {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        Competition c = new Competition("First Race");

        Person person1 = new Person("Esa", "Koch", "Switzerland");
        Person person2 = new Person("Nasir", "Frame", "Italy");
        Person person3 = new Person("Rida", "Jacobson", "Germany");
        Person person4 = new Person("Roma", "Arellano", "USA");
        Person person5 = new Person("Heidi", "Dean", "Bhutan");

        Ship ship1 = new Ship(1,"Alinghi");
        Ship ship2 = new Ship(2,"Red Baron");
        Ship ship3 = new Ship(3,"Blue Lagoon");
        Ship ship4 = new Ship(4,"Golly Rogers");
        Ship ship5 = new Ship(5,"Fontaine");

        ship1.setOwner(person1);
        ship2.setOwner(person2);
        ship3.setOwner(person3);
        ship4.setOwner(person4);
        ship5.setOwner(person5);

        c.addShip(ship1);
        c.addShip(ship2);
        c.addShip(ship3);
        c.addShip(ship4);
        c.addShip(ship5);

        c.start();

        c.printResult();
    }
}
