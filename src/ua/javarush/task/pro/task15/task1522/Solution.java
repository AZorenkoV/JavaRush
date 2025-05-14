package ua.javarush.task.pro.task15.task1522;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* 
Отримання інформації через API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.com.ua/api/1.0/rest/projects");
        //напишіть тут ваш код
        InputStream stream = url.openStream();
        byte [] buffer = stream.readAllBytes();
        String string = new String(buffer);
        System.out.println(string);
    }
}