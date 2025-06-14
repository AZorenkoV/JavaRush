package ua.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одному
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter fileOut = new BufferedWriter(new FileWriter(console.readLine()));
        BufferedReader fileIn1 = new BufferedReader(new FileReader(console.readLine()));
        BufferedReader fileIn2 = new BufferedReader(new FileReader(console.readLine()))) {
            while (fileIn1.ready()){
                fileOut.write(fileIn1.read());
            }
            while (fileIn2.ready()){
                fileOut.write(fileIn2.read());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
