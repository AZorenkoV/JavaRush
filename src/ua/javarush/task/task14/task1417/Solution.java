package ua.javarush.task.task14.task1417;

import java.util.ArrayList;
import java.util.List;

/* 
Валюти
*/

public class Solution {
    public static void main(String[] args) {
        Person ivan = new Person("Петро");
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " має заначку у розмірі " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            //напишіть тут ваш код
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney() {
            allMoney.add(new Hryvnia(1000));
            allMoney.add(new Euro(1000));
            allMoney.add(new USD(1000));
            return allMoney;
        }
    }
}
