package ua.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Тільки по черзі!
*/

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //напишіть тут ваш код
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    //напишіть тут ваш код
    public static class Read3Strings extends Thread{
        public String line1 = "";
        public String line2 = "";
        public String line3 = "";

        @Override
        public void run() {
            try {
                line1 = reader.readLine();
                line2 = reader.readLine();
                line3 = reader.readLine();
            } catch (IOException e) {
                    throw new RuntimeException(e);
            }
        }


        public void printResult() {
            System.out.println(line1 + " " + line2 + " " + line3);
        }
    }
}