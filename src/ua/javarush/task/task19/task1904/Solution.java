package ua.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
Ще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{

        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner){
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            String line = fileScanner.nextLine();
            try {
                return new Person(line.split(" ")[1],
                        line.split(" ")[2],
                        line.split(" ")[0],
                        new SimpleDateFormat("ddMMyyyy").parse(
                                line.split(" ")[3] +
                                        line.split(" ")[4] +
                                        line.split(" ")[5]));
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
