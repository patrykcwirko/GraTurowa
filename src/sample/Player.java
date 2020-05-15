package sample;

import Classes.Classes;

import java.util.Random;

public class Player {
    private int exp;
    private String name;
    private int level;
    private int health;
    private int maxHP=100;
    private Classes clas;
    private int dice;
    private int diceCount;
    private int Defense;


    public Player(String name, Classes clas) {
        this.exp=0;
        this.name = name;
        this.level = 1;
        this.health=maxHP;
        this.clas=clas;
        this.diceCount =1;
        this.dice = 6;
        this.Defense = 0;
    }

    public int getExp() {
        return exp;
    }
    public String getName(){
        return name;
    }
    public int getLevel() {
        return level;
    }
    public int getHealth() {
        return health;
    }
    public Classes getClas(){
        return clas;
    }
    public int getDice() {
        return dice;
    }
    public int getDiceCount() {
        return diceCount;
    }
    public int getDefense() {
        return Defense;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setClas(Classes clas) {
        this.clas = clas;
    }
    public void setDice(int dice) {
        this.dice = dice;
    }
    public void setDiceCount(int diceCount) {
        this.diceCount = diceCount;
    }
    public void setDefense(int defense) {
        Defense = defense;
    }

    int attack(){
        Random rand = new Random();
        Dice dice = new Dice();
        int Crit = 1;
        int CritChans = rand.nextInt(20);
        if (CritChans == 20){
            Crit = 2;
        }
        return dice.roll(this.diceCount, this.dice)*Crit + (clas.getPrimalStat())/4;
    }

    public void configure(){
        this.health =  this.maxHP + this.clas.getVitallyty()/2;
        this.Defense = this.clas.getDefensStat()/4;
    }

    public int nextLevel(int level){
        return (int) ((4 * Math.pow(level,2) ) / 2);
    }

    public void levelUp(){
        System.out.println(this.exp);
        System.out.println(this.level);
        System.out.println(nextLevel(this.level));
        this.exp -= nextLevel(this.level);
        level += 1;
        this.clas.setPrimalStat(this.clas.getPrimalStat()+ 4);
        this.clas.setDefensStat(this.clas.getDefensStat()+ 2);
        this.clas.setSecondaryStat(this.clas.getSecondaryStat() +1);
        this.clas.setVitallyty(this.clas.getVitallyty()+5);
        this.maxHP += 50;
        configure();
    }
}
