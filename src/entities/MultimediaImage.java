package entities;

import interfaces.Brightness;

public class MultimediaImage extends Multimedia implements Brightness {
    private int brightness;

    public MultimediaImage(String title, int brightness) {
        super(title);
        this.brightness = brightness;
    }

    public void show() {

    }

    @Override
    public void upBrightness() {

    }

    @Override
    public void downBrightness() {

    }
}
