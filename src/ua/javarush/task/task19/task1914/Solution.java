package ua.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Вирішуємо приклад
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        ByteArrayOutputStream forStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(forStream);
        PrintStream olStream = System.out;

        System.setOut(stream);

        testString.printSomething();

        String result = forStream.toString().replaceAll("[\\s]", "");
        String resultFull = forStream.toString().replace("\n", "");
        if(result.indexOf('+') > -1) {
            int a = Integer.valueOf(result.substring(0, result.indexOf('+')));
            int b = Integer.valueOf(result.substring(result.indexOf('+') + 1, result.indexOf('=')));
            resultFull = resultFull + (a+b);
        } else if (result.indexOf('-') > -1) {
            int a = Integer.valueOf(result.substring(0, result.indexOf('-')));
            int b = Integer.valueOf(result.substring(result.indexOf('-') + 1, result.indexOf('=')));
            resultFull = resultFull + (a-b);
        } else if ((result.indexOf('*') > -1)) {
            int a = Integer.valueOf(result.substring(0, result.indexOf('*')));
            int b = Integer.valueOf(result.substring(result.indexOf('*') + 1, result.indexOf('=')));
            resultFull = resultFull + (a*b);
        }

        System.setOut(olStream);

        System.out.println(resultFull);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

