package ua.javarush.task.pro.task17.task1708;

/* 
Мінімальне й максимальне
*/

public class MinMaxUtil {
    //напишіть тут ваш код
    public static int min(int a, int b) {
        return a <= b ? a : b;
    }

    public static int min(int a, int b, int c) {
        if (a <= b)
            return min(a, c);
        else
            return min(b, c);
    }

    public static int min(int a, int b, int c, int d) {
        if (a <= b) {
            return min(a, c, d);
        } else {
            return min(b, c, d);
        }
    }

    public static int min(int a, int b, int c, int d, int e) {
        if (a <= b)
            return min(a, c, d, e);
        else
            return min(b, c, d, e);
    }

    public static int max(int a, int b) {
        return a >= b ? a : b;
    }

    public static int max(int a, int b, int c) {
        if (a >= b)
            return max(a, c);
        else
            return max(b, c);
    }

    public static int max(int a, int b, int c, int d) {
        if (a >= b) {
            return max(a, c, d);
        } else {
            return max(b, c, d);
        }
    }

    public static int max(int a, int b, int c, int d, int e) {
        if (a >= b)
            return max(a, c, d, e);
        else
            return max(b, c, d, e);
    }
}
