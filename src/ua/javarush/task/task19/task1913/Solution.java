package ua.javarush.task.task19.task1913;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Виводимо лише цифри
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        ByteArrayOutputStream forStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(forStream);
        PrintStream olStream = System.out;

        System.setOut(stream);

        testString.printSomething();

        String result = forStream.toString().replaceAll("[^0-9]", "");

        System.setOut(olStream);

        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
