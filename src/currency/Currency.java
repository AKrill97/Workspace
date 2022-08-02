package currency;

import java.text.DecimalFormat;

abstract class Currency {
    private double kursNBU;
    private double marga = 1.1;
    DecimalFormat df = new DecimalFormat("0.000");

    public Currency(double kursNBU) {
        this.kursNBU = kursNBU;
        setMarga(marga);
    }

    public double getKursNBU() {
        return kursNBU;
    }

    public void setKursNBU(double kursNBU) {
        this.kursNBU = kursNBU;
    }

    public double getMarga() {
        return marga;
    }

    public void setMarga(double marga) {
        this.marga = marga;

        if (!(this instanceof IsFreeConverted)) {
            this.marga = marga * 1.2;
            System.out.println("This is NOT real currency! ");
            System.out.println("So marga is changed. Current marga = " + df.format(getMarga()));
        } else {
            if (!((IsFreeConverted) this).isFreeConv()) {
                this.marga = marga * 1.1;
                System.out.println("This is NOT free converted currency! ");
                System.out.println("So marga is changed. Current marga = " + df.format(getMarga()));
            }
        }
    }

    private double getKursBuy() {
        return kursNBU * marga;
    }

    private double getKursSell() {
        return kursNBU / marga;
    }

    abstract String getCurrencyName();

    public double exchangeGrnToCurrency(double numberOfGrn) {
        double result = numberOfGrn / getKursBuy();
        System.out.printf("For %s Grn you get %s %s by kurs %s (marga %s)%n", numberOfGrn, df.format(result), getCurrencyName(), df.format(getKursBuy()), marga);
        return result;
    }

    public double exchangeCurrencyToGrn(double numberOfCurrency) {
        double result = numberOfCurrency * getKursSell();
        System.out.printf("For %s %s you get %s Grn by kurs %s (marga %s)%n", numberOfCurrency, getCurrencyName(), df.format(result), df.format(getKursBuy()), marga);
        return result;
    }

}
