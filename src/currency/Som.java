package currency;

public class Som extends Currency implements IsFreeConverted {
    public Som(double kursNBU) {
        super(kursNBU);
    }

    @Override
    String getCurrencyName() {
        return "Uz Som";
    }

    @Override
    public boolean isFreeConv() {
        return false;
    }
}
