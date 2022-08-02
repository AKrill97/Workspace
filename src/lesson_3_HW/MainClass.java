package lesson_3_HW;

public class MainClass {
    public static void main(String[] args) {
        WorkWithMassive workWithMassive = new WorkWithMassive();
        int[][] myArray = workWithMassive.creatingAndFillingArray(-2,0,1);
        myArray = workWithMassive.fillingBothDiagonal(myArray, 5);
        myArray = workWithMassive.fillingOfLeftDiagonal(myArray, 8);
        myArray = workWithMassive.fillingOfRightDiagonal(myArray, 9);

        String test_String = " Test_String ";
        String test_StringBuffer;
        test_StringBuffer = test_String.trim();
        System.out.println(test_StringBuffer);
        test_StringBuffer = test_String.substring(1,5);
        System.out.println(test_StringBuffer);
        if (test_String.startsWith("t") || test_String.startsWith("T")) {
            System.out.println("First symbol is 'T'");
        }
        test_StringBuffer = test_String.replaceFirst("s", "y");
        System.out.println(test_StringBuffer);
    }
}
