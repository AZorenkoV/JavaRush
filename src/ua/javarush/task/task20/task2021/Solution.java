package ua.javarush.task.task20.task2021;

import java.io.*;

/* 
Серіалізація під забороною
*/

public class Solution implements Serializable {
    public static class SubSolution extends Solution {
        private void writeObject(ObjectOutputStream outputStream) throws NotSerializableException {
            throw new NotSerializableException();
        }

        private void readObject(ObjectInputStream inputStream) throws NotSerializableException {
            throw new NotSerializableException();
        }
    }

    public static void main(String[] args) {

    }
}
