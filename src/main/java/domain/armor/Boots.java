package domain.armor;

public class Boots extends Armor {

    public Boots(int weight, double cost) {
        super(weight, cost);
    }

    @Override
    public String toString() {
        return "Boots{ " + "weight = " + getWeight() +
                " cost = " + getCost() + " }";
    }
}
