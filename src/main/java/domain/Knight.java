package domain;

import domain.armor.*;

import java.util.ArrayList;
import java.util.List;

public class Knight {
    private String name;
    private final Boots boots;
    private final Chest chest;
    private final Helmet helmet;
    private final Pants pants;
    private final Weapon weapon;
    private List<Armor> equipment = new ArrayList<>();

    public static class Builder {
        private Boots boots;
        private Chest chest;
        private Helmet helmet;
        private Pants pants;
        private Weapon weapon;

        public Builder boots(Boots boots) {
            this.boots = boots;
            return this;
        }

        public Builder chest(Chest chest) {
            this.chest = chest;
            return this;
        }

        public Builder helmet(Helmet helmet) {
            this.helmet = helmet;
            return this;
        }

        public Builder pants(Pants pants) {
            this.pants = pants;
            return this;
        }

        public Builder weapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        public Knight build() {
            return new Knight(this);
        }
    }

    private Knight(Builder builder) {
        this.boots = builder.boots;
        this.chest = builder.chest;
        this.helmet = builder.helmet;
        this.pants = builder.pants;
        this.weapon = builder.weapon;
        equipment.add(this.boots);
        equipment.add(this.chest);
        equipment.add(this.helmet);
        equipment.add(this.pants);
        equipment.add(this.weapon);
    }

    public List<Armor> getEquipment() {
        return equipment;
    }

    public void printEqupment(){
        System.out.println(equipment);
    }

    @Override
    public String toString() {
        return "Knight{" +
                "name='" + name + '\'' +
                ", boots=" + boots +
                ", chest=" + chest +
                ", helmet=" + helmet +
                ", pants=" + pants +
                ", weapon=" + weapon +
                ", equipment=" + equipment +
                '}';
    }
}
