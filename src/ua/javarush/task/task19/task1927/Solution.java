package ua.javarush.task.task19.task1927;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Контекстна реклама
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(outStream);
        PrintStream oldStream = System.out;
        System.setOut(ps);
        testString.printSomething();
        System.setOut(oldStream);
        String line = outStream.toString();
        int count = 1;
        for (String item : line.split("\n")) {
            System.out.println(item);
            if(count % 2 == 0) System.out.println("JavaRush - курси Java онлайн");
            count++;
        };
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
