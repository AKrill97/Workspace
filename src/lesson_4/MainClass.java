package lesson_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
//        List<String> ourList = new ArrayList();
//        System.out.println(ourList);
//        ourList.add("Test1");
//        System.out.println(ourList);
//        ourList.add("Test2");
//        ourList.add("Test3");
//        System.out.println(ourList);
//        ourList.add("");
//        ourList.add("Test5");
//        System.out.println(ourList);
//        System.out.println(ourList.get(3));
//        ourList.remove(1);
//        System.out.println(ourList);
//        for (Object s : ourList) {
//            System.out.println(s);
//        }
//        ourList.add(2,"Test31");
//        System.out.println(ourList);

//        ArrayList<Integer> ourListInteger = new ArrayList();
//        ourListInteger.add(22);
//        ourListInteger.add(33);
//        ourListInteger.add(66);
//        ourListInteger.add(11);
//        System.out.println(ourListInteger);

        System.out.println("-----ListList-----");
        ArrayList<ArrayList<String>> listList = new ArrayList<>();
        listList.add(new ArrayList<>());
        listList.get(0).add("Test11");
        listList.get(0).add("Test12");
        System.out.println(listList);
        listList.add(new ArrayList<>());
        listList.get(1).add("Test21");
        System.out.println(listList);
        listList.add(new ArrayList<>());
        listList.add(new ArrayList<>());
        listList.get(3).add("Test41");
        System.out.println(listList);
        listList.get(0).add(0,"Text13");
        System.out.println(listList);

        ArrayList<String> list = new ArrayList<>();
        list.add("list1");
        list.add("list2");

        listList.add(list);
        System.out.println(listList);
        listList.add(new ArrayList<>());
        listList.get(5).addAll(list);
        list.add("list3");
        System.out.println(list);
        System.out.println(listList);

        System.out.println("-- The End --");
    }
}
