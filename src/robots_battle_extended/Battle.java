package robots_battle_extended;

import java.util.ArrayList;

public class Battle extends InputScanner {
    public static void main(String[] args) {
        System.out.println("Prepare your robots!");
        System.out.println("Enter number of robots (min - 2, max - 5)");
        int numberOfRobots = getNumberOfRobotsFromConsole(SetListsAndMaps.setNumberOfRobotsList());

        ArrayList<Robot> robotList = new ArrayList<>();
        for (int i = 1; i <= numberOfRobots; i++) {
            System.out.println("Enter name for robot#" + i);
            robotList.add(new Robot(getStringFromConsole()));
        }

        BattlePhase battlePhase = new BattlePhase(); //1 hitLetterMap и usedLetterMap недостаточно для войны против 4+ роботов
        do {
            String hitLetter = battlePhase.prepareForHit(robotList);
            if (hitLetter.equals("P")) {
                break;
            }
            if (robotList.get(1).getUsedLetterMap().get(hitLetter)) {
                System.out.println("Key is not active");
            } else {
                battlePhase.hitAction(hitLetter, robotList);
                if (robotList.get(0).getHealth() <= 0) {
                    System.out.println(robotList.get(0).getName() + " was killed!");
                    robotList.remove(0);
                } else {
                    battlePhase.swapRobotsInList(robotList);
                }
            }
            battlePhase.printRobotsHealth(robotList);
        } while (robotList.size() > 1);

        if (robotList.size() == 1) {
            System.out.println("\n" + robotList.get(0).getName() + " is Win!!! Congratulations!!!");
        }
        System.out.println("\nGame was closed. Thanks for playing!");
    }
}
