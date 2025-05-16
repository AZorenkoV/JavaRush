package ua.javarush.task.task12.task1229;

/* 
Батько класу CTO
*/

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class CTO extends TCO implements Businessman {

    }

    public static class TCO implements Businessman {

        @Override
        public void workHard() {

        }
    }
}
