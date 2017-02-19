package PlasticCards;

/**
 * создание дочерней карты типа Gold
 */
public class Gold extends Classic{
    public Gold() {
        System.out.println("Gold card constructor");

        hasChip = true;
        allowInternetTransactions = true;
        color = "gold";
        countCurrency = 3;
    }

    public void performVipOperations() {
        System.out.println("VIP operations performed");
    }

}
