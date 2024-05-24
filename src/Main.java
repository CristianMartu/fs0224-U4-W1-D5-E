import entities.Multimedia;
import entities.MultimediaImage;
import entities.MultimediaVideo;
import entities.MultimendiaAudioRecording;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*    Scanner scanner = new Scanner(System.in);
        Multimedia[] elements = new Multimedia[5];
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
//          System.out.print("    Durata: ");
//            int duration = Integer.parseInt(scanner.nextLine());

            switch (type) {
                case 1:
                    elements[i] = new MultimediaImage(title);
//                    element = new MultimediaImage(title, duration);
                    break;
                case 2:
                    elements[i] = new MultimendiaAudioRecording(title);
//                    element = new MultimendiaAudioRecording(title, duration);
                    break;
                case 3:
                    elements[i] = new MultimediaVideo(title);
//                    element = new MultimediaVideo(title, duration);
                    break;
                default:
                    System.out.println("Errore: inserire un numero da 1 a 3");
                    System.out.println("    Inserito default: 1");
                    elements[i] = new MultimediaImage(title);
            }
            System.out.println("    " + elements[i] + "\n");
        }
        System.out.println(Arrays.toString(elements));

        scanner.close();
     */
        MultimediaImage img = new MultimediaImage("Casa");
        MultimendiaAudioRecording audio = new MultimendiaAudioRecording("Cibo");
        MultimediaVideo video = new MultimediaVideo("Prank");
        MultimediaImage img2 = new MultimediaImage("Moto");
        MultimediaVideo video2 = new MultimediaVideo("Ciccio");

        Multimedia[] elementi = {img, audio, video, img2, video2};
        System.out.println(Arrays.toString(elementi));


        Scanner scanner = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("    Esegui file multimediale");
            System.out.print("    inserire un numero da 1 a 5 oppure 0 per terminare: ");
            num = Integer.parseInt(scanner.nextLine());
            switch (num) {
                case 1, 2, 3, 4, 5:
                    if (elementi[num - 1] instanceof MultimediaImage) {
                        System.out.println(elementi[num - 1]);
                    } else {
                        System.out.println("Elemento riproducibile " + elementi[num - 1]);

                    }
                    break;
                default:
                    System.out.println("Errore: inserire un numero da 0 a 5");
            }
        } while (num != 0);
        scanner.close();
    }
}