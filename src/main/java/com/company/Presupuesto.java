package com.company;

import com.company.Exceptions.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Clase que maneja el presupuesto del usuario.
 */

public class Presupuesto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Map<Torneo, Integer> fondos = new HashMap<>();
    private static final int presupuestoInicial = 60000;

    /**
    * Método que determina si el usuario tiene suficientes fondos para comprar un jugador.
    * @param t
    * @param j
    * @return Si tiene suficientes fondos para comprar el jugador
    * */
    public boolean consultarFondos(Torneo t, Jugador j){
        return fondos.get(t) >= j.getPrecio();
    }

    /**
     * Método que registra nuevos fondos
     * @param t
     */
    public void setPresupuestoInicial(Torneo t){
        fondos.put(t, presupuestoInicial);
    }

    public int getPresupuestoInicial(Torneo t) {
        return fondos.get(t);
    }

    /**
     * Método para que el usuario compre un jugador.
     * @param t
     * @param j
     */
    public void comprar(Torneo t, Jugador j) throws FondoInsuficienteException{
        if(!consultarFondos(t, j)) throw new FondoInsuficienteException();
        Integer aux = fondos.get(t);
        aux -= j.getPrecio();
        fondos.put(t, aux);
    }

    /**
     * Método para que el usuario venda un jugador
     * @param t
     * @param j
     */
    public void vender(Torneo t, Jugador j) {
        Integer aux = fondos.get(t);
        aux += j.getPrecio();
        fondos.put(t, aux);
    }

    ///FALTAN METODOS READ & WRITE PARA ARCHIVOS
}
