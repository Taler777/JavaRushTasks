package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes imageTypes) {
        ImageReader imageReader = null;
        if (imageTypes==ImageTypes.BMP) {
            imageReader = new BmpReader();
        } else if (imageTypes==ImageTypes.JPG) {
            imageReader = new JpgReader();
        } else if (imageTypes==ImageTypes.PNG) {
            imageReader = new PngReader();
        } else if (imageReader == null) {
            throw new IllegalArgumentException();
        } else throw new IllegalArgumentException();
        return imageReader;
    }
}