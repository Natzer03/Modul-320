/**
 * @version 1.0
 * @author Enrico
 *
 */
public class Competition1 {

	private String name;
	private Ship1[] ships = new Ship1[5];

	/**
	 *
	 * @param name sets the name of the competition
	 */
	public Competition1(String name) {
		this.name = name;
	}

	public void start() {

		for (Ship1 s : this.ships) {
			if (s != null) {
				s.race();
			}
		}
	}

	public void addShip(Ship1 ship) {
		for (int i = 0; i < ships.length; i++) {
			if (ships[i] == null) {
				ships[i] = ship;
				break;
			}
		}
	}

	public void printResult() {
		System.out.println("Wettkampf: " + this.name);

		for (Ship1 s : this.ships) {
			if (s != null) {
				System.out.println("Schiff Nr: " + s.getNr() + " Name: " + s.getName() + " Zeit: " + s.getTime());
			}
		}
	}
}
