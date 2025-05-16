package ua.javarush.task.task12.task1212;

/* 
«Виправ код», частина 1
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "Я - кошеня";
        }

        public abstract Pet getChild();
    }
}
