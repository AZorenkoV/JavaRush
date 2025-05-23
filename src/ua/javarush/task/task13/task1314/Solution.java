package ua.javarush.task.task13.task1314;

import java.awt.*;

/* 
Велика лисиця — це така лисиця
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());

    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public static class BigFox extends Fox{
        public Color color() {
            return Color.GRAY;
        }

        @Override
        public Color getColor() {
            return color();
        }
    }

}
