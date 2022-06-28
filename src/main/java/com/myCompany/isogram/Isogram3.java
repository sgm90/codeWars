package com.myCompany.isogram;

public class Isogram3 {

    public static boolean isIsogram(String str) {
        if (str.equals(""))return true;
        str = str.toLowerCase();
        char[] arr = str.toCharArray();

        for (char ch : arr) {
            /* if positions returned by the indexOf() and lastIndexOf() methods are not same
               then the str is NOT Isogram*/
            if(str.indexOf(ch) != str.lastIndexOf(ch)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String testString = "Helow jav";
        System.out.println(isIsogram(testString));
    }
}
