package ua.javarush.task.task18.task1819;

import java.io.*;
import java.util.ArrayList;

/* 
Об'єднання файлів
*/

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String file1 = br.readLine();
            String file2 = br.readLine();
            BufferedWriter writeFile = new BufferedWriter(new FileWriter(file1));
            BufferedReader readFile1 = new BufferedReader(new FileReader(file1));
            BufferedReader readFile2 = new BufferedReader(new FileReader(file2));
            ArrayList<Integer> content = new ArrayList<>();
            while(readFile2.ready()){
                content.add(readFile2.read());
            }
            while(readFile1.ready()){
                content.add(readFile1.read());
            }
            readFile1.close();
            readFile2.close();
            for(Integer item: content){
                writeFile.write(item);
            }
            writeFile.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
