package ua.javarush.task.task14.task1418;

import java.util.LinkedList;
import java.util.List;

/* 
Виправ чотири помилки
*/

public class Solution {
    public static void main(String[] args) {
        List<Number> list = new LinkedList<Number>();
        //3
        list = initList(list);
        //4 - Виправ 2 помилки
        printListValues(list);

        //5
        processCastedObjects(list);
    }

    public static List<Number> initList(List<Number> list) {
        list.add(Double.valueOf(1000D));
        list.add(Double.valueOf("123e-445632"));
        list.add(Float.valueOf(-90f / -3));
        list.remove(Double.valueOf("123e-445632"));

        return list;
    }

    public static void printListValues(List<Number> list) {
        list.stream().forEach(System.out::println);
    }

    public static void processCastedObjects(List<Number> list) {
        for (Number object : list) {
            // Виправ 2 помилки
            if (object instanceof Double) {
                Double a = (Double) object;
                System.out.println("Is double value infinite? " + a.isInfinite());
            } else if (object instanceof Float) {
                Float a = (Float) object;
                System.out.println("Is float value defined? " + !(a.isNaN()));
            }
        }
    }
}