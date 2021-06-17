package com.company;

import com.company.Exceptions.*;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class ClubReal extends Club implements Serializable {
    private static final long serialVersionUID = 1L;


/*
    public ClubReal(String nombre, int maxJugadores, ArrayList<Jugador> listaJugadores){
        super(maxJugadores, listaJugadores);
        this.nombre = nombre;
    }

    public ClubReal(String nombre, int maxJugadores, ClubReal equipo){
        super(maxJugadores);
        this.nombre = nombre;
        super.listaJugadores.addAll(equipo.getListaJugadores());
    }*/

    public ClubReal(String nombre, int maxJug) {
        super(maxJug);
        this.nombre = nombre;
    }

    ClubReal(String nombre, ClubReal equipo, int maxJug) {
        this(equipo.getNombre(), maxJug);
        this.nombre = nombre;
        listaJugadores.addAll(equipo.getListaJugadores());
    }

    ///Nombre -----------------------------
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    ///Jugadores Equipo -------------------
    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    ///Otros ------------------------------
    /**
     * Agrega un jugador al equipo
     * @param a el nuevo jugador
     * */
    @Override
    void addJugador(Jugador a) throws ExisteNombreException{
        if(listaJugadores.contains(a))
            throw new ExisteNombreException();
        listaJugadores.add(a);
    }

    /**
     * Se encarga de actualizar los datos
     * @param datosJugador la informacion nueva
     * */
    void actualizar(Map<String, Jugador.Propiedades > datosJugador){
        for(Jugador miJugador : listaJugadores){
            miJugador.asignar(datosJugador.get(miJugador.getNombre()));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClubReal clubReal = (ClubReal) o;
        return super.equals(o) && (nombre != null ? nombre.equals(clubReal.nombre) : clubReal.nombre == null);
    }

    @Override
    public int hashCode() {
        return nombre != null ? nombre.hashCode()*3 : 0;
    }

    @Override
    public String toString() {
        return "\n\nNombre del equipo: " + nombre + Arrays.toString(listaJugadores.toArray());
    }

    private void leerObjeto(ObjectOutputStream out)throws IOException {
        out.defaultWriteObject();
        out.writeUTF(nombre);
        out.writeObject(listaJugadores);
    }

    private void escribirObjeto(ObjectInputStream ois) throws IOException,ClassNotFoundException{
        ois.defaultReadObject();
        nombre = ois.readUTF();
        listaJugadores = (ArrayList<Jugador>)ois.readObject();
    }
}
