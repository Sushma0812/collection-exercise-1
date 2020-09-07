package com.stackroute;

import java.util.*;

public class Patient {
    public int registrationNumber;
    String name;
    char gender;

    public static class PatientService<Patient> {
        Set<Patient> set = new HashSet<Patient>();

        //this method is used to add patient details
        public static Set<Object> addPatient(int registrationNumber, String name, char gender) {
            Set<Object> set = new HashSet<>();
            set.add(registrationNumber);
            set.add(name);
            set.add(gender);
            System.out.println(set);
            return set;
        }

        //this method is used to search whether patient is present or not using registration number
        public static void searchPatient(Set<Object> setOne, Set<Object> setTwo, int registrationNumber) {
            if (setOne.contains(registrationNumber) || setTwo.contains(registrationNumber)) {
                System.out.println("Patient found");
            } else {
                System.out.println("Patient Not found");
            }
        }

        //this method is used to sort the patient names by using gender
        public static void getAllPatients(Set<Object> set, char gender) {
            if (set.contains(gender)) {
                System.out.println(set);

            }
        }

        public static void main(String[] args) {
            PatientService patient = new PatientService();
            Set<Object> setOne = new HashSet<>();
            Set<Object> setTwo = new HashSet<>();
            setTwo = addPatient(101, "John", 'M');
            setTwo = addPatient(102, "Navya", 'F');
            Set<Object> mergeSet = new HashSet<>();
            mergeSet.addAll(setTwo);
            mergeSet.addAll(setTwo);
            searchPatient(setOne, setTwo, 101);
            getAllPatients(mergeSet, 'F');
        }
    }
}
