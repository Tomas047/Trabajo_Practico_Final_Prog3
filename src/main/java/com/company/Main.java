package com.company;

import com.company.Complementos.Posicion;
import com.company.Exceptions.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.*;

import static com.company.AdministracionUsuarios.*;

public class Main{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //cargarCuentas();
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0,0,400,250);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);

        //ArrayList<ClubReal> equipos = new ArrayList<ClubReal>();
        //ArrayList<Admin> admins = getAdmins();

        /*System.out.println("Archivo de Admins:");
        for(int m = 0; m < admins.size(); m++){
            System.out.println("\n" + admins.get(m) + "\n");
        }
*/


        //System.out.println(admins.get(0).getNombre());
        //System.out.println(admins.get(0).getDTsOrdenados(admins.get(0).getTorneo("Superliga A George")));
        //System.out.println(admins.get(0).getTorneo("Superliga A George"));

    }
}

class Formulario extends JFrame implements ActionListener {
    //Menus
    private JMenuBar menubar;
    private JMenu menuUsuario,menuAdministrador,menuTorneo, menuJugador, menuClub;
    private JMenuItem crearDt, buscarDt, listaDeDTS, comprar, vender, inscTorneo, estaInscripto, verPresu, verPuntos,
            crearAdmin, buscarAdmin, retorTorneo, agregarTorneo, crearTorneo, ordenDt, existeTorneo, agregarDT, agregarClub,
            buscarClub, crearTorneo2, nombreDeTorneo, adminTorneo, crearJug, setProp, calcPuntos, crearClub, vernombre, agregarJug;

    public Formulario() {
        setLayout(null);
        menubar = new JMenuBar();
        setJMenuBar(menubar);

        menuUsuario = new JMenu("Usuarios");
        menubar.add(menuUsuario);

        menuAdministrador = new JMenu("Administrador");
        menubar.add(menuAdministrador);

        menuTorneo = new JMenu("Torneo");
        menubar.add(menuTorneo);

        menuJugador = new JMenu("Jugador");
        menubar.add(menuJugador);

        menuClub = new JMenu("Club");
        menubar.add(menuClub);


//submenus
        //Usuario
        crearDt = new JMenuItem("Crear un Dt");
        crearDt.addActionListener(this);
        menuUsuario.add(crearDt);
        buscarDt = new JMenuItem("Buscar Dt");
        buscarDt.addActionListener(this);
        menuUsuario.add(buscarDt);
        listaDeDTS = new JMenuItem("Lista de DTs");
        listaDeDTS.addActionListener(this);
        menuUsuario.add(listaDeDTS);
        comprar = new JMenuItem("Comprar");
        comprar.addActionListener(this);
        menuUsuario.add(comprar);
        vender = new JMenuItem("Vender");
        vender.addActionListener(this);
        menuUsuario.add(vender);
        inscTorneo = new JMenuItem("Inscripcion");
        inscTorneo.addActionListener(this);
        menuUsuario.add(inscTorneo);
        verPresu = new JMenuItem("Presupuesto");
        verPresu.addActionListener(this);
        menuUsuario.add(verPresu);
        verPuntos = new JMenuItem("Puntos");
        verPuntos.addActionListener(this);
        menuUsuario.add(verPuntos);
        estaInscripto = new JMenuItem("Esta Inscripto");
        estaInscripto.addActionListener(this);
        menuUsuario.add(estaInscripto);

        //Administracion
        crearAdmin = new JMenuItem("Crear Administrador");
        crearAdmin.addActionListener(this);
        menuAdministrador.add(crearAdmin);
        buscarAdmin = new JMenuItem("Buscar Administrador");
        buscarAdmin.addActionListener(this);
        menuAdministrador.add(buscarAdmin);
        retorTorneo = new JMenuItem("Devuelve Torneo");
        retorTorneo.addActionListener(this);
        menuAdministrador.add(retorTorneo);
        agregarTorneo = new JMenuItem("Agregar Torneo");
        agregarTorneo.addActionListener(this);
        menuAdministrador.add(agregarTorneo);
        crearTorneo = new JMenuItem("Crear Torneo");
        crearTorneo.addActionListener(this);
        menuAdministrador.add(crearTorneo);
        ordenDt = new JMenuItem("Ordenar y ver Dts");
        ordenDt.addActionListener(this);
        menuAdministrador.add(ordenDt);
        existeTorneo = new JMenuItem("¿Existe el Torneo?");
        existeTorneo.addActionListener(this);
        menuAdministrador.add(existeTorneo);
        agregarDT = new JMenuItem("Agregar Dt");
        agregarDT.addActionListener(this);
        menuAdministrador.add(agregarDT);

        //Torneo
        agregarClub = new JMenuItem("Agregar Club");
        agregarClub.addActionListener(this);
        menuTorneo.add(agregarClub);
        buscarClub = new JMenuItem("Buscar Club");
        buscarClub.addActionListener(this);
        menuTorneo.add(buscarClub);
        crearTorneo2 = new JMenuItem("Crear Torneo2");
        crearTorneo2.addActionListener(this);
        menuTorneo.add(crearTorneo2);
        nombreDeTorneo = new JMenuItem("Nombre del Torneo");
        nombreDeTorneo.addActionListener(this);
        menuTorneo.add(nombreDeTorneo);
        adminTorneo = new JMenuItem("Administrar Torneo");
        adminTorneo.addActionListener(this);
        menuTorneo.add(adminTorneo);

        //Jugador
        crearJug = new JMenuItem("Crear Jugador");
        crearJug.addActionListener(this);
        menuJugador.add(crearJug);
        setProp= new JMenuItem("Setear Propiedad");
        setProp.addActionListener(this);
        menuJugador.add(setProp);
        calcPuntos = new JMenuItem("Calcular Puntos");
        calcPuntos.addActionListener(this);
        menuJugador.add(calcPuntos);

        //Club Real
        crearClub = new JMenuItem("Crear Club");
        crearClub.addActionListener(this);
        menuClub.add(crearClub);
        vernombre = new JMenuItem("Ver Nombre");
        vernombre.addActionListener(this);
        menuClub.add(vernombre);
        agregarJug = new JMenuItem("Agregar Jugador");
        agregarJug.addActionListener(this);
        menuClub.add(agregarJug);

        Container fondo = this.getContentPane();
        fondo.setBackground(new Color(0,150,0));
    }

