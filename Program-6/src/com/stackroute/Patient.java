package com.stackroute;
import java.util.*;
//this class contains a parameterized constructor,setters and getters methods
class Patient {
    int registrationNumber;
    String name;
    char gender;

    public Patient(int registrationNumber, String name, char gender) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.gender = gender;
    }

    public void setRegistrationNumber(int registrationNumber) {

        this.registrationNumber = registrationNumber;
    }

    public int getRegistrationNumber() {

        return registrationNumber;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public int hashCode() {
        return registrationNumber;
    }

    public String toString() {
        return "[" + registrationNumber + ", " + name + ", " + gender + "]";
    }

    public int compareTo(Patient patientDetails) {
        return (this.getName().compareTo(patientDetails.getName()));
    }


}



