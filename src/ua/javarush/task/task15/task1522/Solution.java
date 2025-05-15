package ua.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закріплюємо патерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - додайте статичний блок тут
    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реалізуйте завдання №5 тут
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            switch (reader.readLine()){
                case Planet.SUN : thePlanet = Sun.getInstance();
                                    break;
                case Planet.EARTH : thePlanet = Earth.getInstance();
                                    break;
                case Planet.MOON :thePlanet = Moon.getInstance();
                                    break;
                default : thePlanet = null;
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
