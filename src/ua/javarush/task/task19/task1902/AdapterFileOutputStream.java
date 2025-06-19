package ua.javarush.task.task19.task1902;

import java.io.FileOutputStream;
import java.io.IOException;

/* 
Адаптер
*/

public class AdapterFileOutputStream implements AmigoStringWriter{

    private FileOutputStream fileOutputStream;

    public static void main(String[] args) {

    }

    public AdapterFileOutputStream(FileOutputStream fis){
        this.fileOutputStream = fis;
    }

    @Override
    public void flush() throws IOException {
        this.fileOutputStream.flush();
    }

    @Override
    public void writeString(String s) throws IOException {
        this.fileOutputStream.write(s.getBytes());
    }

    @Override
    public void close() throws IOException {
        this.fileOutputStream.close();
    }
}

