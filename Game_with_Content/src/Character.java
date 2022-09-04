public class Character {
    private final String name;
    private int hp = 100; // health
    private int ap = 20; // attack

    private int xp = 50; //Experience Points

    private int lvl = 1; // Level of Player
    public int maxHp = 100;

    private String characterClass;
    public int teamNumber;
    private int numberForLvlIncrease = 100;

    public void setMaxHp() {
        if (lvl == 2) {
            maxHp += 10;
        }
        if (lvl == 3) {
            maxHp += 20;
        }

    }

    public void setTeamNumber(int amount) {
        teamNumber = amount;
    }

    public int getTeamNumber() {
        return teamNumber;
    }

    public void setMaxHp(int amount) {
        if (lvl == 1) {
            maxHp = amount;
        }
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void addXp(int xp) {
        this.xp += xp;
    }

    public int getLvl() {
        return lvl;
    }

    public void setNumberForLvlIncrease() {
        numberForLvlIncrease += 50;
    }

    public void setNumberForLvlIncrease(int amount) {
        numberForLvlIncrease = amount;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void checkForLvlUp(Character character) {
        if (character.xp >= numberForLvlIncrease) {
            setXp(xp - numberForLvlIncrease);
            setLvl(lvl + 1);
            setAp();
            setMaxHp();
            setNumberForLvlIncrease();
            System.out.println(character.getName() + " got a level up.");
            System.out.println(character.getName() + " is now level " + character.getLvl() + ".");
        }
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }


    public Character(String name, int forCharacterClass) {
        this.name = name;

        if (forCharacterClass > 0 && forCharacterClass < 27) {
            characterClass = "Fighter";
            setHp(100);
            setLvl(1);
            setAp(25);
            setXp(50);
            setMaxHp(100);
        }
        if (forCharacterClass > 27 && forCharacterClass < 55) {
            this.characterClass = "Golem";
            setHp(150);
            setLvl(1);
            setAp(20);
            setXp(50);
            setMaxHp(200);
            setNumberForLvlIncrease(200);
        }
        if (forCharacterClass > 54 && forCharacterClass < 82) {
            this.characterClass = "Magic Caster";
            setHp(70);
            setLvl(1);
            setAp(40);
            setXp(50);
            setMaxHp(70);
            setNumberForLvlIncrease(150);
        }

        if (forCharacterClass > 81 && forCharacterClass < 87){
            this.characterClass = "Street Fighter";
            setHp(150);
            setLvl(1);
            setAp(45);
            setXp(50);
            setMaxHp(150);
            setNumberForLvlIncrease(250);
        }
        if (forCharacterClass > 86 && forCharacterClass < 92){
            this.characterClass = "Guardian of the forest";
            setHp(170);
            setLvl(1);
            setAp(35);
            setXp(50);
            setMaxHp(170);
            setNumberForLvlIncrease(150);
        }
        if (forCharacterClass > 91 && forCharacterClass < 97){
            this.characterClass = "Arc Mage";
            setHp(200);
            setLvl(1);
            setAp(50);
            setXp(50);
            setMaxHp(200);
            setNumberForLvlIncrease(500);
        }
        if (forCharacterClass == 97){
            this.characterClass = "Champion of the arena";
            setHp(250);
            setLvl(1);
            setAp(50);
            setXp(50);
            setMaxHp(250);
            setNumberForLvlIncrease(600);
        }
        if (forCharacterClass == 98){
            this.characterClass = "The ruler of the forest";
            setHp(280);
            setLvl(1);
            setAp(55);
            setXp(50);
            setMaxHp(280);
            setNumberForLvlIncrease(700);
        }
        if (forCharacterClass == 99){
            this.characterClass = "Mater of arcane magic";
            setHp(300);
            setLvl(1);
            setAp(60);
            setXp(50);
            setMaxHp(300);
            setNumberForLvlIncrease(1000);
        }
        if (forCharacterClass == 100){
            this.characterClass = "The Overlord";
            setHp(400);
            setLvl(1);
            setAp(55);
            setXp(50);
            setMaxHp(350);
            setNumberForLvlIncrease(1000);
        }
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int amount) {
        if (lvl == 1) {
            ap = amount;
        }

    }

    public void setAp() {
        if (lvl == 2) {
            ap += 10;
        }
        if (lvl == 3) {
            ap += 20;
        }
    }

    public void refreshHP() {
        setHp(maxHp);
    }

    public void attack(Character enemy) {
        int hit = (int) (this.ap * Math.random() + 1);
        int numberForCrit = (int) (Math.random() * 10 + 1);
        int numberForParry = (int) (Math.random() * 10 + 1);
        int numberForSpecialAbility = (int) (Math.random() * 100 + 1);
        if (numberForSpecialAbility == 100) {
            if (this.getHp() > 30) {
                hit *= 5;
                this.setHp(this.getHp() - 30);
                System.out.println("Special ability used. ");
            }
        }
        if (numberForCrit == 1) {
            hit *= 2;
            System.out.println("critical hit");
        }
        if (numberForParry == 10) {
            hit = 0;
            System.out.println("Perfect parry");
        }
        if (numberForParry > 6 && numberForParry < 10) {
            hit /= 2;
            System.out.println("half parry");
        }
        //Rage Mode
        if (hp <= 20) {
            hit *= 2;
        }
        enemy.setHp(enemy.getHp() - hit);
        //output for Fighter
        if (this.getCharacterClass().equals("Fighter")) {
            int randomNumberGolem = (int) (Math.random() * 3 + 1);
            if (randomNumberGolem == 1) {
                System.out.println(this.name + " dealt " + hit + " damage to " + enemy.name + " with punch.");
            }
            if (randomNumberGolem == 2) {
                System.out.println(this.name + " dealt " + hit + " damage to " + enemy.name + " with drop kick.");
            }
            if (randomNumberGolem == 3) {
                System.out.println(this.name + " dealt " + hit + " damage to " + enemy.name + " with roundhouse kick.");
            }
        }
        //output for Magic Caster
        if (this.getCharacterClass().equals("Magic Caster")) {
            int randomNumberMagicCaster = (int) (Math.random() * 3 + 1);
            if (randomNumberMagicCaster == 1) {
                System.out.println(this.name + " struck " + enemy.name + " with " + hit + " lightning damage.");
            }
            if (randomNumberMagicCaster == 2) {
                System.out.println(this.name + " burned " + enemy.name + " with " + hit + " fire damage.");
            }
            if (randomNumberMagicCaster == 3) {
                System.out.println(this.name + " pierced " + enemy.name + " with " + hit + "  magic damage.");
            }
        }
        //output for Golem
        if (this.getCharacterClass().equals("Golem")) {
            int randomNumberGolem = (int) (Math.random() * 3 + 1);
            if (randomNumberGolem == 1) {
                System.out.println(this.name + " dealt " + hit + " damage to " + enemy.name + " with falling rock.");
            }
            if (randomNumberGolem == 2) {
                System.out.println(this.name + " dealt " + hit + " damage to " + enemy.name + " with roots.");
            }
            if (randomNumberGolem == 3) {
                System.out.println(this.name + " dealt " + hit + " damage to " + enemy.name + " with falling tree.");
            }
        }

        if (this.getCharacterClass().equals("Street Fighter")) {
            int randomNumberGolem = (int) (Math.random() * 3 + 1);
            if (randomNumberGolem == 1) {
                System.out.println(this.name + " dealt " + hit + " damage to " + enemy.name + " with kick punch.");
            }
            if (randomNumberGolem == 2) {
                System.out.println(this.name + " dealt " + hit + " damage to " + enemy.name + " with slam.");
            }
            if (randomNumberGolem == 3) {
                System.out.println(this.name + " dealt " + hit + " damage to " + enemy.name + " with jump kick.");
            }
        }
        if (this.getCharacterClass().equals("Guardian of the forest")) {
            int randomNumberGolem = (int) (Math.random() * 3 + 1);
            if (randomNumberGolem == 1) {
                System.out.println(this.name + " dealt " + hit + " damage to " + enemy.name + " greater roots.");
            }
            if (randomNumberGolem == 2) {
                System.out.println(this.name + " dealt " + hit + " damage to " + enemy.name + " with rumbling of the earth.");
            }
            if (randomNumberGolem == 3) {
                System.out.println(this.name + " dealt " + hit + " damage to " + enemy.name + " with branch sword.");
            }
        }
        if (this.getCharacterClass().equals("Arc Mage")) {
            int randomNumberGolem = (int) (Math.random() * 3 + 1);
            if (randomNumberGolem == 1) {
                System.out.println(this.name + " electrified "  + enemy.name + "and dealt " + hit + " damage with lightning bolt.");
            }
            if (randomNumberGolem == 2) {
                System.out.println(this.name + " dealt " + hit + " damage to " + enemy.name + " with water wave.");
            }
            if (randomNumberGolem == 3) {
                System.out.println(this.name + " dealt " + hit + " damage to " + enemy.name + " with fire flare.");
            }
        }
        if (this.getCharacterClass().equals("Champion of the arena")) {
            int randomNumberGolem = (int) (Math.random() * 3 + 1);
            if (randomNumberGolem == 1) {
                System.out.println(this.name + " dealt " + hit + " damage to " + enemy.name + " with sword of the champion.");
            }
            if (randomNumberGolem == 2) {
                System.out.println(this.name + " dealt " + hit + " damage to " + enemy.name + " with shield of the champion.");
            }
            if (randomNumberGolem == 3) {
                System.out.println(this.name + " dealt " + hit + " damage to " + enemy.name + " with bow of the champion.");
            }
        }
        if (this.getCharacterClass().equals("the ruler of the forest")) {
            int randomNumberGolem = (int) (Math.random() * 3 + 1);
            if (randomNumberGolem == 1) {
                System.out.println(this.name + " dealt " + hit + " damage to " + enemy.name + " with eruption of the ground.");
            }
            if (randomNumberGolem == 2) {
                System.out.println(this.name + " dealt " + hit + " damage to " + enemy.name + " with shaking the world.");
            }
            if (randomNumberGolem == 3) {
                System.out.println(this.name + " dealt " + hit + " damage to " + enemy.name + " with protection of the forest.");
            }
        }
        if (this.getCharacterClass().equals("Master of arcane magic")) {
            int randomNumberGolem = (int) (Math.random() * 3 + 1);
            if (randomNumberGolem == 1) {
                System.out.println(this.name + " dealt " + hit + " damage to " + enemy.name + " with dark mana.");
            }
            if (randomNumberGolem == 2) {
                System.out.println(this.name + " dealt " + hit + " damage to " + enemy.name + " with tsunami of flames.");
            }
            if (randomNumberGolem == 3) {
                System.out.println(this.name + " dealt " + hit + " damage to " + enemy.name + " with void.");
            }
        }
        //output for The Overlord
        if (this.getCharacterClass().equals("The Overlord")) {
            int randomNumberOverlord = (int) (Math.random() * 3 + 1);
            if (randomNumberOverlord == 1) {
                System.out.println(this.name + " dealt " + hit + " damage to " + enemy.name + " with triple maximise magic.");
            }
            if (randomNumberOverlord == 2) {
                System.out.println(this.name + " dealt " + hit + " damage to " + enemy.name + " with falling down.");
            }
            if (randomNumberOverlord == 3) {
                System.out.println(this.name + " dealt " + hit + " damage to " + enemy.name + " with the goal of all live is death.");
            }
        }

        //System.out.println(this.name + " hit " + enemy.name + " with " + hit + " damage.");
        this.log(this);
        this.log(enemy);
    }

    private void log(Character character) {
        System.out.println(character.getName() + ": " + "hp=" + character.getHp());
    }
}
