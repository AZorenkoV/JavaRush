package ua.javarush.task.task16.task1631;

import ua.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageTypes){
        if(!(imageTypes instanceof ImageTypes)) throw new IllegalArgumentException("Невідомий тип картинки");
        switch (imageTypes) {
            case BMP : return new BmpReader();
            case JPG : return new JpgReader();
            case PNG : return new PngReader();
            default : throw new IllegalArgumentException("Невідомий тип картинки");
        }
    }
}
