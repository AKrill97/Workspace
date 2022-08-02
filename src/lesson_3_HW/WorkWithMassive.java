package lesson_3_HW;

public class WorkWithMassive {
    public int[][] creatingAndFillingArray(int arrayHeight, int arrayWeight, int number) {
        arrayHeight = checkArrayValue(arrayHeight);
        arrayWeight = checkArrayValue(arrayWeight);
        int[][] array = new int[arrayHeight][arrayWeight];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = number;
            }
        }
        printArray(array);
        return array;
    }
    public int checkArrayValue(int value) {
        if (value == 0) {
            System.out.println("Value cannot be 0. \"" + value + "\" was changed to \"1\"");
            value = 1;
            return value;
        } else if (value < 0) {
            System.out.println("Value cannot be negative. \"" + value + "\" was changed to \"" + Math.abs(value) + "\"");
            value = Math.abs(value);
            return value;
        } else {
            return value;
        }
    }

    public int[][] fillingOfLeftDiagonal(int[][] array, int number) {
        try {
            if (!isArraySquare(array)) {
                return array;
            }
            for (int i = 0; i < array.length; i++) {
                array[i][i] = number;
            }
            printArray(array);
            return array;
        } catch (NullPointerException e) {
            System.out.println("An array contains 'null'");
            return array;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return array;
        }
    }

    public int[][] fillingOfRightDiagonal(int[][] array, int number) {
        try {
            if (!isArraySquare(array)) {
                return array;
            }
            for (int i = 0; i < array.length; i++) {
                array[i][(array[i].length - 1) - i] = number;
            }
            printArray(array);
            return array;
        } catch (NullPointerException e) {
            System.out.println("An array contains 'null'");
            return array;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return array;
        }
    }
    public int[][] fillingBothDiagonal(int[][] array, int number) {
        try {
            fillingOfLeftDiagonal(array, number);
            fillingOfRightDiagonal(array, number);
            return array;
        } catch (NullPointerException e) {
            System.out.println("An array contains 'null'");
            return array;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return array;
        }
    }

    public void printArray(int[][] array) {
        if (isArrayEmpty(array)) {
            System.out.println("Array is empty!");
        } else {
            System.out.println("-----");
            for (int[] ints : array) {
                for (int j = 0; j < ints.length; j++) {
                    System.out.print(ints[j] + " ");
                }
                System.out.println();
            }
            System.out.println("-----");
        }
    }
    public boolean isArraySquare(int[][] array) {
        if (array.length == 1) {
            System.out.println("Array is not square");
            return false;
        }
        for (int[] ints : array) {
            if (array.length != ints.length) {
                System.out.println("Array is not square");
                return false;
            }
        }
        return true;
    }

    public boolean isArrayEmpty(int[][] array) {
        if (array.length == 0) {
            return true;
        } else {
            return false;
        }
    }
}
