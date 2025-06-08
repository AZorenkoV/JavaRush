package ua.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортування байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();
        FileInputStream fis = new FileInputStream(fileName);
        Set<Integer> bytes = new TreeSet<>();
        while (fis.available() > 0) {
            bytes.add(fis.read());
        }
        for (Integer item : bytes) {
            System.out.print(item + " ");
        }
        fis.close();
    }
}
