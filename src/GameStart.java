public class GameStart {
    public static void main(String[] args) {
        GameCharacter charakter1 = new GameCharacter("Enrico");
        GameCharacter charakter2 = new GameCharacter("Joel");

        GameFight.addFighter(charakter1);
        GameFight.addFighter(charakter2);

        GameFight fight = new GameFight();

        fight.startFight();
    }
}
