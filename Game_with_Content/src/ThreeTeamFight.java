import java.util.ArrayList;

public class ThreeTeamFight extends TeamFight{
    private ArrayList<Character> Team1 = new ArrayList<>();
    private ArrayList<Character> Team2 = new ArrayList<>();
    private ArrayList<Character> Team3 = new ArrayList<>();

    public ThreeTeamFight(){
        this(new ArrayList<>(), new ArrayList<>(),new ArrayList<>());
    }
    public ThreeTeamFight(ArrayList<Character> Team1, ArrayList<Character> Team2,ArrayList<Character> Team3) {
        super();
        this.Team1 = Team1;
        this.Team2 = Team2;
        this.Team3 = Team3;
    }

    public ArrayList<Character> getTeam1() {
        return Team1;
    }

    public void addTeam1(Character team1) {
        Team1.add(team1);
    }

    public ArrayList<Character> getTeam2() {
        return Team2;
    }

    public void addTeam2(Character team2) {
        Team2.add(team2);
    }

    public ArrayList<Character> getTeam3() {
        return Team3;
    }

    public void addTeam3(Character team3) {
        Team3.add(team3);
    }
    public int getTeam1size(){
        return Team1.size();
    }
    public int getTeam2size(){
        return Team2.size();
    }
    public int getTeam3size(){
        return Team3.size();
    }

    @Override
    public void fight() throws InterruptedException {
        while (getTeam1size() > 0 && getTeam2size() > 0 && getTeam3size() > 0) {
            System.out.println("---New round---");
            setPlayer1(Team1.get(0));
            setPlayer2(Team2.get(0));
            setPlayer3(Team3.get(0));
            fight();
            Character looser = getLosser();
            getWinner().addXp(looser.getXp());
            getWinner().checkForLvlUp(getWinner());
            getWinner().refreshHP();
            System.out.println(looser.getName() + " has lost and got eliminated.");
            if (looser == player1) {
                Team1.remove(looser);
            }
            if (looser == player2){
                Team2.remove(looser);
            }
            else {
                Team3.remove(looser);
            }
        }

    }
}
