package com.company.Exceptions;

/**
 * Excepción usada cuando se quiere crear o agregar un jugador existente.
 */
public class ExisteNombreException extends Exception {
    public ExisteNombreException(){
        super("Nombre ya existente.");
    }
}
