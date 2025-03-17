package it.epicode.MediaPlayer;

import it.epicode.riproducibili.Immagine;
import it.epicode.riproducibili.RegAudio;
import it.epicode.riproducibili.RegVideo;

import java.util.Scanner;

public class Player {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scelta ;
        do {
            System.out.println( "---------------------------------------- ");
            System.out.println( "------------- Media Player -------------");
            System.out.println( "---------------------------------------- ");
            System.out.println("");
            System.out.println("1. Riproduci File Audio");
            System.out.println("2. Riproduci File Video");
            System.out.println("3. Riproduci Immagine");
            System.out.println("");
            System.out.println("4. Esci");
            System.out.println("");
            System.out.println("Scegli un'opzione: ");
            int scelta = scanner.nextInt();
            switch (scelta) {
                case 1 :
                    RegAudio regAudio = new RegAudio();
                    regAudio.esegui();
                    break;
                case 2 :
                    RegVideo regVideo = new RegVideo();
                    regVideo.esegui();
                    break;
                case 3 :
                    Immagine immagine = new Immagine();
                    immagine.esegui();
                    break;
                case 4 :
                    System.out.println("Arrivederci");
                    scanner.close();
                    break;
                default:
                    System.out.println("Scelta non valida");
        }

        } while (scelta != 4);
    }
}
