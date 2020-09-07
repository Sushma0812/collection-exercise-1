package com.stackroute;
import java.util.ArrayList;
import java.util.List;

public class SumOfElements {
    //this method is used to add all elements of two lists and display sum of the two lists
    public static List<Integer> getSumOfListElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> integerListOne = new ArrayList<>();
        integerListOne.addAll(firstList);
        System.out.println("First list elements " + integerListOne);
        List<Integer> integerListTwo = new ArrayList<>();
        integerListTwo.addAll(secondList);
        System.out.println("Second list elements " + integerListTwo);
        List<Integer> integerListThree = new ArrayList<>();
        integerListThree.addAll(firstList);
        integerListThree.addAll(secondList);
        System.out.println("Total elements in list" + integerListThree);
        int sum = 0;
        for (int i : integerListThree) {
            sum = sum + i;
        }
        System.out.println("Sum of elements of two lists " + sum);
        int sumOne=0;
        List<Integer> integerList = new ArrayList<>();

        if (integerListOne.size() == integerListTwo.size()) {
            for (int i = 0; i < integerListOne.size(); i++) {
                integerList.add(i, integerListOne.get(i) + integerListTwo.get(i));
            }
            System.out.println(integerList);
        }
        else if(integerListOne.size()>integerListTwo.size()){
            System.out.println(integerListOne);

        }
        else if(integerListTwo.size()>integerListOne.size()){
            System.out.println(integerListTwo);

        }
        else{
            System.out.println("List is empty");
        }
        return null;
    }

    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>();
        SumOfElements addList = null;
        firstList.add(1);
        firstList.add(3);
        firstList.add(5);
        firstList.add(8);
        List<Integer> secondList = new ArrayList<>();
        secondList.add(6);
        secondList.add(7);
        secondList.add(9);
        addList.getSumOfListElements(firstList, secondList);


    }

}
