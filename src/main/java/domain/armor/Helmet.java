package domain.armor;

public class Helmet extends Armor {

    public Helmet(int weight, double cost) {
        super(weight, cost);
    }

    @Override
    public String toString() {
        return "Helmet{ " + "weight = " + getWeight() +
                " cost = " + getCost() + " }";
    }
}
