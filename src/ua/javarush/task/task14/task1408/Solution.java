package ua.javarush.task.task14.task1408;

/* 
Куряча фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.FRANCE);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишіть тут ваш код
            if(country.equals(Country.MOLDOVA)) hen = new MoldovanHen();
            else if(country.equals(Country.FRANCE)) hen = new FrenchHen();
            else if(country.equals(Country.POLAND)) hen = new PolishHen();
            else if(country.equals(Country.UKRAINE)) hen = new UkrainianHen();
            return hen;
        }
    }
}
