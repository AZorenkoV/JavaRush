package ua.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* 
Найрідкісніші байти
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();
        FileInputStream fis = new FileInputStream(fileName);
        Map<Integer,Integer> bytes = new HashMap<>();
        int minCount = Integer.MAX_VALUE;
        while (fis.available() > 0) {
            int now = fis.read();
            if(bytes.containsKey(now)) bytes.put(now, bytes.get(now) + 1);
            else bytes.put(now, 1);
        }
        for (Integer item: bytes.keySet()){
            if(bytes.get(item) < minCount) minCount = bytes.get(item);
        }
        for (Integer item: bytes.keySet()){
            if(bytes.get(item) == minCount) System.out.print(item + " ");;
        }

        System.out.println();
        fis.close();
    }
}
