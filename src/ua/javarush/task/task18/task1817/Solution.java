package ua.javarush.task.task18.task1817;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Прогалини
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(args[0]));
        int allSymbol= 0;
        int spaceSymbol = 0;
        while (bf.ready()){
            int now = bf.read();
            if(now == ' ') spaceSymbol++;
            allSymbol++;
        }
        double spiv = (double)spaceSymbol/(double)allSymbol*100;
        System.out.printf("%.2f", spiv);
        bf.close();
    }
}
