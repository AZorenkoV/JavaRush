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
    }

    public static void main(String[] args) {

    }
}
