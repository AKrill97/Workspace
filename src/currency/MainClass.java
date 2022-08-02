package currency;

public class MainClass {
    public static void main(String[] args) {
        Dollar dollar = new Dollar(29.25);
        System.out.println("Dollar = " + dollar.getKursNBU());
        System.out.println("New kurs = " + dollar.getKursNBU());
        dollar.exchangeGrnToCurrency(4015);

        dollar.exchangeCurrencyToGrn(1000);
        dollar.setMarga(1.15);
        dollar.exchangeCurrencyToGrn(1000);

        Euro euro = new Euro(38);
        euro.exchangeCurrencyToGrn(1000);

        Bitcoin bitcoin = new Bitcoin(20000);
        bitcoin.exchangeCurrencyToGrn(10);
        bitcoin.exchangeGrnToCurrency(2000);

    }
}
