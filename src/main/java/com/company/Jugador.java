package com.company;

import java.io.*;
import java.util.Objects;

/**
 * Modela el Jugador de futbol de la vida real, el torneo real, con equipos reales
 * es administrado por el administrador
 */

public class Jugador implements Serializable {
    private final static int precioMinimo = 1000;
    @Serial
    private static final long serialVersionUID = 1L;
    private String nombre;
    private int precio;
    private int edad;
    private String posicion;
    private Propiedades propiedades;

    ///MIRAR TEMAS DE STATUS Y POSICION

    public Jugador(String nombre, int precio, int edad, String posicion, Propiedades propiedades){
        this.nombre = nombre;
        this.precio = precio;
        this.edad = edad;
        this.posicion = posicion;
        this.propiedades = propiedades;
    }

    ///Nombre ------------------------------
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    ///Edad --------------------------------
    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    ///Precio -----------------------------
    public int getPrecio(){
        return precio;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }

    ///Posicion ----------------------------
    public String getPosicion(){
        return posicion;
    }

    public void setPosicion(String posicion){
        this.posicion = posicion;
    }

    ///Puntos -----------------------------
    /**
     * @return el los puntos que tiene este juagador en el torneo
     */
    public int getPuntos(){
        return propiedades.calcularPuntos();
    }

    ///Otros -------------------------------
    /**
     * Se ocupa de asignar las propiedades del juagador
     * Estas se cambian cuando el adminsitrador del torneo hace un cambio
     * @param p las nuevas propiedades a ser Sumadas*/
    public void asignar(Propiedades p){
        propiedades.asignar(p);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jugador jugador = (Jugador) o;

        return Objects.equals(nombre, jugador.nombre);
    }

    @Override
    public int hashCode() {
        return nombre != null ? nombre.hashCode() * 7 : 0;
    }

    @Override
    public String toString(){
        return getNombre() +
                "\nPrecio: $" + getPrecio() +
                "\nPosicion: " + getPosicion() +
                "\nEdad: " + getEdad();
    }

    private void escribirObjeto(ObjectOutputStream out) throws IOException{
        out.defaultWriteObject();
        out.writeUTF(nombre);
        out.writeInt(precio);
        out.writeObject(propiedades);
    }

    private void leerObjeto(ObjectInputStream ois) throws IOException, ClassNotFoundException{
        ois.defaultReadObject();
        nombre = ois.readUTF();
        precio = ois.readInt();
        propiedades = (Propiedades) ois.readObject();
    }

    /**
     *Modela las propiedades del jugador, estos son acumulados a lo largo del torneo.
     */
    public static class Propiedades implements Serializable{
        private int goles;
        private int golesPenal;
        private int golesEnContra;
        private int penalesAtajados;
        private int tarjetasAmarilla;
        private int tarjetasRoja;

        public Propiedades(){
            goles = 0;
            golesPenal = 0;
            golesEnContra = 0;
            penalesAtajados = 0;
            tarjetasAmarilla = 0;
            tarjetasRoja = 0;
        }

        public Propiedades(int goles, int golesPenal, int golesEnContra, int penalesAtajados, int tarjetasAmarilla, int tarjetasRoja){
            this.goles = goles;
            this.golesPenal = golesPenal;
            this.golesEnContra = golesEnContra;
            this.penalesAtajados = penalesAtajados;
            this.tarjetasAmarilla = tarjetasAmarilla;
            this.tarjetasRoja = tarjetasRoja;
        }

        /**
         * @return un entero con el puntaje de cada juagor.
         */
        public int getPuntos(){
            return goles + golesPenal + penalesAtajados - golesEnContra - tarjetasAmarilla - tarjetasRoja;
        }

        /**Se setea cada propiedad por separado
         * @param index el indice de la propiedad
         * @param propiedad el valor de la misma*/
        public void setPropiedad(int index, int propiedad){
            switch (index) {
                case 0 -> goles = propiedad;
                case 1 -> golesPenal = propiedad;
                case 2 -> golesEnContra = propiedad;
                case 3 -> penalesAtajados = propiedad;
                case 4 -> tarjetasAmarilla = propiedad;
                case 5 -> tarjetasRoja = propiedad;
            }
        }

        /**
         * @param index el indice de la propiedad a retornar
         * @return entero con el valor de la misma*/
        public int getPropiedad(int index){
            return switch (index) {
                case 0 -> goles;
                case 1 -> golesPenal;
                case 2 -> golesEnContra;
                case 3 -> penalesAtajados;
                case 4 -> tarjetasAmarilla;
                case 5 -> tarjetasRoja;
                default -> 0;
            };
        }

        /**
         * Se calcula el ranking del jugador de manera ponderada
         * @return entero con el valor*/
        public int calcularPuntos(){
            int total = 0;
            total += Valores.goles.getValor() * goles;
            total += Valores.golesPenal.getValor() * golesPenal;
            total += Valores.golesEnContra.getValor() * golesEnContra;
            total += Valores.penalAtajado.getValor() * penalesAtajados;
            total += Valores.tarjetaAmarilla.getValor() * tarjetasAmarilla;
            total += Valores.tarjetaRoja.getValor() * tarjetasAmarilla;

            return total;
        }

        /**
         * Se encarga de cambiar los valores que sean necesarios
         * @param p los nuevos valores*/
        void asignar(Propiedades p){
            this.goles = p.goles;
            this.golesPenal = p.golesPenal;
            this.penalesAtajados = p.penalesAtajados;
            this.golesEnContra = p.golesEnContra;
            this.tarjetasAmarilla = p.tarjetasAmarilla;
            this.tarjetasRoja = p.tarjetasRoja;
        }

        @Override
        public String toString() {
            return "Propiedades: " +
                    "\nGoles: " + goles +
                    "\nGoles de penal: " + golesPenal +
                    "\nPenales atajados: " + penalesAtajados +
                    "\nGoles en contra: " + golesEnContra +
                    "\nTarjetas amarillas: " + tarjetasAmarilla +
                    "\nTarjetas Rojas: " + tarjetasRoja;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Propiedades that = (Propiedades) o;

            if (goles != that.goles) return false;
            if (golesPenal != that.golesPenal) return false;
            if (penalesAtajados != that.penalesAtajados) return false;
            if (golesEnContra != that.golesEnContra) return false;
            if (tarjetasAmarilla != that.tarjetasAmarilla) return false;
            if(tarjetasRoja != that.tarjetasRoja) return false;
            return true;
        }

        @Override
        public int hashCode() {
            int result = goles;
            result = 31 * result + golesPenal;
            result = 31 * result + penalesAtajados;
            result = 31 * result + golesEnContra;
            result = 31 * result + tarjetasAmarilla;
            result = 31 * result + tarjetasRoja;
            return result;
        }



        /**
         * Encargado de contener los valores de cada propiedad*/
        public enum Valores{ ///MODIFICAR VALORES + ADELANTE
            goles(10),
            golesPenal(5),
            golesEnContra(-10),
            penalAtajado(5),
            tarjetaAmarilla(-5),
            tarjetaRoja(-10);

            int valor;

            Valores(int valor){
                this.valor = valor;
            }

            public int getValor(){
                return valor;
            }
        }
    }
}
