/**
 * @author Enrico
 * @version 1.0
 */
public class Start1 {

	
	public static void main(String[] args) {
		
		Competition1 c = new Competition1("Rotsee Regatta");
		
		Ship1 ship1 = new Ship1(1, "Alinghi");
		Ship1 ship2 = new Ship1(2, "Red Baron");
		Ship1 ship3 = new Ship1(3, "Blue Lagoon");
		
		c.addShip(ship1);
		c.addShip(ship2);
		c.addShip(ship3);
		
		c.start();
	
		c.printResult();
	}	
}