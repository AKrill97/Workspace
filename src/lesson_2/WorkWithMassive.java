package lesson_2;

public class WorkWithMassive {

    //The method is used to compare a number in array with varForComparing value
    public void analyzwMassive(int[] massive, int varForComparing) {
        try {
            for (int i = 0; i < massive.length; i++) {
                if (massive[i] < varForComparing) {
                    System.out.println(massive[i] + " Value is less than " + varForComparing);
                } else if (massive[i] > varForComparing) {
                    System.out.println(massive[i] + " Value is more than " + varForComparing);
                } else {
                    System.out.println(massive[i] + " Value is equal " + varForComparing);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
