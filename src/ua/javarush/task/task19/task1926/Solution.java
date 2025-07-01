package ua.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертень
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readFile = new BufferedReader(new FileReader(br.readLine()))) {
            while (readFile.ready()) {
                //StringBuilder line = new StringBuilder(readFile.readLine());
                System.out.println((new StringBuilder(readFile.readLine())).reverse().toString());
            }
        }
    }
}
