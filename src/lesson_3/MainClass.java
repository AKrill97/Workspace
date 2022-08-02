package lesson_3;

public class MainClass {
    public static void main(String[] args) {
        int[][] massive = {{1,2,3},{4,5,6}, {7,8,9}, {10,11}};
//
//        System.out.println("Rows = " + massive.length);
//        System.out.println("Line2 = " + massive[1].length);
//        System.out.println("Element = " + massive[2][2]);
//
        printMassive(massive);

        int [][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 5;
            }
        }
        printMassive(array);
    }

    private static void printMassive(int[][] array) {
        System.out.println(" ----- ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ----- ");
    }
}
