package PlasticCards;

/**
 * создание дочерней карты типа Classic
 */
public class Classic extends Electron{
        public Classic() {
            System.out.println("Classic card constructor");

            hasChip = true;
            allowInternetTransactions = true;
            color = "silver";
            countCurrency = 2;
        }
}
