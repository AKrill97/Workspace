package lesson_1_HW;

public class MainClass {
    public static void main(String[] args) {
        int var1 = 4;
        int var2 = 7;
        System.out.println(Calc.subtraction(var1, var2));
        Calc calc = new Calc();
        System.out.println(calc.multiplication(var1, var2));
    }
}
