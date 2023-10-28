public class Unit {
    protected String name = "Vova";
    protected int health = 100;
    protected int defendce = 100;
    protected int power = 10;


    protected float Crit = 0.1f;
    protected float Parry = 0.1f;
    public Unit(String name) {
        this.name = name;
        //Game.CountOfPlayers();
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public int getDefendce() {
        return defendce;
    }

    public void setDefendce(int defendce) {
        this.defendce = defendce;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public float getCrit() {
        return Crit;
    }

    public void setCrit(float crit) {
        Crit = crit;
    }

    public float getParry() {
        return Parry;
    }

    public void setParry(float parry) {
        Parry = parry;
    }

    public void attack(Unit unit){
        unit.getDamage(power);
    }
    public void getDamage(int damage) {
        this.health -= damage;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "health=" + health +
                ", defendce=" + defendce +
                ", power=" + power +
                '}';
    }
    public void print() {
        System.out.println(this);
    }
    public void print(String str) {
        System.out.println(this);
    }
}
