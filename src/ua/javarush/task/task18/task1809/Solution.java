package ua.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файлу
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileIn = console.readLine();
        String fileOut = console.readLine();

        try (FileInputStream fis = new FileInputStream(fileIn);
             FileOutputStream fos = new FileOutputStream(fileOut)) {
            int size = fis.available();
            int [] bytes = new int[size];
            int i = 0;
            while (fis.available() > 0) {
                bytes[i++] = fis.read();
            }
            for (int y = bytes.length-1; y >= 0 ; y--) {
                fos.write(bytes[y]);
            }
        }

    }
}
