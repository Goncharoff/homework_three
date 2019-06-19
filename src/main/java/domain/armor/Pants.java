package domain.armor;

public class Pants extends Armor {

    public Pants(int weight, double cost) {
        super(weight, cost);
    }

    @Override
    public String toString() {
        return "Past{ " + "weight = " + getWeight() +
                " cost = " + getCost() + " }";
    }
}
