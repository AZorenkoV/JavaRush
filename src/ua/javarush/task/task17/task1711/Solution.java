package ua.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    private static SimpleDateFormat inFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    private static SimpleDateFormat outFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Іванов Іван", new Date()));  // сьогодні народився   id=0
        allPeople.add(Person.createMale("Петренко Петро", new Date()));  // сьогодні народився   id=1
    }

    public static void main(String[] args) {
        // start here - почни тут
        int index = 1;
        Person person;
        switch (args[0]) {
            case "-c" : {
                synchronized (allPeople) {
                    while (index < args.length) {
                        if (args[index+1].equals("ч")) {
                            try {
                                allPeople.add(Person.createMale(args[index], inFormat.parse(args[index+2])));
                            } catch (ParseException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            try {
                                allPeople.add(Person.createFemale(args[index], inFormat.parse(args[index+2])));
                            } catch (ParseException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        System.out.println(allPeople.size()-1);
                        index+=3;
                    }
                }
                break;
            }
            case "-u" : {
                synchronized (allPeople){
                    while (index < args.length) {
                        person = allPeople.get(Integer.parseInt(args[index++]));
                        person.setName(args[index++]);
                        person.setSex((args[index++].equals("ч")? Sex.MALE : Sex.FEMALE));
                        try {
                            person.setBirthDate(inFormat.parse(args[index++]));
                        } catch (ParseException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                break;
            }
            case "-d" : {
                synchronized (allPeople) {
                    while (index < args.length) {
                        person = allPeople.get(Integer.parseInt(args[index++]));
                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDate(null);
                    }
                }
                break;
            }
            case "-i" : {
                synchronized (allPeople) {
                    while (index < args.length) {
                        person = allPeople.get(Integer.parseInt(args[index++]));
                        System.out.println(person.getName() + " " + (person.getSex() == Sex.MALE ? "ч" : "ж") + " " + outFormat.format(person.getBirthDate()));
                    }
                }
                break;
            }
        }
    }
}
