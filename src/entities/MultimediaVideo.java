package entities;

import interfaces.Brightness;
import interfaces.Reproducible;

public class MultimediaVideo extends Multimedia implements Reproducible, Brightness {
    private final int duration;
    private int volume;
    private int brightness;

    public MultimediaVideo(String title, int duration, int volume, int brightness) {
        super(title);
        this.duration = duration;
        this.volume = volume;
        this.brightness = brightness;
    }

    public MultimediaVideo(String title, int duration) {
        this(title, duration, 5, 5);
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
    public void play() {
        for (int i = 0; i < duration; i++) {
            System.out.print("Video: " + title);
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            for (int j = 0; j < brightness; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public void upVolume() {
        if (volume < 10) volume++;
        System.out.println(title + " volume: " + volume);
    }

    @Override
    public void downVolume() {
        if (volume > 0) volume--;
        System.out.println(title + " volume: " + volume);
    }

    @Override
    public String toString() {
        return "MultimediaVideo{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
