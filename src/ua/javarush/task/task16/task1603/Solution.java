package ua.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список та потоки
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //напишіть тут ваш код
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
