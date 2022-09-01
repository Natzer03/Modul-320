import java.util.HashMap;
import java.util.Map;

public class GameFight {
    private static int fighterNumber = 1;
    private static Map<Integer, GameCharacter> fighters = new HashMap<>();

    public static void addFighter(GameCharacter character) {
        fighters.put(fighterNumber, character);
        fighterNumber++;
    }

    public void getFighters() {
        for (int i = 1; i < fighters.size(); i++) {
            System.out.println(fighters.get(i));
        }
    }

    public void startFight() {
        GameCharacter fighter1 = fighters.get(1);
        GameCharacter fighter2 = fighters.get(2);
        int beginner = (int) (Math.random() * 2 + 1);
        if (beginner == 1) {
            for (int k = 0; k < 100; k++) {
                if (fighter1.getHp() > 0) {
                    fighter1.attackFighter1(fighter1, fighter2);
                } else {
                    System.out.println(fighter2.getName() + " has Won");
                    break;
                }
                if (fighter2.getHp() > 0) {
                    fighter2.attackFighter1(fighter2, fighter1);
                } else {
                    System.out.println(fighter1.getName() + " has Won");
                    break;
                }
            }
        } else {
            for (int j = 0; j < 100; j++) {
                if (fighter2.getHp() > 0) {
                    fighter2.attackFighter1(fighter2, fighter1);
                } else {
                    System.out.println(fighter1.getName() + " has Won");
                    break;
                }
                if (fighter1.getHp() > 0) {
                    fighter1.attackFighter1(fighter1, fighter2);
                } else {
                    System.out.println(fighter2.getName() + " has Won");
                    break;
                }
            }

        }

    }
}
