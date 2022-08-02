package lesson_1;

public class MainClass {
    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 10;
        Calc.sum(var1, var2);

        Calc calc = new Calc();
        System.out.println(calc.sumDoubled(var1, 7) + 6);

        System.out.println(calc.sumDoubled(calc.sumDoubled(var1, 7), 6));

        calc.sumDoubled("Test ", "pass");

        System.out.println("---- The End ----");
    }
}
