package currency;

public class CurrencyExchange {
    public static void main(String[] args) {
        Dollar dollar = new Dollar(36);
        Som som = new Som(0.0027);
        Bitcoin bitcoin = new Bitcoin(600000);
        Currency workingCurrency;

        ListOfCurrency.addCurrency(dollar);
        ListOfCurrency.addCurrency(som);
        ListOfCurrency.addCurrency(new Euro(38));
        final int EXIT_NUMBER = 100;
        int currencyNumber;

        do {
            MenuCurrency.printCurrencyMenu();
            currencyNumber = MenuCurrency.getNumberFromConsole();
            if (currencyNumber == 0) {
                System.out.println("Wrong value, try again!!");
                continue;
            } else if (currencyNumber != EXIT_NUMBER) {
                workingCurrency = MenuCurrency.setCurrency(currencyNumber);

                boolean exitFromActionsMenu;
                do {
                    MenuActions.printActionsMenu(workingCurrency);
                    int menuNumber = MenuActions.getNumberFromConsole();
                    exitFromActionsMenu = menuNumber != EXIT_NUMBER;
                    if (exitFromActionsMenu) {
                        MenuActions.doActionsWithCurrency(workingCurrency, menuNumber);
                    }

                } while (exitFromActionsMenu);
            }
        } while (currencyNumber != EXIT_NUMBER);

        System.out.println("-- Goodbye! --");
    }
}
