package ua.javarush.task.task19.task1923;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* 
Слова з цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       List<String> words = new ArrayList<>();

       try(BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
           while (br.ready()) {
               for(String item : br.readLine().split(" "))
                   if(item.matches(".*[0-9].*")) words.add(item);
           }
       }

       try(BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]))) {
           for(String item : words) {
               bw.write(item + " ");
           }
       }
    }
}
