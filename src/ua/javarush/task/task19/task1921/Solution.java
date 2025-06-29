package ua.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(args[0]))){
            while (br.ready()) {
                String [] line = br.readLine().split(" ");
                int year = Integer.valueOf(line[line.length-1]);
                int month = Integer.valueOf(line[line.length-2]);
                int dat = Integer.valueOf(line[line.length-3]);
                String name = "";
                for (int i = 0; i < line.length - 3; i++) {
                    name += line[i] + " ";
                }
                name = name.trim();
                Date bd = new SimpleDateFormat("ddMMyyyy").parse(
                        (line[line.length-3].length() > 1 ? line[line.length-3] : "0" + line[line.length-3]) +
                                (line[line.length-2].length() > 1 ? line[line.length-2] : "0" + line[line.length-2]) +
                                line[line.length-1]
                );
                PEOPLE.add(new Person(name, bd));
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
