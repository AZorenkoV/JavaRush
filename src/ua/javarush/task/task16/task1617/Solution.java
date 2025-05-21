package ua.javarush.task.task16.task1617;

/* 
Відлік на перегонах
*/

public class Solution {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //напишіть тут ваш код
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //напишіть тут ваш код
            while (!currentThread().isInterrupted()){
                try {
                    if (numSeconds > 0) {
                        System.out.print(numSeconds-- + " ");
                        Thread.sleep(1000);
                    } else {
                        System.out.println("Марш!");
                        break;
                    }
                } catch (InterruptedException e) {
                    System.out.println("Перервано!");
                    break;
                }
            }
        }
    }
}
