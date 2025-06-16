package ua.javarush.task.task18.task1822;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Пошук даних усередині файлу
*/

public class Solution {
    public static void main(String[] args) {
        try ( BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(br.readLine()))) {
            while (fileReader.ready()) {
                String line = fileReader.readLine();
                if(line.startsWith(args[0] + " "))
                    System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}