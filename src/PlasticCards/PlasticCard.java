package PlasticCards;

/**
 * родительский класс по созданию пластиковой карты
 */
public class PlasticCard {
    protected boolean hasChip;
    protected boolean allowInternetTransactions;
    protected String color;
    protected int countCurrency;

    public PlasticCard() {
        System.out.println("Card constructor");
    }

    public boolean isHasChip() {
        return false;
    }

    public boolean isAllowInternetTransactions() {
        return false;
    }

    public String getColor() {
        return color;
    }

    public int getCountCurrency() {
        return countCurrency;
    }

}
