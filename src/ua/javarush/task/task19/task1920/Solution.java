package ua.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Найбагатший
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> content = new ArrayList<>();
        TreeMap<String, Double> employees = new TreeMap<>();
        try(BufferedReader br = new BufferedReader(new FileReader(args[0]))){
            while (br.ready())
                content.add(br.readLine());
        }
        for (String line : content){
            String lastName = line.split(" ")[0];
            double salary = Double.valueOf(line.split(" ")[1]);
            if(employees.containsKey(lastName)) {
                employees.put(lastName, employees.get(lastName) + salary);
            } else {
                employees.put(lastName, salary);
            }
        }

        double max = 0;

        for (String item : employees.keySet()){
            if(employees.get(item) > max) max = employees.get(item);
        }

        for (String item : employees.keySet()){
            if(employees.get(item) == max) System.out.println(item);
        }

    }
}
