package com.company;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serial;
import java.util.*;

/**
 * Modela al Administrador de cada club de Futbol.
 * Este se ocupa de administrar los datos del torneo
 * */

public class Admin extends Usuario{
    @Serial
    private static final long serialVersionUID = 1L;

    private Map<Torneo, ArrayList<DT>> torneoDeUsuarios = new HashMap<>();

    public Admin(String nombre) {
        super(nombre);
    }

    /**Metodo para que el front.controller pueda tener acceso a los torneos y asi poder mostrarlos al admin*/
    public Set<Torneo> getTorneo() {
        return torneoDeUsuarios.keySet();
    }

    /**
     * @param nombre el nombre del torneo a retornar
     * @return el trorneo especificado
     */
    public Torneo getTorneo(String nombre) {
        for (Torneo t : torneoDeUsuarios.keySet()) {
            if (t.getNombre().compareTo(nombre) == 0)
                return new Torneo(t);
        }
        return null;
    }

    /**Agrega un torneo
     * @param t el torneo a agregar*/
    public void addTorneo(Torneo t){
        torneoDeUsuarios.put(new Torneo(t), new ArrayList<>());
    }

    /** Crea un torneo
     * @param nombreTorneo nombre del torneo a crear
     * @param maxJugadores cantidad maxima de juagores en el torneo
     * @return true si no existe ya un torneo con ese nombre, false si existe
     * */
    public boolean crearTorneo(String nombreTorneo, int maxJugadores){
        if(nombreTorneo.equals("") || maxJugadores < 0)
            return false;

        Torneo torneo = new Torneo(nombreTorneo, maxJugadores);
        torneo.setAdmin(this);
        addTorneo(torneo);
        return true;
    }

    /**
     *
     * @param t
     * @return
     */
    public ArrayList<DT> getDTsOrdenados(Torneo t) {
        ArrayList<DT> usuarios = new ArrayList<DT>();
        usuarios =  torneoDeUsuarios.get(t);
        usuarios.sort(new Comparator<DT>() {
            @Override
            public int compare(DT dt1, DT dt2) {
                return dt2.getPuntos(t) - dt1.getPuntos(t);
            }
        });
        return usuarios;
    }

    /**
     * Confirma si el torneo existe.
     * @param t el torneo a buscar.
     * @return true si existe, false caso contrario.
     * */
    public boolean existeTorneo(Torneo t) {
        return torneoDeUsuarios.containsKey(t);
    }

    /*public boolean buscarTorneo(String nombre){
        for(ClubReal equipo : equipos) {
            if (club.equals(equipo))
                return true;
        }
        return false;
    }*/

    /**
     * Agrega un Dt a un torneo.
     * @param nombreTorneo nombre del torneo a ser agregado.
     * @param dt dt a agregar.
     * */
    public void addDT(String nombreTorneo, DT dt) {
        Torneo torneo = getTorneo(nombreTorneo);
        torneoDeUsuarios.get(torneo).add(dt);
    }

    /**
     * Actualiza los datos
     * @param dataTorneo La informacion recibida a ser transmitida hacia las demas clases
     * */
    public void actualizar(Map<String, Map<String, Map<String, Jugador.Propiedades>>> dataTorneo){
        for (Torneo torneo : torneoDeUsuarios.keySet()) {
            if(dataTorneo.get(torneo.getNombre()) != null) {
                torneo.actualizar(dataTorneo.get(torneo.getNombre()));
                actualizarDTs(torneo.getNombre(), dataTorneo.get(torneo.getNombre()));
            }
        }
    }

    /**
     * Se encarga de pasar la informacion a los DTS
     * @param nombreTorneo nombre del torneo que se está actualizando
     * @param torneo informacion nueva del torneo
     * */
    private void actualizarDTs(String nombreTorneo, Map<String, Map<String, Jugador.Propiedades>> torneo){
        Torneo t = getTorneo(nombreTorneo);
        ArrayList<DT> dts = torneoDeUsuarios.get(t);
        if (dts != null) {
            for (DT dt : dts) {
                dt.refreshPuntos(t, unificarJugadores(torneo));
            }
        }
    }

    /**Junta todos los jugadores de todos los teams en un solo arreglo
     * @param equipos los equipos a unificar
     * @return un mapa con todos los jugaroes de los equipos*/
    private Map<String,Jugador.Propiedades> unificarJugadores(Map<String, Map<String, Jugador.Propiedades>> equipos)  {
        Map<String, Jugador.Propiedades> unificar = new HashMap<>();
        for (Map<String, Jugador.Propiedades> equipo : equipos.values()) {
            unificar.putAll(equipo);
        }
        return unificar;
    }

    @Override
    public String toString() {
        return "Admin: " + nombre + Arrays.toString(torneoDeUsuarios.keySet().toArray());
    }

   	private void escribirObjeto(ObjectOutputStream out) throws IOException{
        out.defaultWriteObject();
        out.writeUTF(nombre);
        out.writeObject(torneoDeUsuarios);
    }

    private void leerObjeto(ObjectInputStream ois) throws IOException, ClassNotFoundException{
        ois.defaultReadObject();
        nombre = ois.readUTF();
        torneoDeUsuarios = (Map<Torneo, ArrayList<DT>>) ois.readObject();
    }
}
