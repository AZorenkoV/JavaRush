package ua.javarush.task.task18.task1826;

import java.io.*;

/* 
Шифрування
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileIn = new BufferedReader(new FileReader(args[1]));
        BufferedWriter fileOut = new BufferedWriter(new FileWriter(args[2]));
        switch (args[0]) {
            case "-e" : {
                while(fileIn.ready()){
                    fileOut.write(fileIn.read() + 42);
                }
                fileOut.close();
                fileIn.close();
                break;
            }
            case "-d" : {
                while (fileIn.ready()) {
                    fileOut.write(fileIn.read() - 42);
                }
                fileOut.close();
                fileIn.close();
                break;
            }
            default : {
                return;
            }
        }
    }
}
