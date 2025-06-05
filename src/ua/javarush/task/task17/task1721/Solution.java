package ua.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакційність
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws CorruptedDataException {
        try {
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            String fileName1 = console.readLine();
            String fileName2 = console.readLine();
            BufferedReader file1 = new BufferedReader(new FileReader(fileName1));
            BufferedReader file2 = new BufferedReader(new FileReader(fileName2));
            String line;
            while ((line = file1.readLine())!=null) {
                allLines.add(line);
            }
            while ((line = file2.readLine())!=null) {
                forRemoveLines.add(line);
            }
            file1.close();
            file2.close();
            console.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        new Solution().joinData();
    }

    public void joinData() throws CorruptedDataException {

        if(!allLines.containsAll(forRemoveLines)) {
            allLines.clear();
            throw new CorruptedDataException();
        } else {
            allLines.removeAll(forRemoveLines);
        }
    }
}
