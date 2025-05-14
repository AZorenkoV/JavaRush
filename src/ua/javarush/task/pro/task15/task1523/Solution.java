package ua.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/* 
Отримання інформації через API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        //напишіть тут ваш код
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
        try(OutputStream os = connection.getOutputStream(); InputStream is = connection.getInputStream();
        PrintStream ps = new PrintStream(os); BufferedReader br = new BufferedReader(new InputStreamReader(is))){
            ps.println("Hello");
            while (br.ready()){
                System.out.println(br.readLine());
            }
        }
    }
}

