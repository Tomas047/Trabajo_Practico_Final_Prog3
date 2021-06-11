package com.company;

import com.company.Exceptions.ExisteNombreException;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("...");

        Jugador ex = new Jugador("Rick Sanchez", 10,76,"ebrio","Atacante", new Jugador.Propiedades(1,0,0,0,0,0));

        DT ox = new DT ("Tomas Parant");


        ClubReal clubi = new ClubReal("Atletico Noobs", 20);

        try {
            clubi.addJugador(ex);
        } catch (ExisteNombreException e) {
            e.printStackTrace();
        }

        ArrayList<Jugador> listi  = clubi.getListaJugadores();

        System.out.println("Miembros del equipo: \n");

        for (Jugador e: listi) {
            System.out.println(e.toString());
        }


    }
}