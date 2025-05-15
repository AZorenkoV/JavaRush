package ua.javarush.task.task14.task1408;

public class FrenchHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 20;
    }

    public String getDescription(){
        return super.getDescription() + " Моя країна - " + Country.FRANCE + ". Я несу " + getCountOfEggsPerMonth() + " яєць на місяць.";
    }
}
