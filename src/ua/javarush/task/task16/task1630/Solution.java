package ua.javarush.task.task16.task1630;

import java.io.*;

/* 
Послідовне виведення файлів
*/

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //напишіть тут ваш код
    static {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //напишіть тут ваш код
    public static class ReadFileThread extends Thread implements ReadFileInterface{
        String fileName = "";
        String content = "";

        @Override
        public void setFileName(String fullFileName) {
            fileName = fullFileName;
        }

        @Override
        public String getFileContent() {

            return content;
        }

        @Override
        public void run() {
            try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                while (reader.ready()){
                    content = content + reader.readLine() + " ";
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
