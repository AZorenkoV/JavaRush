package ua.javarush.task.pro.task16.task1602;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Підчищаємо хвости
*/

public class Solution {

    public static void main(String[] args) {
        List<Date> dateList = new ArrayList<>();
        dateList.add(new Date(2015, 12, 25, 20, 40));
        dateList.add(new Date("July 20, 1969"));
        dateList.add(new Date(1989, 11, 9));
        dateList.add(new Date("January 1, 2000"));

        System.out.println("before fixes:");
        dateList.forEach(System.out::println);

        fixDate(dateList);

        System.out.println("after fixes:");
        dateList.forEach(System.out::println);
    }

    static void fixDate(List<Date> brokenDates) {
        //напишіть тут ваш код
        Date current = new Date();
        for (Date date : brokenDates) {
            if(current.before(date))
                if(date.getMonth() == 0) {
                    date.setMonth(11);
                    date.setYear(date.getYear() - 1901);
                }
                else { date.setMonth(date.getMonth() - 1);
                    date.setYear(date.getYear() - 1900);
                }
        }
    }
}
