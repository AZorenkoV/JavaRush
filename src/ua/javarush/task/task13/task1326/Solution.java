package ua.javarush.task.task13.task1326;

import java.util.Scanner;
import java.io.FileInputStream;

/* 
Сортування парних чисел із файлу
*/

public class Solution {
    public static void main(String[] args) {
        // напишіть тут ваш код
        Scanner consol = new Scanner(System.in);
        try(FileInputStream fis = new FileInputStream(consol.nextLine())){
            //fis.readAllBytes().
            
            while (fis.available() > 0){
                byte[] buff = new byte[65536];

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
