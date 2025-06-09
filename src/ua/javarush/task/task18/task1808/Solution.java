package ua.javarush.task.task18.task1808;

import java.io.*;

/* 
Поділ файлу
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileIn = console.readLine();
        String fileOut1 = console.readLine();
        String fileOut2 = console.readLine();

        try (FileInputStream fis = new FileInputStream(fileIn);
        FileOutputStream fos1 = new FileOutputStream(fileOut1);
        FileOutputStream fos2 = new FileOutputStream(fileOut2)) {
            int halfOfFile = (fis.available() + 1) / 2;
            int numberOfByte = 0;
            while (fis.available() > 0) {
                if (numberOfByte < halfOfFile) {
                    fos1.write(fis.read());
                    numberOfByte++;
                } else fos2.write(fis.read());
            }
        }
    }
}
