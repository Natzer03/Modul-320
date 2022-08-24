public class Ship {

    private String shipName;
    private int shipNumber;
    private int shipTime;
    private Person owner;

    public Ship(int number, String name) {
        shipNumber = number;
        shipName = name;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public int getShipNumber() {
        return shipNumber;
    }

    public void race() {
        int min = 300;
        int max = 600;
        shipTime = (int) (Math.random() * (max - min + 1)) + min;
    }

    public void setShipNumber(int shipNumber) {
        this.shipNumber = shipNumber;
    }

    public int getShipTime() {
        return shipTime;
    }

    public Person getOwner(){
        return owner;
    }
    public void setOwner(Person owner){
        this.owner = owner;
    }
}
