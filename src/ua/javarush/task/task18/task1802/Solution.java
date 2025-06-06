package ua.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Мінімальний байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();
        FileInputStream fis = new FileInputStream(fileName);
        int minByte = Integer.MAX_VALUE;
        while (fis.available() > 0) {
            int now = fis.read();
            if(now < minByte) minByte = now;
        }
        System.out.println(minByte);
        fis.close();
    }
}
