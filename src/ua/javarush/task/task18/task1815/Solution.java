package ua.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблиця
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface {

        private TableInterface ti;

        public TableInterfaceWrapper(TableInterface tableInterface) {
            this.ti = tableInterface;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            ti.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return ti.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            ti.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}