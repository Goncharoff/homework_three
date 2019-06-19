package domain.armor;

public class Weapon extends Armor {

    public Weapon(int weight, double cost) {
        super(weight, cost);
    }

    @Override
    public String toString() {
        return "Weapon{ " + "weight = " + getWeight() +
                " cost = " + getCost() + " }";
    }
}
