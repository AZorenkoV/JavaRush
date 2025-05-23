package ua.javarush.task.pro.task18.task1810;

import java.util.ArrayList;
import java.util.Collections;

/* 
Перетворення списку на масив
*/

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Ти", "ж", "програміст");

        var integers = new ArrayList<Integer>();
        Collections.addAll(integers, 1000, 2000, 3000);


        String[] stringArray = toStringArray(strings);
        for (String string : stringArray) {
            System.out.println(string);
        }

        Integer[] integerArray = toIntegerArray(integers);
        for (Integer integer : integerArray) {
            System.out.println(integer);
        }
    }

    public static String[] toStringArray(ArrayList<String> strings) {
        //напишіть тут ваш код
        //return new String[]{};
        return strings.toArray(String[]::new);
    }

    public static Integer[] toIntegerArray(ArrayList<Integer> integers) {
        //напишіть тут ваш код
        return integers.toArray(Integer[]::new);
    }
}
