package ua.javarush.task.task19.task1912;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Рідер-обгортка 2
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        ByteArrayOutputStream forStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(forStream);
        PrintStream olStream = System.out;

        System.setOut(stream);

        testString.printSomething();

        String result = forStream.toString().replace("te", "??");

        System.setOut(olStream);

        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
