import java.util.ArrayList;

public class TeamFight extends Fight {

    private final ArrayList<Character> fightTeam1;
    private final ArrayList<Character> fightTeam2;

    public void addFighterToTeam1(Character fighter) {
        fightTeam1.add(fighter);
        fighter.setTeamNumber(1);
    }

    public void addFighterToTeam2(Character fighter) {
        fightTeam2.add(fighter);
        fighter.setTeamNumber(2);
    }

    public String getTeamName1() {
        return fightTeam1.get(0).getName() + " and " + fightTeam1.get(1).getName();
    }

    public int getTeamSize1() {
        return fightTeam1.size();
    }

    public String getTeamName2() {
        return fightTeam2.get(0).getName() + " and " + fightTeam2.get(1).getName();
    }

    public TeamFight() {
        this(new ArrayList<>(), new ArrayList<>());
    }

    public TeamFight(ArrayList<Character> fightTeam1, ArrayList<Character> fightTeam2) {
        super();
        this.fightTeam1 = fightTeam1;
        this.fightTeam2 = fightTeam2;
    }

    @Override
    public void fight() throws InterruptedException {
        while (fightTeam1.size() > 0 && fightTeam2.size() > 0) {
            System.out.println("---New round---");
            setPlayer1(fightTeam1.get(0));
            setPlayer2(fightTeam2.get(0));
            fight();
            Character looser = getLosser();
            getWinner().addXp(looser.getXp());
            getWinner().checkForLvlUp(getWinner());
            getWinner().refreshHP();
            System.out.println(looser.getName() + " has lost and got eliminated.");
            if (looser == player1) {
                fightTeam1.remove(looser);
            } else {
                fightTeam2.remove(looser);
            }
        }

    }

    public String getWinnerTeam() {
        if (played) {
            if (getTeamSize1() > 0) {
                return getTeamName1();
            } else {
                return getTeamName2();
            }
        }
        return null;
    }
}
