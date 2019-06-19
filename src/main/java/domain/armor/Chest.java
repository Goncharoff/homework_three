package domain.armor;

public class Chest extends Armor {
    public Chest(int weight, double cost) {
        super(weight, cost);
    }

    @Override
    public String toString() {
        return "Chest{ " + "weight = " + getWeight() +
                " cost = " + getCost() + " }";
    }
}
