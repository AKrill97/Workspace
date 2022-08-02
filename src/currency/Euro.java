package currency;

public class Euro extends Currency implements IsFreeConverted{
    public Euro(double kursNBU) {
        super(kursNBU);
    }

    @Override
    String getCurrencyName() {
        return "EURO";
    }

    @Override
    public boolean isFreeConv() {
        return true;
    }
}
