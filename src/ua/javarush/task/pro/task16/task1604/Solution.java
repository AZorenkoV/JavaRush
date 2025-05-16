package ua.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
День тижня твого народження
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1983, 6, 7);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        //напишіть тут ваш код


        String result = "";

        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case 1: result = "Неділя";
                    break;
            case 2: result = "Понеділок";
                break;
            case 3: result = "Вівторок";
                break;
            case 4: result = "Середа";
                break;
            case 5: result = "Четвер";
                break;
            case 6: result = "П'ятниця";
                break;
            case 7: result = "Субота";
                break;
        }

        return result;
    }
}
