import domain.Knight;
import domain.armor.*;
import service.KnightService;

public class Application {
    public static void main(String[] args) {
        Boots boots = new Boots(10, 100);
        Chest chest = new Chest(9, 110);
        Helmet helmet = new Helmet(8, 120);
        Pants pants = new Pants(7, 130);
        Weapon weapon = new Weapon(6, 140);

        Knight knight = new Knight.Builder()
                .boots(boots)
                .chest(chest)
                .helmet(helmet)
                .pants(pants)
                .weapon(weapon)
                .build();


        KnightService knightService = new KnightService(knight);
        knightService.sortByCost();
        knight.printEqupment();
        knightService.sortByWeight();
        knight.printEqupment();

        knightService.findByInterval(110, 120);
    }
}
