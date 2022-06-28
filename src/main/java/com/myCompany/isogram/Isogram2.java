package com.myCompany.isogram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Isogram2 {
    private static boolean isIsogram(String str){
        if (str.equals(""))return true;
        String[] ary = str.split("");
        Set<String> mySet = new HashSet<String>(Arrays.asList(ary));

        if(str.length() == mySet.size()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String testString = "Helow jav";
        System.out.println(isIsogram(testString));
    }


}

