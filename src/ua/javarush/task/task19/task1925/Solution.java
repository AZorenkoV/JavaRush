package ua.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Довгі слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> words = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            while (br.ready()) {
                for(String item : br.readLine().split(" "))
                    if(item.length() > 6) words.add(item);
            }
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]))) {
            for(int i = 0; i < words.size() - 1; i++) {
                bw.write(words.get(i) + ",");
            }
            bw.write(words.get(words.size()-1));
        }
    }
}
