package ua.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if(number1 > number2) System.out.println(WhatNSD(number2,number1));
        else System.out.println(WhatNSD(number1, number2));

    }

    public static int WhatNSD(int num1, int num2){
        int nsd = 0;
        for (int i = 1; i <= num1; i++)
            if(((num1%i) == 0) && ((num2%i) == 0)) nsd = i;
        return nsd;
    }
}
