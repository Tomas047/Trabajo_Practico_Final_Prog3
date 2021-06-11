package com.company;

import com.company.Exceptions.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Clase de administración de equipos del DT.
 */

public class AdministracionEquipo implements Serializable {
    private static final long serialVersionUID = 1L;
    private Map<Torneo, ClubVirtual> equipos = new HashMap<>();

    /**
     * Método para registrar la creación y uso de un equipo virtual en un torneo particular.
     * @param t
     */
    public void addNuevoEquipo(Torneo t) {
        equipos.put(t, new ClubVirtual(t.getMaxJugadores()));
    }

    /**
     * Método para remover un jugador comprado de un equipo virtaul en un torneo en particular.
     * @param t
     * @param j
     */
    void removeJugador(Torneo t, Jugador j) {
        equipos.get(t).removeJugador(j);
    }

    /**
     * Método para agregar un jugador de un torneo en particular a un equipo según el torneo.
     * @param t
     * @param j
     */
    void addJugador(Torneo t, Jugador j) throws EquipoCompletoException, ExisteNombreException{
        equipos.get(t).addJugador(j);
    }

    /**
     * Método para determinar si el usuario se encuentra participando de un torneo.
     * @param t
     * @return Si participa o no
     */
    boolean estaParticipando(Torneo t) {
        return equipos.containsKey(t);
    }

    /**
     * Método para conseguir una lista con los jugadores de un equipo virtual en un torneo en particular.
     * @param t
     * @return Arreglo de Jugadores del torneo.
     */
    public ArrayList<Jugador> getPlantel(Torneo t) {
        return equipos.get(t).getListaJugadores();
    }

    /**
     * Método para conseguir los puntos de un usuario en un torneo particular.
     * @param t
     * @return Puntos del usuario en el torneo t
     */
    int getPuntosDeUsuario(Torneo t) {
        if (equipos.get(t) == null)
            return 0;
        return equipos.get(t).getPuntos();
    }

    /**
     * Método para actualizar los puntos del usuario en función de los cambios hechos a los jugadores que componen los equipos virtuales del usuario.
     * @param propiedadesMap
     * @param t
     */
    void refreshPuntos(Map<String, Jugador.Propiedades> propiedadesMap, Torneo t) {
        ClubVirtual club = equipos.get(t);
        for (Jugador j : club.getListaJugadores()) {
            for (String nombre : propiedadesMap.keySet()) {
                if (j.getNombre().equals(nombre)) {
                    club.actualizarPuntos(propiedadesMap.get(j.getNombre()));
                }
            }
        }
    }

    ///FALTAN METODOS READ & WRITE PARA ARCHIVOS
}