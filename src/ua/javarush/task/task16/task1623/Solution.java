package ua.javarush.task.task16.task1623;

/* 
Рекурсивне створення потоків
*/

public class Solution {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        //createdThreadCount = 0;
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread{
        public GenerateThread(){
            super(String.valueOf(++createdThreadCount));
            start();
        }

        @Override
        public void run() {
            if(createdThreadCount < count){
                System.out.println(new GenerateThread());
            }
        }

        @Override
        public String toString() {
            return this.getName() + " created";
        }
    }
}
