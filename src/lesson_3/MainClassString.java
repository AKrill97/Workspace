package lesson_3;

public class MainClassString {
    public static void main(String[] args) {
        String testString = " Test2";
        System.out.println("Size = " + testString.length());
        char[] testStringChar = testString.toCharArray();
        for (int i = 0; i < testStringChar.length; i++) {
            System.out.print(testStringChar[i]);
        }
        System.out.println();
        System.out.println(" ----- ");
        System.out.println(testString.toUpperCase());
        System.out.println(testString.toLowerCase());
        String newStringTest = testString.toLowerCase();
        System.out.println(newStringTest);
        System.out.println(testString.substring(1,5));
        System.out.println("'" + testString.trim()+ "'");

        String testString2 = new String(" Test2");
        if (testString.equalsIgnoreCase(testString2)) {
            System.out.println("Eq");
        } else {
            System.out.println("Not Eq");
        }

        String test = "test1;Test2;Test3";
        String[] textSplit = test.split(";");

        System.out.println(test.replace(";","-"));

        System.out.println(test.trim().toUpperCase().split(";")[0].substring(0,5));
    }
}
