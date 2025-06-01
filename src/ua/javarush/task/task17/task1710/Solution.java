package ua.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Іванов Іван", new Date()));  // сьогодні народився   id=0
        allPeople.add(Person.createMale("Петренко Петро", new Date()));  // сьогодні народився   id=1
    }

    public static void main(String[] args) {
        //напишіть тут ваш код
        SimpleDateFormat sdfIn = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat sdfOut = new SimpleDateFormat("dd-LLL-yyyy", Locale.ENGLISH);
        int index;
        Person person;

        switch (args[0]) {
            case "-c" : {
                if(args[2].equals("ч")) {
                    try {
                        person = Person.createMale(args[1], sdfIn.parse(args[3]));
                        allPeople.add(person);
                        index = allPeople.indexOf(person);

                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    try {
                        person = Person.createFemale(args[1], sdfIn.parse(args[3]));
                        allPeople.add(person);
                        index = allPeople.indexOf(person);
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(index);
                break;
            }
            case "-r" : {
                person = allPeople.get(Integer.valueOf(args[1]));
                System.out.println(person.getName()+ " "  + (person.getSex() == Sex.MALE ? "ч" : "ж") + " " + sdfOut.format(person.getBirthDate()));
                break;
            }
            case "-u" : {
                //for (Person item : allPeople) System.out.println(item.getName() + " " + item.getSex() + " " + item.getBirthDate());
                index = Integer.valueOf(args[1]);
                person = allPeople.get(index);
                person.setName(args[2]);
                person.setSex((args[3].equals("ч") ? Sex.MALE : Sex.FEMALE));
                try {
                    person.setBirthDate(sdfIn.parse(args[4]));
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
                //for (Person item : allPeople) System.out.println(item.getName() + " " + item.getSex() + " " + item.getBirthDate());
                break;
            }
            case "-d" : {
                person = allPeople.get(Integer.valueOf(args[1]));
                person.setName(null);
                person.setSex(null);
                person.setBirthDate(null);
                break;
            }
        }
    }
}
