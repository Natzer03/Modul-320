public class Fight {
    protected Character player1;

    protected Character player2;

    protected Character player3;
    protected boolean played = false;

    public Character getPlayer1() {
        return player1;
    }

    public void setPlayer1(Character player1) {
        this.player1 = player1;
    }

    public Character getPlayer2() {
        return player2;
    }



    public void setPlayer2(Character player2) {
        this.player2 = player2;
    }
    public Character getPlayer3() {
        return player3;
    }
    public void setPlayer3(Character player3) {
        this.player3 = player3;
    }
    public Fight() {

    }

    public Fight(Character player1, Character player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void fight() throws InterruptedException {
        this.played = false;
        System.out.println(player1.getName() + " vs " + player2.getName());
        while (player1.getHp() > 0 && player2.getHp() > 0) {
            this.player1.attack(this.player2);
            Thread.sleep(2000);
            this.newRound();
            System.out.println("---");
        }
        played = true;
    }
    public void fight(Character player3) throws InterruptedException {
        this.played = false;
        System.out.println(player1.getName() + " vs " + player2.getName());
        while (player1.getHp() > 0 && player2.getHp() > 0 && player3.getHp() > 0) {
            this.player1.attack(this.player2);
            this.player2.attack(this.player3);
            if (player2.getHp() == 0){
                this.player1.attack(this.player3);
                this.player3.attack(this.player1);
            }
            Thread.sleep(2000);
            this.newRoundThree();
            System.out.println("---");
        }
        played = true;
    }

    protected void newRound() {
        Character tmp = this.player1;
        this.player1 = player2;
        this.player2 = tmp;
    }
    protected void newRoundThree() {
        Character tmp = this.player1;
        this.player1 = player2;
        this.player2 = player3;
        player3 = tmp;
    }

    public Character getWinner() {
        if (played) {
            if (this.player1.getHp() > 0) {
                return player1;
            } else {
                return player2;
            }
        }
        return null;
    }



    public Character getLosser() {
        if (played) {
            if (this.player1.getHp() == 0) {
                return player1;
            } else {
                return player2;
            }
        }
        return null;
    }
}
