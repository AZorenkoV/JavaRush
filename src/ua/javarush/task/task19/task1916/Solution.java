package ua.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Відстежуємо зміни
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        String fileName1;
        String fileName2;
        List<String> fileContent1 = new ArrayList<>();
        List<String> fileContent2 = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            fileName1 = br.readLine();
            fileName2 = br.readLine();
        }
        try(BufferedReader fileReader1 = new BufferedReader(new FileReader(fileName1))) {
            while (fileReader1.ready()){
                fileContent1.add(fileReader1.readLine());
            }
        }
        try(BufferedReader fileReader2 = new BufferedReader(new FileReader(fileName2))) {
            while (fileReader2.ready()){
                fileContent2.add(fileReader2.readLine());
            }
        }

        int indexFile1 = 0;
        int indexFile2 = 0;

        while ((indexFile1 < fileContent1.size()) && (indexFile2 < fileContent2.size())) {

            if (fileContent1.get(indexFile1).equals(fileContent2.get(indexFile2))) {
                lines.add(new LineItem(Type.SAME, fileContent1.get(indexFile1)));
                indexFile1++;
                indexFile2++;
            } else if ((indexFile2 + 1 < fileContent2.size()) && fileContent1.get(indexFile1).equals(fileContent2.get(indexFile2 + 1))) {
                lines.add(new LineItem(Type.ADDED, fileContent2.get(indexFile2)));
                indexFile2++;
            } else if ((indexFile1 + 1 < fileContent1.size()) && fileContent1.get(indexFile1 + 1).equals(fileContent2.get(indexFile2))) {
                lines.add(new LineItem(Type.REMOVED, fileContent1.get(indexFile1)));
                indexFile1++;
            }
        }

        while (indexFile1 < fileContent1.size()) {
            lines.add(new LineItem(Type.REMOVED, fileContent1.get(indexFile1)));
            indexFile1++;
        }
        while (indexFile2 < fileContent2.size()) {
            lines.add(new LineItem(Type.ADDED, fileContent2.get(indexFile2)));
            indexFile2++;
        }
    }


    public enum Type {
        ADDED,        // доданий новий рядок
        REMOVED,      // видалений рядок
        SAME          // без змін
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
