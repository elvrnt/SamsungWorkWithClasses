
class Main {
    public static void main(String[] args) {
        Unit unit1 = new Unit("sasha");
        Unit unit2 = new Unit("Dolbaeb");

        unit1.attack(unit2);

        unit2.attack(unit1);

        unit1.print();
        unit2.print("ladno: ");

        Wizard wizard1 = new Wizard("W1");
        Wizard wizard2 = new Wizard("W1");
        wizard2.attack(wizard1);
        System.out.println(wizard1);
        System.out.println(wizard2);
    }
}