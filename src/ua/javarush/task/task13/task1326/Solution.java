package ua.javarush.task.task13.task1326;

import java.io.BufferedReader;
<<<<<<< HEAD
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
=======
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
>>>>>>> e191078573e612eb98d35cc2fe8e009db272c61c

/* 
Сортування парних чисел із файлу
*/

public class Solution {
    public static void main(String[] args) {
        // напишіть тут ваш код
<<<<<<< HEAD

=======
        Scanner consol = new Scanner(System.in);
        try(FileInputStream fis = new FileInputStream(consol.nextLine())){
            //fis.readAllBytes().
            
            while (fis.available() > 0){
                byte[] buff = new byte[65536];

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
>>>>>>> e191078573e612eb98d35cc2fe8e009db272c61c
    }
}
