package ua.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Різні методи для різних типів
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишіть тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (!(s = reader.readLine()).equals("exit")) {
            try {
                if (s.contains(".")) {
                    print(Double.parseDouble(s));
                } else {
                    int i = Integer.parseInt(s);
                    if (i > 0 && i < 128) {
                        print((short) i);
                    } else {
                        print(i);
                    }
                }
            } catch (Exception e) {
                print(s);
            }
        }
        reader.close();
    }

    public static void print(Double value) {
        System.out.println("Це тип Double, значення " + value);
    }

    public static void print(String value) {
        System.out.println("Це тип String, значення " + value);
    }

    public static void print(short value) {
        System.out.println("Це тип short, значення " + value);
    }

    public static void print(Integer value) {
        System.out.println("Це тип Integer, значення " + value);
    }
}
