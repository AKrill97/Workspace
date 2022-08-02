package robots_battle;

import java.util.Scanner;

public class InputScanner { //necessary class for scanner in program
    public static String getLetterFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
