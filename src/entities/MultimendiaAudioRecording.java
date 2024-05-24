package entities;

import interfaces.Volume;

public class MultimendiaAudioRecording extends Multimedia implements Volume {
    private int duration;
    private int volume;

    public MultimendiaAudioRecording(String title, int duration, int volume) {
        super(title);
        this.duration = duration;
        this.volume = volume;
    }

    public MultimendiaAudioRecording(String title) {
        this(title, 5, 5);
    }

    public void play() {

    }

    @Override
    public void upVolume() {

    }

    @Override
    public void downVolume() {

    }

    @Override
    public String toString() {
        return "MultimendiaAudioRecording{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
