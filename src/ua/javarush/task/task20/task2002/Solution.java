package ua.javarush.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаємо та пишемо до файлу: JavaRush
*/

public class Solution {
    public static void main(String[] args) {
        try {
            //напишіть тут ваш код
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //напишіть тут ваш код
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
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

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream){
            //напишіть тут ваш код
            PrintWriter pw = new PrintWriter(outputStream);
            pw.println(users.size());
            for (int i = 0; i < users.size(); i++) {
                pw.println(users.get(i).getFirstName());
                pw.println(users.get(i).getLastName());
                pw.println(users.get(i).getBirthDate().getTime());
                pw.println(users.get(i).isMale());
                pw.println(users.get(i).getCountry());
            }
            pw.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            //напишіть тут ваш код
            try(BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
                int usersCount = Integer.parseInt(br.readLine());
                for (int i = 0; i < usersCount; i++) {
                    User user = new User();
                    user.setFirstName(br.readLine());
                    user.setLastName(br.readLine());
                    user.setBirthDate(new Date(Long.parseLong(br.readLine())));
                    user.setMale(br.readLine().equals("true"));
                    switch (br.readLine()) {
                        case "UKRAINE" :
                            user.setCountry(User.Country.UKRAINE);
                            break;
                        case "USA" :
                            user.setCountry(User.Country.USA);
                            break;
                        default:
                            user.setCountry(User.Country.OTHER);
                            break;
                    }
                    users.add(user);
                }
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
