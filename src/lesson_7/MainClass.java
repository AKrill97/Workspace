package lesson_7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainClass {
    public static void main(String[] args) {
        double var = 415.1455412;
        BigDecimal bigDecimal = BigDecimal.valueOf(var);
        System.out.println(bigDecimal.setScale(3, RoundingMode.valueOf(4)));
        System.out.println(bigDecimal.setScale(4, RoundingMode.valueOf(5)));
    }
}
