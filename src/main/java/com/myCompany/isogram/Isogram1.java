package com.myCompany.isogram;

public class Isogram1 {
    // ...An isogram is a word that has no repeating letters, consecutive or non-consecutive.
    // Implement a function that determines whether a string that contains only letters is an isogram.
    // Assume the empty string is an isogram. Ignore letter case.

    public static boolean  isIsogram(String str) {
        if (str.equals(""))return true;
        str = str.toLowerCase();
        char[] strArr = str.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr.length; j++) {
                if(i!=j){
                    if (strArr[i] == strArr[j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String testString = "Hellow jav";
        System.out.println(isIsogram(testString));
    }

}

