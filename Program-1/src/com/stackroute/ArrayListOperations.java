package com.stackroute;
import java.util.ArrayList;
import java.util.List;
//this class contains a method to add,update and remove elements from a list
public class ArrayListOperations{
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        //adding elements to list
        arrayList.add("Apple");
        arrayList.add("Grape");
        arrayList.add("Melon");
        arrayList.add("Berry");

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
