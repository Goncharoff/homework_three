package domain.armor;

import java.util.Objects;

public abstract class Armor implements Equipment {
    private Integer weight;
    private double cost;

    public Armor(int weight, double cost) {
        this.weight = weight;
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public int getWeight() {
        return weight;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Armor armor = (Armor) o;
        return Double.compare(armor.cost, cost) == 0 &&
                Objects.equals(weight, armor.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, cost);
    }


}
