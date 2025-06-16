package ua.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Потоки та байти
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String now = br.readLine();
            while (!now.equals("exit")){
                Thread thread = new ReadThread(now);
                thread.start();
                now = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            // implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реалізуйте читання з файлу тут

        @Override
        public void run() {
            TreeMap<Integer, Integer> symbols = new TreeMap<>();

            try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
                while (br.ready()) {
                    int now = br.read();
                    if(symbols.containsKey(now)) symbols.put(now, symbols.get(now) + 1);
                    else symbols.put(now, 1);
                }
                int maxCount = 0;
                int maxSymbol = Integer.MAX_VALUE;
                for (Integer item : symbols.keySet()) {
                    if(symbols.get(item) >= maxCount){
                        maxCount = symbols.get(item);
                        maxSymbol = item;
                    }
                }
                resultMap.put(fileName, maxSymbol);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
