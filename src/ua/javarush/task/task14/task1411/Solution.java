package ua.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        // тут цикл для читання ключів, пункт 1
        while(true){
            String readPerson = reader.readLine();
            switch (readPerson) {
                case "user" : person = new Person.User();
                    break;
                case "loser" : person = new Person.Loser();
                    break;
                case "coder" : person = new Person.Coder();
                    break;
                case "proger" : person = new Person.Proger();
                    break;
                //default : break;
            }
            if (person == null) break;
            // створюємо об'єкт, пункт 2
            doWork(person); // викликаємо doWork
            person = null;
        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User) ((Person.User) person).live();
        else if (person instanceof Person.Loser) ((Person.Loser) person).doNothing();
        else if (person instanceof Person.Coder) ((Person.Coder) person).writeCode();
        else if (person instanceof Person.Proger) ((Person.Proger) person).enjoy();
    }
}
