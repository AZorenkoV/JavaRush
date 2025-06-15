package ua.javarush.task.task18.task1820;

import java.io.*;
import java.util.ArrayList;

/* 
Округлення чисел
*/

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readFile = new BufferedReader(new FileReader(br.readLine()));
        BufferedWriter writeFile = new BufferedWriter(new FileWriter(br.readLine()))) {
            while (readFile.ready()){
                String [] numbers = readFile.readLine().split(" ");
                for(String item: numbers) {
                    writeFile.write(String.valueOf(Math.round(Double.valueOf(item))));
                    writeFile.write(' ');
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
