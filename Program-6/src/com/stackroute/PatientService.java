package com.stackroute;

import java.util.HashSet;
import java.util.Set;

public class PatientService {
    //this method is used to add patient details
    public static Set<Patient> addPatient(int registrationNumber, String name, String gender) {
        HashSet<Patient> set = new HashSet<>();
        set.add(new Patient(101,"sushma",'f'));
        set.add(new Patient(102,"Bhavana",'f'));
        System.out.println(set);
        return set;
    }

    //this method is used to search whether patient is present or not using registration number
    public static Set<Patient> searchPatient( int registrationNumber) {

    }

    //this method is used to sort the patient names by using gender
    public static void getAllPatients(char gender) {
        if (set.contains(gender)) {
            System.out.println(set);

        }
    }

    public static void main(String[] args) {
        Set<Patient> patient = new HashSet<Patient>();
        Set<Patient> patient = new HashSet<Patient>();
        set= addPatient();
        searchPatient(set,101);
        getAllPatient('F');
    }
}
