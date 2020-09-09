package com.stackroute;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//this class contains a method to add,update and remove elements from a list
public class ArrayListOperations{
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        int listSize = scanner.nextInt();
        //reads elements from the user
        for(int i=0; i<listSize; i++){
            String names = scanner.next();
            arrayList.add(names)
        }
        //display the elements
        System.out.println(arrayList);
        //update the element in the list
        arrayList.set(0,"Kiwi");
        //display the updated list
        System.out.println(arrayList);
        //removing all the elements from the list
        arrayList.clear();
        //display the list
        System.out.println(arrayList);
    }
}
