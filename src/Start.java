import java.util.Scanner;

public class Start {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        Competition1 c = new Competition1("First Race");

        Person person1 = new Person("Esa", "Koch", "Switzerland");
        Person person2 = new Person("Nasir", "Frame", "Italy");
        Person person3 = new Person("Rida", "Jacobson", "Germany");
        Person person4 = new Person("Roma", "Arellano", "USA");
        Person person5 = new Person("Heidi", "Dean", "Bhutan");
        Person person6 = new Person("Enrico", "Proietto", "Switzerland");

        Ship1 ship1 = new Ship1(1,"Alinghi");
        Ship1 ship2 = new Ship1(2,"Red Baron");
        Ship1 ship3 = new Ship1(3,"Blue Lagoon");
        Ship1 ship4 = new Ship1(4,"Golly Rogers");
        Ship1 ship5 = new Ship1(5,"Fontaine");
        Ship1 ship6 = new Ship1(6,"Natzership");

        ship1.setOwner(person1);
        ship2.setOwner(person2);
        ship3.setOwner(person3);
        ship4.setOwner(person4);
        ship5.setOwner(person5);
        ship6.setOwner(person6);

        c.addShip(ship1);
        c.addShip(ship2);
        c.addShip(ship3);
        c.addShip(ship4);
        c.addShip(ship5);
        c.addShip(ship6);

        c.start();

        c.printResult();
    }
}
