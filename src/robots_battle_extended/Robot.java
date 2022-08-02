package robots_battle_extended;

import java.util.HashMap;

public class Robot {
    private final String name;
    private int health = 100;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public void damagedHealth() {
        this.health = this.health - 20;
    }

    private HashMap<String, Boolean> usedLetterMap = SetListsAndMaps.setUsedLetter();
    private HashMap<String, Boolean> hitLetterMap = SetListsAndMaps.setHitLetter();

    public HashMap<String, Boolean> getHitLetterMap() {
        return hitLetterMap;
    }
    public HashMap<String, Boolean> getUsedLetterMap() {
        return usedLetterMap;
    }
}
