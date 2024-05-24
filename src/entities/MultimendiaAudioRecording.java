package entities;

import interfaces.Reproducible;

public class MultimendiaAudioRecording extends Multimedia implements Reproducible {
    private final int duration;
    private int volume;

    public MultimendiaAudioRecording(String title, int duration, int volume) {
        super(title);
        this.duration = duration;
        this.volume = volume;
    }

    public MultimendiaAudioRecording(String title, int duration) {
        this(title, duration, 5);
    }


    @Override
    public String toString() {
        return "MultimendiaAudioRecording{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }

    @Override
    public void play() {
        for (int i = 0; i < duration; i++) {
            System.out.print("Audio: " + title);
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
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
}
