package com.stackroute;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
//this class contains a method to display elements in array list and search the element in the list
public class SearchElementInList {
    //adding elements to the list
    public static List<String> addFruits(List<String> array) {
        List<String> stringList = new ArrayList<>();
        stringList.addAll(array);
        System.out.println(stringList);
        return stringList;
    }
    //case sensitive search of an element in the list
    public static int serachFruitlnList(List<String> array, String key) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == key) {
                return i;
            }
        }
        return -1;
    }
    //case insensitive search of an desired element in a list
    public static int serachFruitlnListIgnoreCase(List<String> array, String key) {
        for (int i = 0; i < array.size(); i++) {
            if (key.equalsIgnoreCase(array.get(i))) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        int listSize = reader.nextInt();
        for(int i=0; i<listSize; i++){
            String names = reader.next();
            stringList.add(names)
        }
        //reads search element from user
        System.out.println("Enter search element");
        String key = reader.nextLine();
        int valueOne = serachFruitlnList(stringList, "mango");
        if (valueOne == -1) {
            System.out.println("Not found");
        }
        else {
            System.out.println("Element index " + valueOne);
        }
        int valueTwo = serachFruitlnListIgnoreCase(stringList, "aPple");
        if (valueTwo == -1) {
            System.out.println("Not found");
        }
        else {
            System.out.println("Element index " + valueTwo);
        }
    }
}
