package ua.javarush.task.task12.task1225;

/* 
Відвідувачі
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        //напишіть тут ваш код
        if(o instanceof Tiger) return "Тигр";
        if(o instanceof Lion) return "Лев";
        if(o instanceof Cat) return "Кіт";
        if(o instanceof Bull) return "Бик";
        if(o instanceof Cow) return "Корова";
        if(o instanceof Animal) return "Тварини";
        return null;
    }

    public static class Cat extends Animal   //<--Класи успадковуються!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