    public void actionPerformed (ActionEvent e) {

        if(e.getSource()==crearDt){
            System.out.println("Crear Dt");
            crearDT(JOptionPane.showInputDialog("Ingrese un nombre de usuario"));
        }
        if(e.getSource()==buscarDt){
            System.out.println("Buscar Dt");
        }
        if(e.getSource()==listaDeDTS){
            System.out.println("Lista de Dts");
        }
        if(e.getSource()==comprar){
            System.out.println("Comprar");
        }
        if(e.getSource()==vender){
            System.out.println("Vender");
        }
        if(e.getSource()==inscTorneo){
            System.out.println("Inscribir Torneo");
        }
        if(e.getSource()==estaInscripto){
            System.out.println("Esta Inscripto?");
        }
        if(e.getSource()==verPresu){
            System.out.println("Ver Presupuesto");
        }
        if(e.getSource()==verPuntos){
            System.out.println("Ver Puntos");
        }
        if(e.getSource()==crearAdmin){
            System.out.println("Crear Administrador");
        }
        if(e.getSource()==buscarAdmin){
            System.out.println("Buscar Administrador");
        }
        if(e.getSource()==retorTorneo){
            System.out.println("Retorna un Torneo");
        }
        if(e.getSource()==agregarTorneo){
            System.out.println("Agregar Torneo");
        }
        if(e.getSource()==crearTorneo){
            System.out.println("Crear un Torneo");
        }
        if(e.getSource()==ordenDt){
            System.out.println("Ordenar Dts por puntos");
        }
        if(e.getSource()==existeTorneo){
            System.out.println("Existe un Torneo");
            ArrayList<Admin> admins = new ArrayList<Admin>();
            try {
                cargarCuentas();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            } catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
            }
            admins = getAdmins();
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del torneo a buscar:");
            Torneo t = null;
            int i = 0;
            boolean rta = false;

            ///como buscar torneo

            while (i < admins.size() && rta == false){
                rta = admins.get(i).existeTorneo(t);
                i++;
            }

            if(rta == true){
                System.out.println("El torneo existe");
            }else{
                System.out.println("El torneo no existe");
            }
        }
        if(e.getSource()==agregarDT){
            System.out.println("Agrega un Dt");
        }
        if(e.getSource()==agregarClub){
            System.out.println("Agrega un Club");
        }
        if(e.getSource()==buscarClub){
            System.out.println("Busca un Club");
        }
        if(e.getSource()==crearTorneo2){
            System.out.println("Crea un Torneo - Forma 2");
        }
        if(e.getSource()==nombreDeTorneo){
            System.out.println("Nombre del Torneo");
            ArrayList<Admin> admins = new ArrayList<Admin>();
            try {
                cargarCuentas();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            } catch (ClassNotFoundException classNotFoundException){
                classNotFoundException.printStackTrace();
            }
            admins = getAdmins();
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del admnistrador del torneo a buscar: ");
            Torneo t = null;

            int i = 0;
            while (i < admins.size() && t == null){
                if(admins.get(i).getNombre().equals(nombre)){
                    t = admins.get(i).getTorneo(nombre);
                }
                i++;
            }

            if(t != null){
                System.out.println("El nombre del torneo administrado por " + admins.get(i).getNombre() + " es " + t.getNombre());
            }else{
                System.out.println("El Admin no fue encontrado");
            }
        }
        if(e.getSource()==adminTorneo){
            System.out.println("Administrar Torneo");
            ArrayList<Admin> admins = new ArrayList<Admin>();
            try {
                cargarCuentas();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            } catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
            }
            admins = getAdmins();
            //String nombre = JOptionPane.showInputDialog("Ingrese el nombre del torneo a buscar:");
            Torneo t;
            int i = 0;

