package ua.javarush.task.task18.task1807;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

/* 
Підрахунок ком.
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();
        FileInputStream fis = new FileInputStream(fileName);
        int count = 0;
        while (fis.available() > 0) {
            char now = (char)fis.read();
            if(now == ',') count++;
        }
        System.out.println(count);
        fis.close();
    }
}
