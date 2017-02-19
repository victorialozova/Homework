package PlasticCards;

/**
 * создание дочерней карты типа Electron
 */
public class Electron extends PlasticCard {
    public Electron() {
        System.out.println("Electron card constructor");

        hasChip = false;
        allowInternetTransactions = false;
        color = "grey";
        countCurrency = 1;
    }
}
