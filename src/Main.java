import entities.Multimedia;
import entities.MultimediaImage;
import entities.MultimediaVideo;
import entities.MultimendiaAudioRecording;
import interfaces.Reproducible;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Multimedia[] elements = new Multimedia[5];
        int duration = 5;
        System.out.println("Inserisci cinque elementi multimediali:");
        for (int i = 0; i < elements.length; i++) {
            System.out.println("    Elemento multimediale");
            System.out.println("        inserire 1 se immagine");
            System.out.println("        inserire 2 se audio");
            System.out.println("        inserire 3 se video");
            System.out.print("        numero: ");
            int type = Integer.parseInt(scanner.nextLine());
            System.out.print("    Titolo: ");
            String title = scanner.nextLine();
            if (type != 1) {
                System.out.print("    Durata: ");
                duration = Integer.parseInt(scanner.nextLine());
            }

            switch (type) {
                case 1:
                    elements[i] = new MultimediaImage(title);
                    break;
                case 2:
                    elements[i] = new MultimendiaAudioRecording(title, duration);
                    break;
                case 3:
                    elements[i] = new MultimediaVideo(title, duration);
                    break;
                default:
                    System.out.println("Errore: inserire un numero da 1 a 3");
                    System.out.println("    Inserito default: 1");
                    elements[i] = new MultimediaImage(title);
            }
            System.out.println("    " + elements[i] + "\n");
        }
        System.out.println(Arrays.toString(elements) + "\n");


        int num;
        System.out.println("Esegui file multimediali");
        do {
            System.out.println();
            System.out.print("inserire un numero da 1 a 5 oppure 0 per terminare: ");
            num = Integer.parseInt(scanner.nextLine());
            switch (num) {
                case 0:
                    System.out.println("Terminato con successo");
                    break;
                case 1, 2, 3, 4, 5:
                    if (elements[num - 1] instanceof MultimediaImage) {
                        ((MultimediaImage) elements[num - 1]).show();
//                        ((MultimediaImage) elements[num - 1]).upBrightness();
//                        ((MultimediaImage) elements[num - 1]).downBrightness();
                    } else {
                        ((Reproducible) elements[num - 1]).play();
//                        ((Reproducible) elements[num - 1]).upVolume();
//                        ((Reproducible) elements[num - 1]).downVolume();
                    }
                    break;
                default:
                    System.out.println("Errore: inserire un numero da 0 a 5");
            }
        } while (num != 0);
        scanner.close();
    }
}