package ua.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Шукаємо потрібні рядки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        String fileName;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            fileName = br.readLine();
        }

        try(BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()){
                String line = fileReader.readLine();
                int countWords = 0;
                for (String word : line.split(" ")) {
                    if(words.contains(word)) countWords++;
                }
                if (countWords == 2) System.out.println(line);
            }
        }
    }
}
