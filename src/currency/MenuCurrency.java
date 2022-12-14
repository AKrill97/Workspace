package currency;

public class MenuCurrency extends Menu {
    public static void printCurrencyMenu() {
        System.out.println("");
        System.out.println("Choose currency:");
        System.out.println("1. Dollar");
        System.out.println("2. Euro");
        System.out.println("3. Uz Som");
        System.out.println("100: for Exit");
        System.out.println("Enter your choice:");
    }


    public static Currency setCurrency(int currencyNumber) {
        Currency tempCurrency;
        switch (currencyNumber) {
            case 1:
                tempCurrency = ListOfCurrency.getCurrencyHashMap().get("USD");
                break;
            case 2:
                tempCurrency = ListOfCurrency.getCurrencyHashMap().get("EURO");
                break;
            case 3:
                tempCurrency = ListOfCurrency.getCurrencyHashMap().get("Uz Som");
                break;
            default:
                tempCurrency = ListOfCurrency.getCurrencyHashMap().get("USD");
                System.out.println("Default currency : Dollar");
        }
        return tempCurrency;
    }
}
