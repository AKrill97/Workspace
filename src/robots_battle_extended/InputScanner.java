package robots_battle_extended;

import java.util.ArrayList;
import java.util.Scanner;

public class InputScanner {
    static Scanner scanner = new Scanner(System.in);

    public static String getStringFromConsole() {
        return scanner.next();
    }

    public static int getNumberOfRobotsFromConsole(ArrayList<String> setNumberOfRobotsList) {
        do {
            String value = getStringFromConsole();
            value = value.trim();
            if (setNumberOfRobotsList.contains(value)) {
                return Integer.parseInt(value);
            } else {
                System.out.println("Wrong input. Enter number between 2 and 5 (included)");
            }
        } while (true);
    }
}
