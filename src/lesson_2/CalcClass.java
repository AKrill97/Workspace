package lesson_2;

public class CalcClass {

    // The method is user to addition got integer values and double them
    public int sumDoubled(int firstInt, int secondInt) {
        return ((firstInt + secondInt) * 2);
    }

    // The method is user to addition got string and integer values and double them
    public int sumDoubled(String string, int integer) {
        try {
            return (Integer.parseInt(string) + integer) * 2;
        } catch (NumberFormatException e) {
            System.out.println("Error: String value must contain only numbers");
            return 88888;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return 99999;
        }
    }

    // The method is user to addition got string values and double them
    public String sumDoubled(String firstString, String secondString) {
        String tempResult = firstString + secondString;
        return (tempResult + tempResult);
    }

    //The method is used to multiply got int values and double them
    public int multiplicationDoubled(int firstInt, int secondInt) {
        return ((firstInt * secondInt) * 2);
    }

    //The method is used to divide got int values and double them
    public int divisionDoubled(int firstInt, int secondInt) {
        try {
            return (firstInt / secondInt * 2);
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide on zero");
            return 88888;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return 99999;
        }
    }

    //The method is used to divide got doubled values and double them
    public double divisionDoubled(double firstDouble, double secondDouble) {
        if (secondDouble == 0d) {
            System.out.println("You cannot divide on zero");
            return 88888;
        }

        try {
            double tempRezult = firstDouble / secondDouble;
            return (tempRezult * 2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return 99999;
        }
    }
}
