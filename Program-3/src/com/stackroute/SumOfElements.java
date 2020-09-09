package com.stackroute;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SumOfElements {
    //this method is used to add all elements of two lists and display sum of the two lists
    public static List<Integer> getSumOfListElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> integerListOne = new ArrayList<>();
        //adding first array elements to another list
        integerListOne.addAll(firstList);
        System.out.println("First list elements " + integerListOne);
        List<Integer> integerListTwo = new ArrayList<>();
        //adding second arrays elements to another list
        integerListTwo.addAll(secondList);
        System.out.println("Second list elements " + integerListTwo);
        //merging the elements in the both lists
        List<Integer> integerListThree = new ArrayList<>();
        integerListThree.addAll(firstList);
        integerListThree.addAll(secondList);
        System.out.println("Total elements in list" + integerListThree);
        int sum = 0;
        //calculating sum of elements in the merged list
        for (int i : integerListThree) {
            sum = sum + i;
        }
        System.out.println("Sum of elements of two lists " + sum);
        int sumOne = 0;
        List<Integer> integerList = new ArrayList<>();
        //adding same index value elements of both the lists if two lists are of equal size
        if (integerListOne.size() == integerListTwo.size()) {
            for (int i = 0; i < integerListOne.size(); i++) {
                integerList.add(i, integerListOne.get(i) + integerListTwo.get(i));
            }
            System.out.println(integerList);
        }
        //if first list size is greater than second lsit then return first list elements
        else if (integerListOne.size() > integerListTwo.size()) {
            System.out.println(integerListOne);
        }
        //if second list size is greater than first list then return second list elements
        else if (integerListTwo.size() > integerListOne.size()) {
            System.out.println(integerListTwo);
        } else {
            System.out.println("List is empty");
        }
        return null;
    }
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>();
        SumOfElements addList = null;
        Scanner scanner = new Scanner(System.in);
        int firstListSize = scanner.nextInt();
        for(int i=0; i<firstListSize; i++){
            firstList.add(i);
        }
        List<Integer> secondList = new ArrayList<>();
        int secondListSize = scanner.nextInt();
        for(int i=0; i<secondListSize; i++){
            secondList.add(i)
        }
        addList.getSumOfListElements(firstList, secondList);
    }
}
