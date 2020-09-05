package com.stackroute;

import java.util.*;

public class SortedSetToList {

    public static void main(String[] args) {
        SortedSet<String> string = new TreeSet<String>();
        string.add("Harry");
        string.add("Olive");
        string.add("Alice");
        string.add("Bluto");
        string.add("Eugene");
        Iterator<String> i = string.iterator();
        {
            while (i.hasNext()) {
                System.out.print(i.next());
                System.out.print(" ");
            }
        }
        List<String> list = new ArrayList<String>();
        for (String names : string)
            list.add(names);
        System.out.println(" ");
        System.out.println("Set to ArrayList ");
        for (String names : list) {
            System.out.print(names);
            System.out.print(" ");
        }


    }
}
