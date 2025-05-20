package ua.javarush.task.task16.task1618;

/* 
Знову interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //напишіть тут ваш код
        TestThread testThread = new TestThread();
        testThread.start();
        testThread.interrupt();
    }

    //Add your code below - додай код нижче
    public static class TestThread extends Thread{
        public void run(){

        }
    }
}