package com.stackroute;
import java.util.*;
public class SortedSetToList {
    //this method contains a set to which elements are added and converted it to list
    public static void main(String[] args) {
        SortedSet<String> stringSet = new TreeSet<String>();
        Scanner reader = new Scanner(System.in);
        int stringSetSize = reader.nextInt();
        for(int i=0; i<stringSetSize; i++){
            String names = reader.next();
            stringSet.add(names)
        }
        //displays the elements in the set
        Iterator<String> i = stringSet.iterator();
        {
            while (i.hasNext()) {
                System.out.print(i.next());
                System.out.print(" ");
            }
        }
        //converting set to list
        List<String> list = new ArrayList<String>();
        for (String names : stringSet)
            list.add(names);
        System.out.println(" ");
        System.out.println("Set to ArrayList ");
        for (String names : list) {
            System.out.print(names);
            System.out.print(" ");
        }
    }
}
