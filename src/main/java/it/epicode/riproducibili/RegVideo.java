package it.epicode.riproducibili;

import it.epicode.multimedia.Multimediale;

import java.util.Scanner;

public class RegVideo extends Riproducibile implements Multimediale {
    private int luminosita;
    private int volume;
    private int durata;



    // metodo alzaVolume che stampa il volume aumentato
    public void alzaVolume() {
        volume++;
        System.out.println("Volume aumentato: " + volume);
    }

    // metodo abbassaVolume che stampa il volume diminuito
    public void abbassaVolume() {
        volume--;
        System.out.println("Volume diminuito: " + volume);
    }

    // metodo che ritorna puunti esclamativi per il volume
    public String getVolume() {
        String puntiEsclamativi = "";
        for (int i = 0; i < volume; i++) {
            puntiEsclamativi += "!";
        }
        return puntiEsclamativi;
    }

    public void aumentaLuminosita() {
        luminosita++;
        System.out.println("Luminosita aumentata: " + luminosita);
    }

    public void diminuisciLuminosita() {
        luminosita--;
        System.out.println("Luminosita diminuita: " + luminosita);
    }

 //metodo che ritorna asterischi per la luminosita
    public String getLuminosita() {
        String asterischi = "";
        for (int i = 0; i < luminosita; i++) {
            asterischi += "*";
        }
        return asterischi;
    }



    // metodo play accetta tramite scanner il nome il volume (con AlzaVolume e AbbassaVolume) e la durata e stampa per ogni intero della durata il titolo e tanti punti esclamativi quanti ne sono stati inseriti per il volume e tanti asterischi per la luminosita
    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il titolo: ");
        String titolo = scanner.nextLine();
        System.out.println("Inserisci il volume: ");
        volume = scanner.nextInt();
        System.out.println("Inserisci la luminosita: ");
        luminosita = scanner.nextInt();
        System.out.println("Inserisci la durata: ");
        durata = scanner.nextInt();
        System.out.println("Titolo: " + titolo);
        System.out.println("Volume: " + getVolume());
        System.out.println("Luminosita: " + getLuminosita());
        for (int i = 0; i < durata; i++) {
            System.out.println("Durata: " + i);
        }
    }

    @Override
    public void esegui() {
        play();
    }
}


