package ua.javarush.task.task18.task1812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Розширюємо AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream aos;

    public QuestionFileOutputStream(AmigoOutputStream amigoOutputStream) {
        this.aos = amigoOutputStream;
    }

    @Override
    public void flush() throws IOException {
        aos.flush();
    }

    @Override
    public void write(int b) throws IOException {
        aos.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        aos.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        aos.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ви дійсно хочете закрити потік? Т/Н");
        if((console.readLine()).equals("Т")) aos.close();

    }
}

