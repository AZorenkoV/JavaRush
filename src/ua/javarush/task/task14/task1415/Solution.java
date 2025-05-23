package ua.javarush.task.task14.task1415;

import java.util.ArrayList;
import java.util.List;

/* 
Клінінговий центр
*/

public class Solution {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<Apartment>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());

        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        // написати тут вашу реалізацію пунктів 1-4
        for(Apartment item: apartments){
            if(item instanceof OneRoomApt) ((OneRoomApt) item).clean1Room();
            else if (item instanceof TwoRoomApt) ((TwoRoomApt) item).clean2Rooms();
            else if (item instanceof ThreeRoomApt) ((ThreeRoomApt) item).clean3Rooms();
        }
    }

    interface Apartment {
    }

    static class OneRoomApt implements Apartment {
        void clean1Room() {
            System.out.println("1 room is cleaned");
        }
    }

    static class TwoRoomApt implements Apartment {
        void clean2Rooms() {
            System.out.println("2 rooms are cleaned");
        }
    }

    static class ThreeRoomApt implements Apartment {
        void clean3Rooms() {
            System.out.println("3 rooms are cleaned");
        }
    }
}
