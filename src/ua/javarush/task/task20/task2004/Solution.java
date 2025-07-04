package ua.javarush.task.task20.task2004;

import java.io.*;

/* 
Читаємо та пишемо до файлу статики
*/

public class Solution {
    public static void main(String[] args) {
        try {
            //напишіть тут ваш код
            File yourFile = File.createTempFile("your_file_name", null);
            //File yourFile = new File("your_file_name");
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            ClassWithStatic classWithStatic = new ClassWithStatic();
            classWithStatic.i = 3;
            classWithStatic.j = 4;
            classWithStatic.save(outputStream);
            outputStream.flush();

            ClassWithStatic loadedObject = new ClassWithStatic();
            loadedObject.staticString = "something";
            loadedObject.i = 6;
            loadedObject.j = 7;

            loadedObject.load(inputStream);
            //напишіть тут ваш код

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class ClassWithStatic {
        public static String staticString = "This is a static test string";
        public int i;
        public int j;

        public void save(OutputStream outputStream) throws Exception {
            //напишіть тут ваш код
            try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream))) {
                bw.write(ClassWithStatic.staticString);
                bw.newLine();
                bw.write(String.valueOf(i));
                bw.newLine();
                bw.write(String.valueOf(j));
            }
        }

        public void load(InputStream inputStream) throws Exception {
            //напишіть тут ваш код
            try(BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
                ClassWithStatic.staticString = br.readLine();
                i = Integer.parseInt(br.readLine());
                j = Integer.parseInt(br.readLine());
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClassWithStatic that = (ClassWithStatic) o;

            if (i != that.i) return false;
            return j == that.j;

        }

        @Override
        public int hashCode() {
            int result = i;
            result = 31 * result + j;
            return result;
        }
    }
}
