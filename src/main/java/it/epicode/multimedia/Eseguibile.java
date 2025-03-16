package it.epicode.multimedia;

public class Eseguibile {
    public static void  eseguiMultimediale( Multimediale oggetto ) {
        if(oggetto != null)
           oggetto.esegui();

    }

    public static void eseguiMultimediale( Multimediale[] oggetti ) {
        for (int i = 0; i < oggetti.length; i++) {
            {
                oggetti[i].esegui();
            }
        }

    }
}
