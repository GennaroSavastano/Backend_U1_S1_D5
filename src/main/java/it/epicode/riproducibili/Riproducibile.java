package it.epicode.riproducibili;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Riproducibile {
    protected String titolo;

    public abstract void play();
 }
