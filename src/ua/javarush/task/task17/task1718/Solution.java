package ua.javarush.task.task17.task1718;

/* 
Прасування
*/

public class Solution {
    public static void main(String[] args) {
        Person diana = new Person("Diana");
        Person igor = new Person("Igor");
        diana.start();
        igor.start();
    }

    public static class Person extends Thread { // Людина

        public Person(String name) {
            super(name);
        }

        @Override
        public void run() {
            synchronized (Iron.class) {
                Iron iron = takeIron();
                Clothes clothes = takeClothes();
                iron(iron, clothes);
                returnIron();
            }
        }

        protected Iron takeIron() {
            System.out.println("Taking the iron");
            return new Iron();
        }

        protected Iron returnIron() {
            System.out.println("Returning the iron");
            return new Iron();
        }

        protected Clothes takeClothes() {
            return new Clothes("T-shirt");
        }

        protected void iron(Iron iron, Clothes clothes) {
            System.out.println(getName() + " is ironing a " + clothes.name);
        }
    }

    public static class Iron {
    } // Праска

    public static class Clothes {// Одяг
        String name;

        public Clothes(String name) {
            this.name = name;
        }
    }
}