            //while (i < admins.size() && t == null){
               // if(admins.get(i).getTorneo(nombre).equals(nombre)){
                    t = admins.get(0).getTorneo("Superliga A George");
                //}
                //i++;
            //}

            System.out.println(t.getNombre());
            //Admin admin1 = t.getAdmin();
            //if(t != null){
               // System.out.println("Nombre del Administrador del Torneo: " + admin1.getNombre());
            //}else{
                //System.out.println("El torneo buscado no existe");
           // }

            //System.out.println(admins.get(0).getNombre());
            //System.out.println(admins.get(0).getDTsOrdenados(admins.get(0).getTorneo("Superliga A George")));
            //System.out.println(admins.get(0).getTorneo("Superliga A George"));
        }
        if(e.getSource()==crearJug){ ////FALTA AGREGARLO A UN CLUB PARA QUE HAGA LO NECESARIO PARA METERSE AL ARCHIVO
            System.out.println("Crear Jugador");
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del jugador: ");
            int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del jugador: "));
            Jugador.Propiedades p;
            String rta = JOptionPane.showInputDialog("Desea cargar las propiedades del jugador?: s/n");
            if(rta.equals("s")) {
                int goles = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los goles del jugador: "));
                int golesPenal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los goles de penal del jugador: "));
                int golesEnContra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los goles en contra del jugador: "));
                int penalesAtajados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los penales atajados del jugador: "));
                int amarillas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las amarillas recibidas del jugador: "));
                int rojas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las rojas recibidas del jugador: "));
                p = new Jugador.Propiedades(goles, golesPenal, golesEnContra, penalesAtajados, amarillas, rojas);
            }else{
                p = new Jugador.Propiedades();
            }

            Jugador nuevo = new Jugador(nombre, precio, p);
            System.out.println(nuevo);
        }
        if(e.getSource()==setProp){
            System.out.println("Setear Propiedades");
            ArrayList<Admin> admins = new ArrayList<Admin>();
            try {
                cargarCuentas();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            } catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
            }
            admins = getAdmins();

            String nombre = JOptionPane.showInputDialog("Ingrese el jugador a modificar");

            admins.get(0).getTorneo("Superliga A George").getEquipos().get(0).getListaJugadores().get(0).getNombre();
            //admins.get(0).getTorneo("Superliga A George").getEquipos().get(0).getListaJugadores().get(0).;

            //        ///Prueba Jugador
            //        Jugador.Propiedades p = new Jugador.Propiedades();
            //        p.setPropiedad(1, 1);
            //        p.setPropiedad(4, 2);
            //        p.setPropiedad(0, 3);
            //        jugador1.asignar(p);
            //
            //        System.out.println(jugador1.getPuntos() + " PUNTOS.");
            //
            //        System.out.println("Goles: " + p.getPropiedad(0));
            //        System.out.println("Goles Penal: " + p.getPropiedad(1));
            //        System.out.println("Goles en contra: " + p.getPropiedad(2));
            //        System.out.println("Penales Atajados: " + p.getPropiedad(3));
            //        System.out.println("Amarillas: " + p.getPropiedad(4));
            //        System.out.println("Rojas: " + p.getPropiedad(5));

        }
        if(e.getSource()==calcPuntos){
            System.out.println("Calcular Puntos");
        }
        if(e.getSource()==crearClub){
            System.out.println("Crear un Club");
        }
        if(e.getSource()==vernombre){
            System.out.println("Ver Nombre");
        }
        if(e.getSource()==agregarJug){
            System.out.println("Agrega un Jugador");
        }
    }
}







