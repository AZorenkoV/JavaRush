package ua.javarush.task.task18.task1810;

import java.io.*;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException {
        while (true) {

            try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
                 FileInputStream fis = new FileInputStream(console.readLine())) {
                int size = fis.available();
                if(size < 1000) throw new DownloadException();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
