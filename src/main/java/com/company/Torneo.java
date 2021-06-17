package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Torneo implements Serializable {
    private static final long serialVersionUID = 1L;
    private ArrayList<ClubReal> equipos;
    private Admin admin;
    private String nombre;
    private int maxJugadores;

    public Torneo(String nombre, int maxJugadores){
        this.nombre = nombre;
        this.maxJugadores = maxJugadores;
        equipos = new ArrayList<>();
    }

   /* public Torneo(String nombre, int maxJugadores, ArrayList<ClubReal> equipos){
        this.nombre = nombre;
        this.maxJugadores = maxJugadores;
        this.equipos = equipos;
    }*/


    public Torneo(Torneo t) {
        this(t.getNombre(), t.getMaxJugadores());
        equipos.addAll(t.getEquipos());
    }


    ///Nombre --------------------------
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    ///Maximos Jugadores ---------------
    public int getMaxJugadores(){
        return maxJugadores;
    }

    public void setMaxJugadores(int maxJugadores){
        this.maxJugadores = maxJugadores;
    }

    ///Admin ---------------------------
    public Admin getAdmin(){
        return admin;
    }

    public void setAdmin(Admin admin){
        this.admin = admin;
    }

    ///Equipos --------------------------
    public ArrayList<ClubReal> getEquipos(){ ///Chusmear la otra forma si no anda
        return equipos;
        ///return new ArrayList<>(equipos);
    }

    public ClubReal getEquipo(String nombreEquipo){
        for(ClubReal equipo : equipos)
            if(equipo.getNombre().equals(nombreEquipo))
                return equipo;
        return null;
    }

    public void addClub(ClubReal club){
        equipos.add(club);
        ///equipos.add(new ClubReal(club.getNombre(), maxJugadores, club.listaJugadores));
    }

    public boolean buscarClub(ClubReal club){
        for(ClubReal equipo : equipos) {
            if (club.equals(equipo))
                return true;
        }
        return false;
    }

    /**
     * Transifiere la informacion nueva subida por el adminsitrador a los equipos del torneo
     * @param datosEquipos informacion ed ada equipo
     * */
    void actualizar(Map<String, Map<String, Jugador.Propiedades>> datosEquipos) {
        for (ClubReal equipo : equipos) {
            if(datosEquipos.get(equipo.getNombre()) != null)
                equipo.actualizar(datosEquipos.get(equipo.getNombre()));
        }
    }
    /**
     * @return Ranking de un determinado jugador fisico.
     * @param jugador jugador fisico.
     * */
    public int getRanking(Jugador jugador) {
        Map<Jugador,Integer> jugadores = unificarJugadores();
        return jugadores.get(jugador);
    }
    /**
     * Se requiere unificar todos los jugadores para ser accedidos
     */
    private Map<Jugador,Integer> unificarJugadores() {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        for (ClubReal equipo : equipos) {
            jugadores.addAll(equipo.getListaJugadores());
        }
        Map<Jugador,Integer> map = new HashMap<>();
        jugadores.sort((j1, j2) -> j2.getPuntos() - j1.getPuntos());
        for (int i = 0; i< jugadores.size(); i++)
            map.put(jugadores.get(i),i+1);
        return map;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || !(obj instanceof Torneo))
            return false;
        Torneo torneo = (Torneo) obj;
        return nombre.equals(torneo.nombre);
    }

    @Override
    public int hashCode() {
        return nombre != null ? nombre.hashCode()*2 : 0;
    }

    @Override
    public String toString() {
        return "Nombre del torneo: " + nombre + Arrays.toString(equipos.toArray());
    }

    private void escribirObjeto(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeUTF(nombre);
        out.writeInt(maxJugadores);
        out.writeObject(equipos);
    }

    private void leerObjeto(ObjectInputStream ois) throws IOException,ClassNotFoundException{
        ois.defaultReadObject();
        nombre = ois.readUTF();
        maxJugadores = ois.readInt();
        equipos = (ArrayList<ClubReal>) ois.readObject();
    }


}
