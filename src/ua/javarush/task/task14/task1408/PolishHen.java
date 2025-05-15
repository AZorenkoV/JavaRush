package ua.javarush.task.task14.task1408;

public class PolishHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 30;
    }

    public String getDescription(){
        return super.getDescription() + " Моя країна - " + Country.POLAND + ". Я несу " + getCountOfEggsPerMonth() + " яєць на місяць.";
    }
}
