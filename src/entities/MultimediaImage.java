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
        System.out.print("Immagine: " + title);
        for (int j = 0; j < brightness; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    @Override
    public void upBrightness() {
        if (brightness < 10) brightness++;
        System.out.println(title + " luminosità: " + brightness);
    }

    @Override
    public void downBrightness() {
        if (brightness > 0) brightness--;
        System.out.println(title + " luminosità: " + brightness);
    }

    @Override
    public String toString() {
        return "MultimediaImage{" +
                "title='" + title + '\'' +
                '}';
    }
}
