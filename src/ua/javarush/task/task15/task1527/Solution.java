package ua.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

/* 
Парсер реквестів
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        //напишіть тут ваш код
        String [] temp = url.substring(url.indexOf("?") + 1).split("&");
        String znachObi = "";
        for (String item : temp){
            if (item.indexOf("=") != -1) {
                System.out.print(item.substring(0, item.indexOf("=")));
                if(item.substring(0, item.indexOf("=")).equals("obj")) znachObi = item.substring(item.indexOf("=")+1);
            }
            else System.out.print(item);
            System.out.print(" ");

        }
        System.out.println();
        if(!znachObi.isEmpty())
            try {
                alert(Double.valueOf(znachObi));
            } catch (NumberFormatException e) {
                alert(znachObi);
            }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
