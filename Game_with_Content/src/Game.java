import java.util.ArrayList;
import java.util.Collections;

public class Game {
    private final ArrayList<Character> fighters = new ArrayList<>();

    public void addFighters(Character fighter) {
        fighters.add(fighter);
    }
    public Character fightGame() throws InterruptedException {
        while (fighters.size() > 1) {
            System.out.println("---New round---");
            Collections.shuffle(fighters);
            Character player1 = fighters.get(0);
            Character player2 = fighters.get(1);
            Fight f = new Fight(player1, player2);
            f.fight();
            f.getWinner().addXp(player2.getXp());
            f.getWinner().checkForLvlUp(f.getWinner());
            f.getWinner().refreshHP();
            Character looser = f.getLosser();
            System.out.println(looser.getName() + " has lost and got eliminated.");
            fighters.remove(looser);
        }
        if (this.fighters.size() > 0) {
            return this.fighters.get(0);
        } else {
            return null;
        }
    }
}
