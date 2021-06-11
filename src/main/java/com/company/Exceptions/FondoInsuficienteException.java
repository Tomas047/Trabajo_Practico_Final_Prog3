package com.company.Exceptions;
/**
 * Excepción usada cuando un DT no tiene fondos para agregar un jugador.
 */
public class FondoInsuficienteException extends Exception{
    public FondoInsuficienteException(){
        super("Fondos insuficientes.");
    }
}
