package com.company;

import com.company.Complementos.Posicion;
import com.company.Exceptions.*;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("...");

        List<ArrayList> listaDeJugadores = new ArrayList<ArrayList> ();
        ArrayList<Jugador> jugadoresBoca = new ArrayList<Jugador>();

        Jugador ex = new Jugador("Rick Sanchez", 10,76,"ebrio", Posicion.MEDIOCAMPISTA, new Jugador.Propiedades(1,0,0,0,0,0));

        ClubReal clubi = new ClubReal("Boca Juniors", 23, jugadoresBoca);
        jugadoresBoca.add(ex);

        listaDeJugadores.add(jugadoresBoca);
    }
}