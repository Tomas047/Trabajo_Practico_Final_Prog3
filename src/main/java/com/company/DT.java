package com.company;

import com.company.Exceptions.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

/**
 * Clase que representa un usuario que participa sumando puntos, vendiendo y comprando jugadores a lo largo de un torneo.
 */
public class DT extends Usuario{
    private static final long serialVersionUID = 1L;
    private Presupuesto presupuesto = new Presupuesto();
    private AdministracionEquipo adminEquipo = new AdministracionEquipo();

    public DT(String nombre){
        super(nombre);
    }

    /**
     * Método para conseguir los puntos de un jugador en un torneo.
     * @param t De tipo Torneo, representa el torneo.
     */
    public int getPuntos(Torneo t) {
        return adminEquipo.getPuntosDeUsuario(t);
    }

    /**
     * Método para vender un jugador
     * @param t Representa el torneo.
     * @param j Representa el jugador que quiere vender.
     */
    public void vender(Torneo t , Jugador j) {
        presupuesto.vender(t, j);
        adminEquipo.removeJugador(t, j);
    }

    /**
     * Método para comprar un jugador
     * @param t Representa el torneo.
     * @param j Representa el jugador que quiere vender.
     */
    public void comprar(Torneo t, Jugador j)  throws FondoInsuficienteException, EquipoCompletoException, ExisteNombreException{
        presupuesto.comprar(t, j);
        adminEquipo.addJugador(t, j);
    }

    /**
     * Método para inscribirse en un torneo.
     * @param t Representa el torneo en el cual desea inscribirse.
     */
    public void inscribirse(Torneo t) {
        presupuesto.setPresupuestoInicial(t);
        adminEquipo.addNuevoEquipo(t);
    }

    /**
     * Método para obtener acceso al DTWallet del usuario.
     * @return Devuelve el presupuesto del usuario.
     */
    public Presupuesto getPresupuesto() {
        return presupuesto;
    }

    /**
     * Método para saber si el usuario se ha inscripto en un torneo.
     * @param t Representa el torneo.
     */
    public boolean estaInscripto(Torneo t) {
        return adminEquipo.estaParticipando(t);
    }

    /**
     *
     */
    public AdministracionEquipo getAdminEquipo() {
        return adminEquipo;
    }

    /**
     * Método que actuializa puntos
     * @param t El torneo en cuestión.
     * @param propiedadesMap Mapa de los nombres de los jugadores a las Propiedades.
     */
    public void refreshPuntos(Torneo t, Map<String, Jugador.Propiedades> propiedadesMap) {
        adminEquipo.refreshPuntos(propiedadesMap, t);
    }

    @Override
    public boolean equals(Object o) {
        return this == o || o instanceof DT && super.equals(o);
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int hashCode(){
        int resultado = super.hashCode();
        resultado = resultado * 5;
        return resultado;
    }

    private void escribirArchivo(ObjectOutputStream out) throws IOException{
        out.defaultWriteObject();
        out.writeUTF(nombre);
        out.writeObject(presupuesto);
        out.writeObject(adminEquipo);
    }

    private void leerArchivo(ObjectInputStream ois) throws IOException,ClassNotFoundException{
        ois.defaultReadObject();
        nombre = ois.readUTF();
        presupuesto = (Presupuesto) ois.readObject();
        adminEquipo = (AdministracionEquipo)ois.readObject();
    }
}
