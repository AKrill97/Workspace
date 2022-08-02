package lesson_1;

public class Calc {
    public static void sum(int firstInt, int secondInt) {
        System.out.println("Result of method sum = " + (firstInt + secondInt));
    }

    public int sumDoubled(int firstInt, int secondInt){
        int tempResult = (firstInt + secondInt) * 2;
        System.out.println("Result doubled = " + tempResult);
        return tempResult;
    }

    public String sumDoubled(String firstString, String secondString) {
        String tempResult = firstString + secondString + firstString + secondString;
        System.out.println(tempResult);
        return tempResult;
    }
}
