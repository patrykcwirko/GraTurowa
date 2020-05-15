package Classes;

public class Mage implements Classes{
    private int Strenth;
    private int Dexterity;
    private int Inteligent;
    private int Vitallyty;
    private int Speed;

    public Mage() {
        this.Strenth = 5;
        this.Dexterity = 12;
        this.Inteligent = 15;
        this.Vitallyty = 8;
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
        setInteligent(primalStat);
    }

    @Override
    public void setDefensStat(int defensStat) {
        setStrenth(defensStat);
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
        return "Mage";
    }

    @Override
    public int getPrimalStat() {
        return this.Inteligent;
    }

    @Override
    public int getDefensStat() {
        return this.Strenth;
    }

    @Override
    public int getSecondaryStat() {
        return this.Dexterity;
    }
}
