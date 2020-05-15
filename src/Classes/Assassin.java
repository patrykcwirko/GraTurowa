package Classes;

public class Assassin implements Classes{
    private int Strenth;
    private int Dexterity;
    private int Inteligent;
    private int Vitallyty;
    private int Speed;

    public Assassin() {
        this.Strenth = 5;
        this.Dexterity = 15;
        this.Inteligent = 10;
        this.Vitallyty = 10;
        this.Speed = 10;
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
        setDexterity(primalStat);
    }

    @Override
    public void setDefensStat(int defensStat) {
        setInteligent(defensStat);
    }

    @Override
    public void setSecondaryStat(int secondaryStat) {
        setStrenth(secondaryStat);
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
        return "Assassin";
    }

    @Override
    public int getPrimalStat() {
        return this.Dexterity;
    }

    @Override
    public int getDefensStat() {
        return this.Inteligent;
    }

    @Override
    public int getSecondaryStat() {
        return this.Strenth;
    }
}
