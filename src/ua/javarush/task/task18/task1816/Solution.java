package ua.javarush.task.task18.task1816;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Англійські літери
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        int count = 0;
        while (br.ready()){
            int now = br.read();
            if(((now > 64) && (now < 91)) || ((now > 96) && (now < 123))) count++;
        }
        System.out.println(count);
        br.close();
    }
}
