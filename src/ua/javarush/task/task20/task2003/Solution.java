package ua.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знайомство з properties
*/

public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws Exception {
        Properties prop = new Properties();

        for (Map.Entry<String, String> pair : runtimeStorage.entrySet()) {
            prop.setProperty(pair.getKey(), pair.getValue());
        }

        prop.store(outputStream, null);
    }

    public static void load(InputStream inputStream) throws IOException {
        Properties prop = new Properties();
        prop.load(inputStream);

        for (Map.Entry<Object, Object> pair : prop.entrySet()) {
            runtimeStorage.put(pair.getKey().toString(), pair.getValue().toString());
        }
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fis = new FileInputStream(reader.readLine())) {
            load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(runtimeStorage);
    }
}
