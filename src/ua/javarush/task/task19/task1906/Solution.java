package ua.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Парні символи
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileNameRead = console.readLine();
        String fileNameWrite = console.readLine();
        console.close();
        StringBuilder content = new StringBuilder();
        FileReader fileReader = new FileReader(fileNameRead);
        while (fileReader.ready()) content.append(Character.valueOf((char) fileReader.read()));
        fileReader.close();
        FileWriter fileWriter = new FileWriter(fileNameWrite);
        for (int i = 1; i < content.length(); i+=2) fileWriter.write(content.charAt(i));
        fileWriter.close();
    }
}
