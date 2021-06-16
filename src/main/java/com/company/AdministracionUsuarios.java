package com.company;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

import static com.company.ArchivoUsuarios.*;

/**
 * Clase que maneja todas las cuentas de usuarios del programa.
 */

public class AdministracionUsuarios implements Serializable{
    private static final long serialVersionUID = 1L;

    public static ArrayList<Usuario> usuarios;
    private static Usuario usuario;

    /**
     * Retorna el usuario.
     */
    public static Usuario getUsuario(){
        return usuario;
    }

    /**
     * Retrona una lista de los administradores.
     */
    public static ArrayList<Admin> getAdmins(){
        ArrayList<Admin> aux = new ArrayList<>();
        for(Usuario u : usuarios) {
            if(u instanceof Admin)
                aux.add((Admin)u);
        }
        return aux;
    }

    /**
     *
     */
    public static Set<Torneo> getTorneos(){
        return ((Admin) usuario).getTorneo();
    }

    /**
     * Crea un administrador
     * @param nombreUsuario El nombre del administrador
     */
    public static boolean crearAdmin(String nombreUsuario){
        if(nombreUsuario.equals(""))
            return false;
        usuarios.add(new Admin(nombreUsuario));
        return true;
    }

    /**
     * Crea un Usuario
     * @param nombreUsuario El nombre del usuario
     */

    public static boolean crearDT(String nombreUsuario){
        if(nombreUsuario.equals(""))
            return false;
        usuarios.add(new DT(nombreUsuario));
        return true;
    }

    /**
     * Retorna una cuenta especifica
     * @param nombreUsuario El nombre de la cuenta
     */
    private static Usuario getCuenta(String nombreUsuario){
        for (Usuario aux: usuarios) {
            if (aux.getNombre().equals(nombreUsuario))
                return aux;
        }
        return null;
    }

    /**
     * Guardamos la cuenta que está logeada para poder acceder
     * a sus valores desde varios lugares
     * @param nombreUsuario El nombre del usuario
     */
    public static void setUsuario(String nombreUsuario) {
        usuario = getCuenta(nombreUsuario);
    }

    /**
     * Busca al usuario pasado como parametro y si lo contiene retorna true
     * @param nombreUsuario nombre de la cuenta a buscar
     * @return true si lo encuentra, falso en otro caso
     */
    public static boolean buscar(String nombreUsuario) {
        return !nombreUsuario.equals("") && getCuenta(nombreUsuario) != null;
    }

    /**
     *
     *
     * */

    public static boolean esDT() {
        return usuario != null && usuario instanceof DT;
    }

    /**
     * @return Retorna un array de los DTs en el toreno
     */
    public static ArrayList<DT> getDTsTorneo(Torneo t) {
        ArrayList<DT> usuarios = null;
        for (Usuario usuario : AdministracionUsuarios.usuarios) {
            if (usuario instanceof Admin) {
                Admin admin = (Admin) usuario;
                if (admin.existeTorneo(t)) {
                    usuarios = admin.getDTsOrdenados(t);
                    break;
                }
            }
        }
        return usuarios;
    }

    /** Carga los usuarios existentes al programa */
    public static void cargarCuentas() throws IOException, ClassNotFoundException {
        usuarios = (ArrayList<Usuario>) leerArchivo("datosCargados.dat");
        if (usuarios == null)
            usuarios = new ArrayList<>();
    }

    /**
     * Guarda la lista de usuario existente
     * */
    public static void guardarCuenta() throws IOException, ClassNotFoundException {
        escribirArchivo(usuarios,"datosCargados.dat");
    }
    /**
     * Metodo implementeados de la serializacion
     * */
    private void escribirObjeto(ObjectOutputStream out) throws IOException{
        out.defaultWriteObject();
        out.writeObject(usuarios);
    }

    /**
     * Metodo implementeados de la serializacion
     * */
    private void leerObjeto(ObjectInputStream ois) throws IOException, ClassNotFoundException{
        ois.defaultReadObject();
        usuarios = (ArrayList<Usuario>)ois.readObject();
    }

}
