package ua.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Виділяємо числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileInName;
        String fileOutName;
        try(BufferedReader console = new BufferedReader(new InputStreamReader(System.in))){
            fileInName = console.readLine();
            fileOutName = console.readLine();
        }

        String content = "";
        try(BufferedReader fileReader = new BufferedReader(new FileReader(fileInName))){
            while(fileReader.ready()){
                content += fileReader.readLine() + " ";
            }
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        for (String item : content.split(" ")){
            try{
                numbers.add(Integer.valueOf(item));
            } catch (NumberFormatException e){

            }
        }

        try(BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileOutName))){
            for (Integer item : numbers) {
                fileWriter.write(item + " ");
            }
        }
    }
}
