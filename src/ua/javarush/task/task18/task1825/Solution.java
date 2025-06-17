package ua.javarush.task.task18.task1825;

import java.io.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* 
Збираємо файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> filesName = new TreeSet<>();
        String fileName = br.readLine();
        String fullFileName = fileName.substring(0, fileName.indexOf(".part"));
        while (!fileName.equals("end")) {
            filesName.add(fileName);
            fileName = br.readLine();
        }
        BufferedWriter writeFile = new BufferedWriter(new FileWriter(fullFileName));
        for (String inFile : filesName) {
            BufferedReader readFile = new BufferedReader(new FileReader(inFile));
            while (readFile.ready()) {
                writeFile.write(readFile.read());
            }
            readFile.close();
        }
        writeFile.close();
    }
}
