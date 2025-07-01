package ua.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Заміна чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "нуль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "чотири");
        map.put(5, "п'ять");
        map.put(6, "шість");
        map.put(7, "сім");
        map.put(8, "вісім");
        map.put(9, "дев'ять");
        map.put(10, "десять");
        map.put(11, "одинадцять");
        map.put(12, "дванадцять");
    }

    public static void main(String[] args) throws IOException {
        String fileName;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = br.readLine();
        }
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while (br.ready()) {
                for (String word : br.readLine().split( " ")) {
                    char symbol = 0;
                    if(word.endsWith(".")) {
                        word = word.substring(0, word.length()-1);
                        symbol = '.';
                    }
                    if(word.endsWith(",")) {
                        word = word.substring(0, word.length()-1);
                        symbol = ',';
                    }
                    try {
                        if(map.containsKey(Integer.valueOf(word))) System.out.print(map.get(Integer.valueOf(word)) + (symbol != 0 ? symbol : "") + " ");
                        else System.out.print(word + (symbol != 0 ? symbol : "") + " ");
                    } catch (NumberFormatException e) {
                        System.out.print(word + (symbol != 0 ? symbol : "") + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
