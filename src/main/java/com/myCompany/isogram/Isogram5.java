package com.myCompany.isogram;

public class Isogram5 {

    public static boolean isIsogram(String str) {
        if (str.equals(""))return true;
        else return str.length() == str.toLowerCase().chars().distinct().count();
    }
    public static void main(String[] args) {
        String testString = "Helow jav";
        System.out.println(isIsogram(testString));
    }

}
