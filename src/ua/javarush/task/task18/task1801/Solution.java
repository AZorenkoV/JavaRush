package ua.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальний байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();
        FileInputStream fis = new FileInputStream(fileName);
        int maxByte = 0;
        while (fis.available() > 0) {
            int now = fis.read();
            if(now > maxByte) maxByte = now;
        }
        System.out.println(maxByte);
        fis.close();
    }
}
