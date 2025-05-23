package ua.javarush.task.pro.task16.task1617;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/* 
Часова глобалізація
*/

public class Solution {

    static LocalDateTime localDateTime = LocalDateTime.of(2020, 3, 19, 9, 17);
    static ZoneId zoneId = ZoneId.of("Zulu");
    static ZonedDateTime globalTime;

    public static void main(String[] args) {
        //напишіть тут ваш код
        globalTime = localDateTime.atZone(zoneId);

        System.out.println(globalTime);
    }
}
