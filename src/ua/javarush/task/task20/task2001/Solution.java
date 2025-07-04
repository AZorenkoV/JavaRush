package ua.javarush.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Читаємо та пишемо до файла: Human
*/

public class Solution {
    public static void main(String[] args) {
        try {
            //напишіть тут ваш код
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Human ivanov = new Human("Ivanov", new Asset("home", 999_999.99), new Asset("car", 2999.99));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            //напишіть тут ваш код

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            //напишіть тут ваш код
            PrintWriter pw = new PrintWriter(outputStream);
            pw.println(name);
            pw.println(assets.size());
            for(int i = 0; i < assets.size(); i++) {
                pw.println(assets.get(i).getName());
                pw.println(assets.get(i).getPrice());
            }
            pw.flush();

        }

        public void load(InputStream inputStream) throws Exception {
            //напишіть тут ваш код
            try(BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
                name = br.readLine();
                int assetsCount = Integer.valueOf(br.readLine());
                for (int i = 0; i < assetsCount; i++) {
                    String name = br.readLine();
                    double price = Double.valueOf(br.readLine());
                    assets.add(new Asset(name, price));
                }
            };
        }
    }
}
