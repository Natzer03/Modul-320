public class Competition {
    private String competitionName;
    private Ship[] ships = new Ship[5];
    private Person[] owner = new Person[5];
    private int counterOFShips = 0;

    public Competition() {
    }

    public Competition(String name) {
        competitionName = name;
    }

    public void addShip(Ship ship) {
        this.ships[counterOFShips] = ship;
        counterOFShips++;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public Ship[] getShips() {
        return ships;
    }

    public void setShips(Ship[] ships) {
        this.ships = ships;
    }

    public void start() {

        for (int i = 0; i <= 4; i++) {
            if (ships[i] != null) {
                Ship s = ships[i];
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
        for (Ship s : this.ships) {
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
