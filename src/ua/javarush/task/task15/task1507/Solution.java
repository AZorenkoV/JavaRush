package ua.javarush.task.task15.task1507;

/* 
ООП — Перевантаження
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(short m, int n, String value) {
        System.out.println("Заповнюємо об'єктами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, short n, String value) {
        System.out.println("Заповнюємо об'єктами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(byte m, int n, String value) {
        System.out.println("Заповнюємо об'єктами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, byte n, String value) {
        System.out.println("Заповнюємо об'єктами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(byte m, short n, String value) {
        System.out.println("Заповнюємо об'єктами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Number value) {
        System.out.println("Заповнюємо об'єктами Number");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Double value) {
        System.out.println("Заповнюємо об'єктами Double");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Integer value) {
        System.out.println("Заповнюємо об'єктами Integer");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заповнюємо об'єктами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
