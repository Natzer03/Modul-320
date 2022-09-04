import java.util.Scanner;

public class Tester {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        TeamFight teamFight = new TeamFight();
        ThreeTeamFight threeTeamFight = new ThreeTeamFight();
        int randomClass = (int) (Math.random() * 100 + 1);
        Character char1 = new Character("Enrico", randomClass);
        randomClass = (int) (Math.random() * 100 + 1);
        Character char2 = new Character("Carlos", randomClass);
        randomClass = (int) (Math.random() * 100 + 1);
        Character char3 = new Character("Joel", randomClass);
        randomClass = (int) (Math.random() * 100 + 1);
        Character char4 = new Character("Leon", randomClass);
        randomClass = (int) (Math.random() * 100 + 1);
        Character char5 = new Character("Finn", randomClass);
        randomClass = (int) (Math.random() * 100 + 1);
        Character char6 = new Character("Kento", randomClass);
        System.out.println("Which tournament are you signing in?");
        System.out.println("-1 Solo fights");
        System.out.println("-2 Team fights");
        int decision = myScanner.nextInt();

        switch (decision) {
            case 1:
                System.out.println("The challengers of this years fighter tournament are:");
                game.addFighters(char1); game.addFighters(char2); game.addFighters(char3); game.addFighters(char4); game.addFighters(char5); game.addFighters(char6);

                Thread.sleep(2000);
                System.out.printf("Name: " + char1.getName() + "%n" + "Level: " + char1.getLvl() + "%n" + "Class: " + char1.getCharacterClass() + "%n" + "HP: " + char1.getHp() + "%n" + "AP: " + char1.getAp() + "%n");
                System.out.println("--- ---");
                Thread.sleep(2000);
                System.out.printf("Name: " + char2.getName() + "%n" + "Level: " + char2.getLvl() + "%n" + "Class: " + char2.getCharacterClass() + "%n" + "HP: " + char2.getHp() + "%n" + "AP: " + char2.getAp() + "%n");
                System.out.println("--- ---");
                Thread.sleep(2000);
                System.out.printf("Name: " + char3.getName() + "%n" + "Level: " + char3.getLvl() + "%n" + "Class: " + char3.getCharacterClass() + "%n" + "HP: " + char3.getHp() + "%n" + "AP: " + char3.getAp() + "%n");
                System.out.println("--- ---");
                Thread.sleep(2000);
                System.out.printf("Name: " + char4.getName() + "%n" + "Level: " + char4.getLvl() + "%n" + "Class: " + char4.getCharacterClass() + "%n" + "HP: " + char4.getHp() + "%n" + "AP: " + char4.getAp() + "%n");
                System.out.println("--- ---");
                Thread.sleep(2000);
                System.out.printf("Name: " + char5.getName() + "%n" + "Level: " + char5.getLvl() + "%n" + "Class: " + char5.getCharacterClass() + "%n" + "HP: " + char5.getHp() + "%n" + "AP: " + char5.getAp() + "%n");
                System.out.println("--- ---");
                Thread.sleep(2000);
                System.out.printf("Name: " + char6.getName() + "%n" + "Level: " + char6.getLvl()+ "%n" + "Class: " + char6.getCharacterClass() + "%n" + "HP: " + char6.getHp() + "%n" + "AP: " + char6.getAp() + "%n");
                System.out.println("--- ---");
                Thread.sleep(2000);
                System.out.println("Let the tournament begin.");
                Thread.sleep(3000);

                Character soloWinner = game.fightGame();
                System.out.printf(soloWinner.getName() + " has beaten all other fighters.");
                break;
            case 2:
                teamFight.addFighterToTeam1(char1); teamFight.addFighterToTeam1(char2); teamFight.addFighterToTeam2(char3); teamFight.addFighterToTeam2(char4);

                System.out.println("The challengers of this years fighter tournament are:");
                Thread.sleep(2000);
                System.out.printf("Name: " + char1.getName()  +  "%n" + "Level: " + char1.getLvl() +  "%n"+ "Team: " + char1.getTeamNumber() + "%n" + "Class: " + char1.getCharacterClass() + "%n" + "HP: " + char1.getHp() + "%n" + "AP: " + char1.getAp() + "%n");
                System.out.println("--- ---");
                Thread.sleep(2000);
                System.out.printf("Name: " + char2.getName() + "%n" +"Level: " + char2.getLvl() + "%n" + "Team: " + char2.getTeamNumber() + "%n" + "Class: " + char2.getCharacterClass() + "%n" + "HP: " + char2.getHp() + "%n" + "AP: " + char2.getAp() + "%n" );
                System.out.println("--- ---");
                Thread.sleep(2000);
                System.out.printf("Name: " + char3.getName() + "%n" +"Level: " + char3.getLvl() + "%n" + "Team: " + char3.getTeamNumber() + "%n" + "Class: " + char3.getCharacterClass() + "%n" + "HP: " + char3.getHp() + "%n" + "AP: " + char3.getAp() + "%n");
                System.out.println("--- ---");
                Thread.sleep(2000);
                System.out.printf("Name: " + char4.getName() + "%n" + "Level: " + char4.getLvl() + "%n" + "Team: " + char4.getTeamNumber() + "%n" + "Class: " + char4.getCharacterClass() + "%n" + "HP: " + char4.getHp() + "%n" + "AP: " + char4.getAp() +"%n" );
                Thread.sleep(2000);
                System.out.println("Let the tournament begin.");
                Thread.sleep(3000);

                teamFight.fight();
                String teamWinner = teamFight.getWinnerTeam();
                System.out.println(teamWinner + " have beaten the opposing team.");
                break;
            case 3:
                threeTeamFight.fight();
                String threeTeamWinner = threeTeamFight.getWinnerTeam();
                System.out.println(threeTeamWinner + "have beaten their competition.");
            default:
                System.out.println("This kind of tournament is not available");
                break;
        }

    }
}
