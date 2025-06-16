package ua.javarush.task.task18.task1821;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* 
Зустрічаємо символи
*/

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            TreeMap<Integer, Integer> symbols = new TreeMap<>();
            while (br.ready()) {
                int now = br.read();
                if(symbols.containsKey(now)) symbols.put(now, symbols.get(now) + 1);
                else symbols.put(now, 1);
            }
            for (Integer item : symbols.keySet()){
                System.out.println((char)item.intValue() + " " + symbols.get(item));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
