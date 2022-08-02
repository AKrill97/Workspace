package currency;

public class Bitcoin extends Currency implements IsCryptoCurrency {
    public Bitcoin(double kursNBU) {
        super(kursNBU);
    }

    @Override
    public boolean cryptoCurrency() {
        return true;
    }

    @Override
    String getCurrencyName() {
        return "Bitcoin";
    }

    @Override
    public double exchangeGrnToCurrency(double numberOfGrn) {
        System.out.println("This type of transaction is not allowed by NBU");
        return numberOfGrn;
    }
}
