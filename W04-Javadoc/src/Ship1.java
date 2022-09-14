/**
 * Represents a ship
 * @version 1.0
 * @author Enrico
 */
public class Ship1 {

	private int nr;
	private String name;
	private int time;

	/**
	 * Konstructor of the class ship1
	 * @param nr
	 * @param name
	 */
	public Ship1(int nr, String name) {
		this.nr = nr;
		this.name = name;
	}

	/**
	 * show number for ship
	 * @return nr
	 */
	public int getNr() {
		return nr;
	}

	/**
	 * sets number for ship
	 * @param nr
	 */
	public void setNr(int nr) {
		this.nr = nr;
	}

	/**
	 * returns the name of the object Ship.
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * sets name for ship
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * calculates time for race
	 */
	public void race() {
		int min = 300;
		int max = 600;
		this.time = (int) (Math.random() * (max - min + 1)) + min;
	}

	/**
	 * returns the time for competition
	 * @return time
	 */
	public int getTime() {
		return time;
	}
	
}
