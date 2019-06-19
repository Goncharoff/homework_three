package service;

import domain.Knight;
import domain.armor.Armor;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class KnightService {
    private Knight knight;

    public KnightService(Knight knight) {
        this.knight = knight;
    }

    public void sortByWeight() {
        Collections.sort(knight.getEquipment(), Comparator.comparingInt(Armor::getWeight));
    }

    public void sortByCost() {
        Collections.sort(knight.getEquipment(), Comparator.comparing(Armor::getCost));
    }

    public void findByInterval(int from, int to) {
        if (to < from) {
            throw new IllegalArgumentException("To must be more than from");
        }

        List<Armor> result = knight.getEquipment().stream()
                .filter(it -> (it.getCost() >= from && it.getCost() <= to))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
