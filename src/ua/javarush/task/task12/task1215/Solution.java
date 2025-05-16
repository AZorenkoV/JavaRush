package ua.javarush.task.task12.task1215;

/* 
Кішки не повинні бути абстрактними!
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {

        @Override
        public String getName() {
            return "Кіт";
        }

        @Override
        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet{

        @Override
        public String getName() {
            return "Собака";
        }

        @Override
        public Pet getChild() {
            return new Dog();
        }
    }

}
