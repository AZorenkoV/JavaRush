package ua.javarush.task.task15.task1517;

/* 
Статики та винятки
*/

public class Solution {
    public static int A = 0;

    static {
        A = 5/0;
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
