package ua.javarush.task.task13.task1309;

/* 
Все, що рухається
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface CanMove {
        Double speed();
    }

    interface CanFly extends CanMove {
        Double speed(CanFly cf);
    }
}