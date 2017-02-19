package PlasticCards;

/**

 */
public class MainClassCard {
    public static void main(String[] args) {
        Electron electron = new Electron();
        System.out.println("Electron card has " + electron.getCountCurrency() + " currency");

        Classic classic = new Classic();
        System.out.println("Classic card has " + classic.getColor() + " color");

        Gold gold = new Gold();
        System.out.println("Gold card has " + gold.getColor() + " color");
        gold.performVipOperations();
    }
}
