package com.company;

import java.io.Serializable;

public abstract class Usuario implements Serializable {
    String nombre;

    public Usuario(String nombre){
        this.nombre = nombre;
    }

    ///Nombre ------------------------------
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    ///Otros -------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        return nombre != null ? nombre.equals(usuario.nombre) : usuario.nombre == null;
    }

    @Override
    public int hashCode() {
        return nombre != null ? nombre.hashCode() : 0;
    }
}
