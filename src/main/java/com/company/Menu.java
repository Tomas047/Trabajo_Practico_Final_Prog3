package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Formulario extends JFrame implements ActionListener{
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

    public void actionPerformed (ActionEvent e){

        if(e.getSource()==crearDt){
            System.out.println("Crear Dt");
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
        }
        if(e.getSource()==adminTorneo){
            System.out.println("Administrar Torneo");
        }
        if(e.getSource()==crearJug){
            System.out.println("Crear Jugador");
        }
        if(e.getSource()==setProp){
            System.out.println("Setear Propiedades");
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
