package ua.javarush.task.task14.task1408;

public class MoldovanHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 10;
    }

    public String getDescription(){
        return super.getDescription() + " Моя країна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яєць на місяць.";
    }
}
