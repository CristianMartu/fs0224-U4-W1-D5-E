package entities;

import interfaces.Brightness;

public class MultimediaImage extends Multimedia implements Brightness {
    private int brightness;

    public MultimediaImage(String title, int brightness) {
        super(title);
        this.brightness = brightness;
    }

    public MultimediaImage(String title) {
        this(title, 5);
    }

    public void show() {

    }

    @Override
    public void upBrightness() {

    }

    @Override
    public void downBrightness() {

    }

    @Override
    public String toString() {
        return "MultimediaImage{" +
                "title='" + title + '\'' +
                '}';
    }
}
