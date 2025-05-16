package ua.javarush.task.pro.task16.task1619;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/* 
Простий шаблон
*/

public class Solution {

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        //напишіть тут ваш код

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyyр. Hг.mхв");
        String date = format.format(localDateTime);
        System.out.println(date);
    }
}
