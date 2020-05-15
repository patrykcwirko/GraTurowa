package Classes;

public class Archer implements Classes{
    private int Strenth;
    private int Dexterity;
    private int Inteligent;
    private int Vitallyty;
    private int Speed;

    public Archer() {
        this.Strenth = 10;
        this.Dexterity = 12;
        this.Inteligent = 8;
        this.Vitallyty = 5;
        this.Speed = 15;
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
        setStrenth(defensStat);
    }

    @Override
    public void setSecondaryStat(int secondaryStat) {
        setInteligent(secondaryStat);
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
        return "Archer";
    }

    @Override
    public int getPrimalStat() {
        return this.Dexterity;
    }

    @Override
    public int getDefensStat() {
        return this.Strenth;
    }

    @Override
    public int getSecondaryStat() {
        return this.Inteligent;
    }
}
