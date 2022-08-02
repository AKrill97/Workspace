package robots_battle_extended;

import java.util.ArrayList;

public class BattlePhase extends InputScanner {
    private final ArrayList<String> list = SetListsAndMaps.setArrayList();

    public String prepareForHit(ArrayList<Robot> robotList) {
        System.out.println("\nFor exit press P");
        System.out.printf("%s shot at %s. Press key (QWEASDZXC)\n", robotList.get(1).getName(), robotList.get(0).getName());
        do {
            String value = getStringFromConsole();
            value = value.trim().toUpperCase();
            if (list.contains(value)) {
                return value;
            } else {
                System.out.println("Wrong input. Use only (QWEASDZXC) or \"P\" keys");
            }
        } while (true);
    }

    public void hitAction(String hitLetter, ArrayList<Robot> robotList) {
        if (robotList.get(1).getHitLetterMap().get(hitLetter)) {
            System.out.printf("Good shot! The health of %s is decreased for 20hp\n", robotList.get(0).getName());
            robotList.get(0).damagedHealth();
            robotList.get(1).getUsedLetterMap().put(hitLetter, true);
        } else {
            System.out.println("Key does no damage");
            robotList.get(1).getUsedLetterMap().put(hitLetter, true);
        }
    }

    public void swapRobotsInList(ArrayList<Robot> list) {
        Robot value = list.get(0);
        list.remove(0);
        list.add(value);
    }

    public void printRobotsHealth(ArrayList<Robot> list) {
        for (Robot robot : list) {
            System.out.printf("Robot \"%s\" - %s hp left\n", robot.getName(), robot.getHealth());
        }
    }
}
