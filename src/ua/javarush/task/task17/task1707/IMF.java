package ua.javarush.task.task17.task1707;


public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        //напишіть тут ваш код
        synchronized (IMF.class){
            if(imf == null) imf = new IMF();
        }
        return imf;
    }

    private IMF() {
    }
}
