package ua.javarush.task.task18.task1828;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Прайси 2
*/

public class Solution {
    public static class Product {
        int id;
        String name;
        String price;
        String quantity;

        public Product(int id, String name, String price, String quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return String.format("%-8d%-30s%-8s%-4s", id, name, price, quantity);
        }
    }

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            return;
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        List<Product> products = new ArrayList<>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                Product product = getProduct(fileReader.readLine());
                products.add(product);
            }
        }

        switch (args[0]) {
            case "-u":
                int id = Integer.valueOf(args[1]);;
                String name = "";
                for (int i = 2; i < args.length - 2; i++) {
                    name += args[i] + " ";
                }
                if (name.length() > 30) {
                    name = name.substring(0, 30);
                }
                String price = args[args.length - 2];
                if (price.length() > 8) {
                    price = price.substring(0, 8);
                }
                String quantity = args[args.length - 1];
                if (quantity.length() > 4) {
                    quantity = quantity.substring(0, 4);
                }

                for(Product item : products){
                    if(item.getId() == id){
                        item.name = name;
                        item.price = price;
                        item.quantity = quantity;
                        break;
                    }
                }
                try (FileWriter fileWriter = new FileWriter(fileName)) {
                    for(Product item : products) {
                        fileWriter.write(item.toString());
                        fileWriter.write("\n");
                    }
                }
                break;
            case "-d" :
                int idProduct = Integer.valueOf(args[1]);
                Product forDel = null;
                for(Product item : products){
                    if(item.getId() == idProduct){
                        forDel = item;
                        break;
                    }
                }
                products.remove(forDel);
                try (FileWriter fileWriter = new FileWriter(fileName)) {
                    for(Product item : products) {
                        fileWriter.write(item.toString());
                        fileWriter.write("\n");
                    }
                }

        }
    }

    public static Product getProduct(String string) {
        String id = string.substring(0, 8).trim();
        String name = string.substring(8, 38).trim();
        String price = string.substring(38, 46).trim();
        String quantity = string.substring(46, 50).trim();
        return new Product(Integer.parseInt(id), name, price, quantity);
    }
}
