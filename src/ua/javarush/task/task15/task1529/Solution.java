package ua.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Освоювання статичного блоку
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();//напишіть тут ваш код
    }

    public static CanFly result;

    public static void reset() {
        //напишіть тут ваш код
        try(BufferedReader reader= new BufferedReader(new InputStreamReader(System.in))) {
            switch (reader.readLine()) {
                case "helicopter" : result = new Helicopter();
                    break;
                case "plane" : result = new Plane(4);
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
