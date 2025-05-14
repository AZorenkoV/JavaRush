package ua.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл у статичному блоці
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try (BufferedReader reader = new BufferedReader(new FileReader(Statics.FILE_NAME))) {
            while (reader.ready()) {
                lines.add(reader.readLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

        public static void main(String[] args) {
        System.out.println(lines);
    }
}
