package it.epicode.riproducibili;

import it.epicode.multimedia.Multimediale;

import java.util.Scanner;

public class Immagine implements Multimediale {
    private int luminosita;

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

    //metodo show accetta tramite scanner il titolo e la luminosita e stampa il titolo concatenato a tanti asterischi pari alla luminosità

    public void show() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il titolo: ");
        String titolo = scanner.nextLine();
        System.out.println("Inserisci la luminosita: ");
        luminosita = scanner.nextInt();
        System.out.println("Titolo: " + titolo + " " + getLuminosita());

    }

    @Override
    public void esegui() {
        show();
    }
}
