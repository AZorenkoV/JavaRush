package ua.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуація
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileReadName;
        String fileWriteName;
        try(BufferedReader console = new BufferedReader(new InputStreamReader(System.in))){
            fileReadName = console.readLine();
            fileWriteName = console.readLine();
        }
        StringBuilder content = new StringBuilder();
        try(BufferedReader fileRead = new BufferedReader(new FileReader(fileReadName))){
            while (fileRead.ready()){
                content.append((char) fileRead.read());
            }
        }
        String toWrite = content.toString().replaceAll("[^a-zA-Z0-9\\s]","");
        try(BufferedWriter fileWrite = new BufferedWriter(new FileWriter(fileWriteName))) {
            fileWrite.write(toWrite);
        }
    }
}
