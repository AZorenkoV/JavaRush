package ua.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Рахуємо зарплати
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

        for (String item : employees.keySet()){
            System.out.println(item + " " + employees.get(item));
        }
    }
}
