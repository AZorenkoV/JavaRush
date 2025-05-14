package ua.javarush.task.task15.task1502;

/* 
ООП — Спадкування тварин
*/

public class Solution {
    // додайте класи Goose та Dragon тут

    public static void main(String[] args) {

    }

    public static class BigAnimal {
        protected String getSize() {
            return "як динозавр";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "як кішка";
        }
    }

    public static class Goose extends SmallAnimal {
        public String getSize()
        {
            return "Гусак маленький, " + super.getSize();
        }
    }

    public static class Dragon extends BigAnimal{
        public String getSize()
        {
            return "Дракон великий, " + super.getSize();
        }
    }
}
