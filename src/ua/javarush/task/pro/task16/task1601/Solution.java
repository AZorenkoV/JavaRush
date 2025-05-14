package ua.javarush.task.pro.task16.task1601;

import java.util.Calendar;
import java.util.Date;

/* 
Аби не в понеділок:)
*/

public class Solution {

    static Date birthDate = new Date(83,06,7);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
        System.out.println(birthDate);
    }

    static String getDayOfWeek(Date date) {
        //напишіть тут ваш код
        String day = "";
        switch (date.getDay()) {
            case 0: day = "Неділя";
                break;
            case 1: day = "Понеділок";
                break;
            case 2: day = "Вівторок";
                break;
            case 3: day = "Середа";
                break;
            case 4: day = "Четвер";
                break;
            case 5: day = "П'ятниця";
                break;
            case 6: day = "Субота";
                break;

        }
        return day;
    }
}
