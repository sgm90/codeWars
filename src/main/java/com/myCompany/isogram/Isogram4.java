package com.myCompany.isogram;

import java.util.HashSet;

public class Isogram4 {

    public static boolean isIsogram(String str) {
        if (str.equals(""))return true;
        HashSet<Character> set = new HashSet<>();
        str = str.toLowerCase();
        char[] arr = str.toCharArray();
        for (char ch : arr) {
            set.add(ch);
        }
        if (set.size() == str.length()) return true;
        else return false;
    }
    public static void main(String[] args) {
        String testString = "Helow jav";
        System.out.println(isIsogram(testString));
    }

}