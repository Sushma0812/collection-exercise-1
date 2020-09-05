package com.stackroute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Catalog {

    //this method is used to find the element in the sorted list
    public static void catlogListSearch(List<String> string) {
        System.out.println("Enter desired element");
        Scanner reader = new Scanner(System.in);
        String value;
        value = reader.next();
        if (string.contains(value)) {
            System.out.println("Found " + value);
        } else if (string.contains("null") || string.contains(" ")) {
            System.out.println("The catalog List contains empty or null or blank space as a value");
        } else if (value == "null") {
            System.out.println("Input is not accepted");
        } else if (string.isEmpty()) {
            System.out.println("The catalog list is empty");
        } else {
            System.out.println("Not found" + value);
        }

    }

    //this method is used to sort the elements in the list
    public static List<String> catalogListSorter(List<String> string) {
        boolean valueOne = string.contains(" ");
        boolean valueTwo = string.contains("null");
        if (valueOne == true || valueTwo == true) {
            System.out.println("It is an empty");
        } else {
            Collections.sort(string);
        }
        return string;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        List<String> string = new ArrayList<>();
        //SearchElementInList searchList = null;
        System.out.println("Enter elements");
        for (int i = 0; i < 3; i++) {
            String j = reader.nextLine();
            string.add(j);
        }
        List<String> stringList = new ArrayList<>();
        stringList = catalogListSorter(string);
        System.out.println(stringList);
        catlogListSearch(stringList);

    }
}
