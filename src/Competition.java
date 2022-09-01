import java.util.ArrayList;

public class Competition {
    private String competitionName;
    /*private Ship[] ships = new Ship[5];*/

    private ArrayList<Ship> list = new ArrayList<Ship>();
    private Person[] owner = new Person[5];
    private int counterOFShips = 0;

    public Competition() {
    }

    public Competition(String name) {
        competitionName = name;
    }

    public void addShip(Ship ship) {
        /*this.ships[counterOFShips] = ship;*/
        list.add(counterOFShips,ship);
        counterOFShips++;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public ArrayList getShips() {
        return list;
    }

    /*public void setShips(Ship[] ships) {
        list.set(ships) = ships;
    }*/

    public void start() {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                Ship s = list.get(i);
                s.race();
            }
        }
        for (int j = 0; j <= 4; j++) {
            if (owner[j] != null) {
                Person o = owner[j];
                o.getFirstName();
                o.getLastName();
                o.getResidence();
            }
        }
    }


    public void printResult() {
        System.out.println("Wettkampf: " + competitionName);
        for (Ship s : list) {
            if (s != null) {
                String ownerOutput = " Besitzer: ";

                Person owner = s.getOwner();
                if (owner != null) {
                    ownerOutput += owner.getFirstName() + " " + owner.getLastName();
                }

                System.out.println(
                        "Schiff Nr: " + s.getShipNumber() + " Name: " + s.getShipName() + ownerOutput + " Zeit: " + s.getShipTime());
            }
        }
    }
}
