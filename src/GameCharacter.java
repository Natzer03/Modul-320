public class GameCharacter {
    private int hp = 100;
    private int xp = 0;
    private int lvl = 1;
    private int ap = 12;
    private String name;

    public GameCharacter(String name){
      this.name = name;
    }
    public String getName(){
        return name;
    }
    public void getStats(){
        System.out.print("Name: "+name+" ");
        System.out.print("HP: "+hp+" ");
        System.out.print("Level: "+lvl+" ");
        System.out.println("AP: "+ap + " ");
    }
    public void setHP(int amount){
        hp -= amount;
        if (hp < 0){
            hp = 0;
        }

    }

    public int getAp() {
        return ap;
    }
    public int getHp(){
        return hp;
    }
    public void attackFighter1(GameCharacter fighter1, GameCharacter fighter2){
        int fighter1Hit = (int) (fighter1.getAp()*(Math.random()*2+1));
        System.out.println(fighter1.getName()+ " hit "+ fighter2.getName() +" with " +fighter1Hit);
        System.out.println(fighter2.getName() + ": hp=" +fighter2.getHp());
        fighter2.setHP(fighter1Hit);
        if (fighter2.getHp() < 0){
            fighter2.setHP(0);
        }
        fighter1Hit = 0;
        System.out.println(fighter2.getName() + ": hp=" + fighter2.getHp());
        System.out.println("----");
    }
    public void attackFighter2(GameCharacter fighter1, GameCharacter fighter2) {
        int fighter2Hit = (int) (fighter1.getAp()*(Math.random()*2+1));
        System.out.println(fighter1.getName()+ " hit "+ fighter2.getName() +" with " +fighter2Hit);
        System.out.println(fighter2.getName() + ": hp=" +fighter2.getHp());
        fighter2.setHP(fighter2Hit);
        fighter2Hit = 0;
        System.out.println(fighter2.getName() + ": hp=" + fighter1.getHp());
        System.out.println("----");
    }
}
