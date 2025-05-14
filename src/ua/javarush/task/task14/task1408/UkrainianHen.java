package ua.javarush.task.task14.task1408;

public class UkrainianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 40;
    }

    public String getDescription(){
        return super.getDescription() + " Моя країна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яєць на місяць.";
    }
}
