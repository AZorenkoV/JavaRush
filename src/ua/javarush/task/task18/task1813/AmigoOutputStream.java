package ua.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream fos;

    public AmigoOutputStream(FileOutputStream fos) throws FileNotFoundException {
        super(fileName);
        this.fos = fos;
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

    @Override
    public void close() throws IOException {
        flush();
        this.fos.write("JavaRush © All rights reserved.".getBytes());
        this.fos.close();
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        this.fos.write(b, off, len);
    }

    @Override
    public void write(byte[] b) throws IOException {
        this.fos.write(b);
    }

    @Override
    public void write(int b) throws IOException {
        this.fos.write(b);
    }

    @Override
    public void flush() throws IOException {
        this.fos.flush();
    }
}
