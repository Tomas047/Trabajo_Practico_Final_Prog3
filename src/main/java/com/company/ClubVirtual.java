package com.company;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Clase que representa el equipo de futbol virtual.
 */

public class ClubVirtual extends Club implements Serializable {
    private static final long serialVersionUID = 1L;
    private int puntos = 0;

    public ClubVirtual(int maxJugadores){
        super(maxJugadores);
    }

    ///Puntos --------------------------
    public int getPuntos(){
        return puntos;
    }

    public void setPuntos(int puntos){
        this.puntos = puntos;
    }

    ///Otros ---------------------------
    /**
     * Método para actualizar los puntos del usuario que el mismo recibe en función de este equipo.
     * @param p Las propiedades nuevas
     */
    public void actualizarPuntos(Jugador.Propiedades p){
        puntos += p.getPuntos();
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof ClubVirtual))
            return false;
        ClubVirtual aux = (ClubVirtual) o;
        return super.equals(aux);
    }

    private void escribirArchivo(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeInt(puntos);
    }

    private void leerArchivo(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        puntos = ois.readInt();
    }

}
