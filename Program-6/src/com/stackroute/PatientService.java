package com.stackroute;
import java.util.*;
public class PatientService {
    //this method is used to add patient details and display the details
    public static HashSet<Patient> addPatient(int registrationNumber, String name, char gender) {
        HashSet<Patient> patient = new HashSet<Patient>();
        patient.add(new Patient(101, "Andreia", 'f'));
        patient.add(new Patient(102, "Jyothi", 'f'));
        patient.add(new Patient(103, "Tom", 'm'));
        patient.add(new Patient(104, "John", 'm'));
        Iterator<Patient> iterator = patient.iterator();
        while (iterator.hasNext()) {
            Patient patient = (Patient) iterator.next();
            System.out.println(patient);
        }
        return patient;
    }
    //this method is used to check whether the patient is present or not
    public static int searchPatient(Set<Patient> set, int registrationNumber) {
        if (set.contains(registrationNumber)) {
            System.out.println("Present");
        } else
            System.out.println("not Present");
        return 0;
    }
    //this method is used to get the sorted patient details using gender
    public static int getAllPatientsByGender(Set<Patient> set, char gender) {
        List<Patient> list = new ArrayList<Patient>(set);
        Set<Patient> patient=new TreeSet<Patient>(Comparator.comparing(Patient::gender));
        Collections.sort(list);
        System.out.println("After Sorting:" + list);
        return 0;
    }
    public static void main(String[] args) {
        Set<Patient> set = addPatient(105, "Lavanya", 'f');
        searchPatient(set, 101);
        getAllPatientsByGender(set, 'f');
    }
}