package lesson_2;

public class MainClass {
    public static void main(String[] args) {
        CalcClass calc = new CalcClass();

        int rez_1 = calc.sumDoubled(5, 9);
        System.out.println("Rez_1 = " + rez_1);

        String rez_2 = calc.sumDoubled("test", "text");
        System.out.println("Rez_2 = " + rez_2);

        int rez_3 = calc.sumDoubled("1", 5);
        System.out.println("Rez_3 = " + rez_3);

        int rez_4 = calc.multiplicationDoubled(5, 5);
        System.out.println("Rez_4 = " + rez_4);

        int rez_5 = calc.divisionDoubled(12, 3);
        System.out.println("Rez_5 = " + rez_5);

        double rez_6 = calc.divisionDoubled(0.0, 0);
        System.out.println("Rez_6 = " + rez_6);

        int[] array = {};
        WorkWithMassive workWithMassive = new WorkWithMassive();
        workWithMassive.analyzwMassive(array, 0);
    }
}
