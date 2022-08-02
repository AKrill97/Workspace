package lesson_4_HW;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(-5);
        myList.add(0);
        myList.add(55);
        myList.add(4);
        myList.add(-12);
        myList.add(100);
        int someInt = findMaxValueInList(myList);
        System.out.println(someInt);
        System.out.println("------");
        System.out.println(myList);
        myList = reverseList(myList);
    }

    private static int findMaxValueInList(ArrayList<Integer> list) {
        if (list.size() == 0) {
            System.out.println("List is empty");
            return 0;
        }

        int maxValue = list.get(0);
        for (Integer value: list) {
            if (maxValue < value) {
                maxValue = value;
            }
        }
        System.out.println(maxValue);
        return maxValue;
    }

    private static ArrayList<Integer> reverseList(ArrayList<Integer> list) {
        if (list.size() == 0) {
            System.out.println("List is empty");
            return list;
        }

        int listSize = list.size();
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            newList.add(list.get(listSize - 1 - i));
        }
        System.out.println(newList);
        return newList;
    }
}
