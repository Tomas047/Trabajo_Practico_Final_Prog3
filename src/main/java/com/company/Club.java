package com.company;

import com.company.Exceptions.*;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * Modela un equipo de futbol fisico o virtual
 */

public abstract class Club implements Serializable{
    private int maxJugadores;
    ArrayList<Jugador> listaJugadores;

    public Club(int maxJugadores){
        this.maxJugadores = maxJugadores;
    }
    public Club(int maxJugadores, ArrayList<Jugador> listaJugadores){
        this.maxJugadores = maxJugadores;
        this.listaJugadores = listaJugadores; ////MODIFICACION, AHORA NO LA CREA Y LA RECIBE DIRECTAMENTE
    }

    ///Max Jugadores --------------------
    public int getMaxJugadores(){
        return maxJugadores;
    }

    public void setMaxJugadores(int maxJugadores){
        this.maxJugadores = maxJugadores;
    }

    ///Lista ----------------------------
    public ArrayList<Jugador> getListaJugadores(){
        return listaJugadores;
    }

    ///Otros ----------------------------
    /**
     * Agrega un jugador al equipo
     * @param a  el nuevo jugador*/
    void addJugador(Jugador a) throws EquipoCompletoException, ExisteNombreException{
        if(listaJugadores.size() <= maxJugadores){
            throw new EquipoCompletoException();
        }
        if(listaJugadores.contains(a)){
            throw new ExisteNombreException();
        }
        listaJugadores.add(a);
    }

    /**
     * Remueve un jugador del equipo
     * @param a  el jugador a ser removido*/
    void removeJugador(Jugador a){
        listaJugadores.remove(a);
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Club))
            return false;
        Club aux = (Club) o;
        if(maxJugadores != aux.maxJugadores)
            return false;
        for(Jugador j1 : listaJugadores) {
            for(Jugador j2: aux.getListaJugadores())
                if(!j1.equals(j2))
                    return false;
        }
        return true;
    }
    private void escribirObjeto(ObjectOutputStream out)throws IOException {
        out.defaultWriteObject();
        out.writeObject(listaJugadores);
    }

    private void leerObjeto(ObjectInputStream ois) throws IOException,ClassNotFoundException{
        ois.defaultReadObject();
        listaJugadores = (ArrayList<Jugador>)ois.readObject();
    }

}
