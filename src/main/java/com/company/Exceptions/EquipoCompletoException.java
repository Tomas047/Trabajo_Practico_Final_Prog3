package com.company.Exceptions;

/**
 * Excepción usada cuando a un equipo completo se le intenta agregar un jugador.
 */
public class EquipoCompletoException extends Exception {
    public EquipoCompletoException() {
        super("El equipo esta completo");
    }
}