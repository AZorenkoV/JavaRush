package ua.javarush.task.task12.task1232;

/* 
Потрібно додати до програми нову функціональність
*/

public class Solution {
    public static void main(String[] args) {
        Pegasus horse = new Pegasus();
    }

    public static interface CanFly {
        public void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegasus extends Horse implements CanFly {
        @Override
        public void fly() {

        }
    }
}
