package com.company;


import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static int toArabic(String value) throws Exception {
        try {
            if (value.equals("I")) {
                return 1;
            } else if (value.equals("II")) {
                return 2;
            } else if (value.equals("III")) {
                return 3;
            } else if (value.equals("IV")) {
                return 4;
            } else if (value.equals("V")) {
                return 5;
            } else if (value.equals("VI")) {
                return 6;
            } else if (value.equals("VII")) {
                return 7;
            } else if (value.equals("VIII")) {
                return 8;
            } else if (value.equals("IX")) {
                return 9;
            } else if (value.equals("X")) {
                return 10;
            }
        } catch (Exception e) {
            throw new Exception("Неверный формат данных");
        }
        return -1;
    }
    public static void integerToRoman(int result) {
        int[] values = {100,90,50,40,10,9,5,4,1};
        String[] romanNumbers = {"C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roman = new StringBuilder();
        for(int i=0;i<values.length;i++) {
            while(result >= values[i]) {
                result -= values[i];
                roman.append(romanNumbers[i]);
            }
        }

        System.out.println(roman.toString());
    }

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        String equation = input.next();
        int result = 0;
        String[] ints;
        ints = equation.split("[+*/-]");
        if (equation.contains("I") || equation.contains("II") || equation.contains("III") || equation.contains("IV") || equation.contains("V") || equation.contains("VI") || equation.contains("VII") || equation.contains("VIII") && equation.contains("IX") || equation.contains("X")) {
            int a = toArabic(ints[0]);
            int b = toArabic(ints[1]);
            if (a < 11 && a > 0 && b < 11 && b > 0) {
                if (equation.indexOf('+') > 0) {
                    result = a + b;
                } else if (equation.indexOf('-') > 0) {
                    result = a - b;
                } else if (equation.indexOf('*') > 0) {
                    result = a * b;
                } else if (equation.indexOf('/') > 0) {
                    result = a / b;
                } else {
                    System.out.println("Неверный формат данных");
                }
                integerToRoman(result);
            }

        }
        else {
            int a = Integer.parseInt(ints[0]);
            int b = Integer.parseInt(ints[1]);
            if (a < 11 && a > 0 && b < 11 && b > 0) {
                if (equation.indexOf('+') > 0) {
                    result = a + b;
                } else if (equation.indexOf('-') > 0) {
                    result = a - b;
                } else if (equation.indexOf('*') > 0) {
                    result = a * b;
                } else if (equation.indexOf('/') > 0) {
                    result = a / b;
                } else {
                    System.out.println("Неверный формат данных");
                }
                System.out.println(result);
            }
        }
    }
}



