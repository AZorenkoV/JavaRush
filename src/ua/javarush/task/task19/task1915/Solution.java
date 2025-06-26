package ua.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублюємо текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        String fileName;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            fileName = br.readLine();
        }

        ByteArrayOutputStream forStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(forStream);
        PrintStream olStream = System.out;

        System.setOut(stream);

        testString.printSomething();

        String result = forStream.toString();
        System.setOut(olStream);
        System.out.println(result);
        try(FileOutputStream fos = new FileOutputStream(fileName)){
            fos.write(forStream.toByteArray());
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

