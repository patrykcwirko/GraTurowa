package Classes;

public class Warrior implements Classes{
    private int Strenth;
    private int Dexterity;
    private int Inteligent;
    private int Vitallyty;
    private int Speed;

    public Warrior() {
        this.Strenth = 15;
        this.Dexterity = 8;
        this.Inteligent = 5;
        this.Vitallyty = 12;
        this.Speed = 5;
    }

    public int getDexterity() {
        return Dexterity;
    }
    public int getInteligent() {
        return Inteligent;
    }
    public int getStrenth() {
        return Strenth;
    }
    public int getVitallyty() {
        return Vitallyty;
    }
    public int getSpeed() {
        return Speed;
    }

    @Override
    public void setPrimalStat(int primalStat) {
        setStrenth(primalStat);
    }

    @Override
    public void setDefensStat(int defensStat) {
        setInteligent(defensStat);
    }

    @Override
    public void setSecondaryStat(int secondaryStat) {
        setDexterity(secondaryStat);
    }

    public void setDexterity(int dexterity) {
        Dexterity = dexterity;
    }
    public void setInteligent(int inteligent) {
        Inteligent = inteligent;
    }
    public void setStrenth(int strenth) {
        Strenth = strenth;
    }
    public void setVitallyty(int vitallyty) {
        Vitallyty = vitallyty;
    }
    public void setSpeed(int speed) {
        Speed = speed;
    }

    public String getClassName() {
        return "Warior";
    }

    @Override
    public int getPrimalStat() {
        return this.Strenth;
    }

    @Override
    public int getDefensStat() {
        return this.Inteligent;
    }

    @Override
    public int getSecondaryStat() {
        return this.Dexterity;
    }
}
