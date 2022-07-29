package Andrii.Vakulenko.lesson4;

public class Person {
    static String personInfo(String firstName, String surName, String town, String phoneNumber){
        return "Call " + firstName+ " " + surName+" from " + town + " by phoneNumber " + phoneNumber;
    }
    public static void main(String[] args){
        System.out.println(personInfo("Will","Smith","New York","2936729462846"));
        System.out.println(personInfo("Jackie","Chan","Shanghai","12312412412"));
        System.out.println(personInfo("Sherlock","Holmes","London","37742123513"));
    }
}
