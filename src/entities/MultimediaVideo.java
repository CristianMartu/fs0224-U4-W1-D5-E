package entities;

import interfaces.Brightness;
import interfaces.Volume;

public class MultimediaVideo extends Multimedia implements Volume, Brightness {
    private int duration;
    private int volume;
    private int brightness;

    public MultimediaVideo(String title, int duration, int volume, int brightness) {
        super(title);
        this.duration = duration;
        this.volume = volume;
        this.brightness = brightness;
    }

    public MultimediaVideo(String title) {
        this(title, 5, 5, 5);
    }

    public void play() {

    }

    @Override
    public void upBrightness() {

    }

    @Override
    public void downBrightness() {

    }

    @Override
    public void upVolume() {

    }

    @Override
    public void downVolume() {

    }

    @Override
    public String toString() {
        return "MultimediaVideo{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
