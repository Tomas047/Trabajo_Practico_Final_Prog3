package com.company.Complementos;
import com.company.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

public class CargaArchiJugadores{
    /*ArrayList<ClubReal> listaDeClubes = new ArrayList<ClubReal>();

    public void carga() throws IOException{
            //BOCA
            ArrayList<Jugador> jugadoresBoca = new ArrayList<Jugador>();

            Jugador jugadorBoca1 = new Jugador("Agustin Rossi", 2000, 25, Posicion.ARQUERO, new Jugador.Propiedades());
            Jugador jugadorBoca2 = new Jugador("Julio Buffarini", 1000, 32, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorBoca3 = new Jugador("Lisandro Lopez", 2900, 31, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorBoca4 = new Jugador("Carlos Izquierdoz", 3300, 32, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorBoca5 = new Jugador("Frank Fabra", 2200, 30, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorBoca6 = new Jugador("Exequiel Zeballos", 3500, 19, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorBoca7 = new Jugador("Cristian Medina", 3000, 19, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorBoca8 = new Jugador("Alan Varela", 4000, 19, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorBoca9 = new Jugador("Edwin Cardona", 4300, 28, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorBoca10 = new Jugador("Carlos Tevez", 8000, 37, Posicion.DELANTERO, new Jugador.Propiedades());
            Jugador jugadorBoca11 = new Jugador("Sebastian Villa", 7500, 25, Posicion.DELANTERO, new Jugador.Propiedades());
            jugadoresBoca.add(jugadorBoca1);
            jugadoresBoca.add(jugadorBoca2);
            jugadoresBoca.add(jugadorBoca3);
            jugadoresBoca.add(jugadorBoca4);
            jugadoresBoca.add(jugadorBoca5);
            jugadoresBoca.add(jugadorBoca6);
            jugadoresBoca.add(jugadorBoca7);
            jugadoresBoca.add(jugadorBoca8);
            jugadoresBoca.add(jugadorBoca9);
            jugadoresBoca.add(jugadorBoca10);
            jugadoresBoca.add(jugadorBoca11);

            //Velez Sarsfield
            ArrayList<Jugador> jugadoresVelez = new ArrayList<Jugador>();
            Jugador jugadorVelez1 = new Jugador("Lucas Hoyos", 600, 32, Posicion.ARQUERO, new Jugador.Propiedades());
            Jugador jugadorVelez2 = new Jugador("Hernan De la Fuente", 1800, 24, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorVelez3 = new Jugador("Luis Abrahm", 4800, 25, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorVelez4 = new Jugador("Lautaro Gianetti", 4700, 27, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorVelez5 = new Jugador("Francisco Ortega", 4000, 22, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorVelez6 = new Jugador("Lucas Janson", 4200, 26, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorVelez7 = new Jugador("Pablo Galdamez", 3100, 24, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorVelez8 = new Jugador("Federico Mancuello", 900, 32, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorVelez9 = new Jugador("Thiago Almada", 8600, 20, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorVelez10 = new Jugador("Ricardo Centurion", 2200, 28, Posicion.DELANTERO, new Jugador.Propiedades());
            Jugador jugadorVelez11 = new Jugador("Cristian Tarragona", 1600, 30, Posicion.DELANTERO, new Jugador.Propiedades());
            jugadoresVelez.add(jugadorVelez1);
            jugadoresVelez.add(jugadorVelez2);
            jugadoresVelez.add(jugadorVelez3);
            jugadoresVelez.add(jugadorVelez4);
            jugadoresVelez.add(jugadorVelez5);
            jugadoresVelez.add(jugadorVelez6);
            jugadoresVelez.add(jugadorVelez7);
            jugadoresVelez.add(jugadorVelez8);
            jugadoresVelez.add(jugadorVelez9);
            jugadoresVelez.add(jugadorVelez10);
            jugadoresVelez.add(jugadorVelez11);

            //Independiente
            ArrayList<Jugador> jugadoresIndependiente = new ArrayList<Jugador>();
            Jugador jugadorIndependiente1 = new Jugador("Sebastian Sosa", 2300, 34, Posicion.ARQUERO, new Jugador.Propiedades());
            Jugador jugadorIndependiente2 = new Jugador("Fabricio Bustos", 5000, 25, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorIndependiente3 = new Jugador("Juan Manuel Insaurralde", 600, 36, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorIndependiente4 = new Jugador("Ezequiel Muñoz", 450, 30, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorIndependiente5 = new Jugador("Lucas Rodriguez", 375, 27, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorIndependiente6 = new Jugador("Alan Velazco", 5200, 18, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorIndependiente7 = new Jugador("Domingo Blanco", 3000, 26, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorIndependiente8 = new Jugador("Pablo Hernandez", 2000, 34, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorIndependiente9 = new Jugador("Andres Roa", 2000, 28, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorIndependiente10 = new Jugador("Sebastian Palacios", 3500, 29, Posicion.DELANTERO, new Jugador.Propiedades());
            Jugador jugadorIndependiente11 = new Jugador("Silvio Romero", 1600, 30, Posicion.DELANTERO, new Jugador.Propiedades());
            jugadoresIndependiente.add(jugadorIndependiente1);
            jugadoresIndependiente.add(jugadorIndependiente2);
            jugadoresIndependiente.add(jugadorIndependiente3);
            jugadoresIndependiente.add(jugadorIndependiente4);
            jugadoresIndependiente.add(jugadorIndependiente5);
            jugadoresIndependiente.add(jugadorIndependiente6);
            jugadoresIndependiente.add(jugadorIndependiente7);
            jugadoresIndependiente.add(jugadorIndependiente8);
            jugadoresIndependiente.add(jugadorIndependiente9);
            jugadoresIndependiente.add(jugadorIndependiente10);
            jugadoresIndependiente.add(jugadorIndependiente11);

            //Talleres
            ArrayList<Jugador> jugadoresTalleres = new ArrayList<Jugador>();
            Jugador jugadorTalleres1 = new Jugador("Guido Herrera", 1600, 29, Posicion.ARQUERO, new Jugador.Propiedades());
            Jugador jugadorTalleres2 = new Jugador("Nahuel Tenaglia", 3500, 25, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorTalleres3 = new Jugador("Juan Komar", 3500, 24, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorTalleres4 = new Jugador("Piero Hincapie", 5000, 19, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorTalleres5 = new Jugador("Enzo Diaz", 2400, 25, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorTalleres6 = new Jugador("Joel Soñora", 1200, 24, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorTalleres7 = new Jugador("Francis Mac Alister", 1300, 25, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorTalleres8 = new Jugador("Guilherme Parede", 800, 25, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorTalleres9 = new Jugador("Jose Mauri", 400, 25, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorTalleres10 = new Jugador("Diego Valoyes", 5000, 24, Posicion.DELANTERO, new Jugador.Propiedades());
            Jugador jugadorTalleres11 = new Jugador("Carlos Auzqui", 3300, 29, Posicion.DELANTERO, new Jugador.Propiedades());
            jugadoresTalleres.add(jugadorTalleres1);
            jugadoresTalleres.add(jugadorTalleres2);
            jugadoresTalleres.add(jugadorTalleres3);
            jugadoresTalleres.add(jugadorTalleres4);
            jugadoresTalleres.add(jugadorTalleres5);
            jugadoresTalleres.add(jugadorTalleres6);
            jugadoresTalleres.add(jugadorTalleres7);
            jugadoresTalleres.add(jugadorTalleres8);
            jugadoresTalleres.add(jugadorTalleres9);
            jugadoresTalleres.add(jugadorTalleres10);
            jugadoresTalleres.add(jugadorTalleres11);


            //Lanus
            ArrayList<Jugador> jugadoresLanus = new ArrayList<Jugador>();
            Jugador jugadorLanus1 = new Jugador("Lautaro Morales", 1600, 21, Posicion.ARQUERO, new Jugador.Propiedades());
            Jugador jugadorLanus2 = new Jugador("Jose Luis Gomez", 3300, 27, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorLanus3 = new Jugador("Guillermo Burdiso", 1500, 32, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorLanus4 = new Jugador("Nicolas Thaller", 500, 22, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorLanus5 = new Jugador("Alexandro Bernabei", 3000, 20, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorLanus6 = new Jugador("Tomas Belmonte", 4000, 23, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorLanus7 = new Jugador("Facundo Quignon", 2400, 28, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorLanus8 = new Jugador("Pedro De La Vega", 3500, 20, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorLanus9 = new Jugador("Leonel Di Placido", 4000, 27, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorLanus10 = new Jugador("Jose Sand", 8000, 40, Posicion.DELANTERO, new Jugador.Propiedades());
            Jugador jugadorLanus11 = new Jugador("Lautaro Acosta", 5000, 33, Posicion.DELANTERO, new Jugador.Propiedades());
            jugadoresLanus.add(jugadorLanus1);
            jugadoresLanus.add(jugadorLanus2);
            jugadoresLanus.add(jugadorLanus3);
            jugadoresLanus.add(jugadorLanus4);
            jugadoresLanus.add(jugadorLanus5);
            jugadoresLanus.add(jugadorLanus6);
            jugadoresLanus.add(jugadorLanus7);
            jugadoresLanus.add(jugadorLanus8);
            jugadoresLanus.add(jugadorLanus9);
            jugadoresLanus.add(jugadorLanus10);
            jugadoresLanus.add(jugadorLanus11);


            //Huracan

            ArrayList<Jugador> jugadoresHuracan = new ArrayList<Jugador>();
            Jugador jugadorHuracan1 = new Jugador("Facundo Cambaceres", 1500, 24, Posicion.ARQUERO, new Jugador.Propiedades());
            Jugador jugadorHuracan2 = new Jugador("Ezequiel Bonifacio", 1300, 27, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorHuracan3 = new Jugador("Renato Civelli", 3500, 37, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorHuracan4 = new Jugador("Lucas Merolla", 2100, 25, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorHuracan5 = new Jugador("Leonardo Grimi", 600, 36, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorHuracan6 = new Jugador("Esteban Rolon", 1000, 26, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorHuracan7 = new Jugador("Claudio Yacob", 2800, 33, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorHuracan8 = new Jugador("Patricio Toranzo", 1200, 39, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorHuracan9 = new Jugador("Juan Garro", 2400, 28, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorHuracan10 = new Jugador("Norberto Briasco", 1800, 25, Posicion.DELANTERO, new Jugador.Propiedades());
            Jugador jugadorHuracan11 = new Jugador("Andres Chavez", 3500, 30, Posicion.DELANTERO, new Jugador.Propiedades());
            jugadoresHuracan.add(jugadorHuracan1);
            jugadoresHuracan.add(jugadorHuracan2);
            jugadoresHuracan.add(jugadorHuracan3);
            jugadoresHuracan.add(jugadorHuracan4);
            jugadoresHuracan.add(jugadorHuracan5);
            jugadoresHuracan.add(jugadorHuracan6);
            jugadoresHuracan.add(jugadorHuracan7);
            jugadoresHuracan.add(jugadorHuracan8);
            jugadoresHuracan.add(jugadorHuracan9);
            jugadoresHuracan.add(jugadorHuracan10);
            jugadoresHuracan.add(jugadorHuracan11);


            //Gimnasia y Esgrima de la Plata
            ArrayList<Jugador> jugadoresGimnasia = new ArrayList<Jugador>();
            Jugador jugadorgimnasia1 = new Jugador("Rodrigo Rey", 1500, 30, Posicion.ARQUERO, new Jugador.Propiedades());
            Jugador jugadorgimnasia2 = new Jugador("Marcelo Weigandt", 2000, 21, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorgimnasia3 = new Jugador("Maximiliano Coronel", 1900, 32, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorgimnasia4 = new Jugador("Tomas Fernandez", 900, 22, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorgimnasia5 = new Jugador("Lucas Litch", 1200, 40, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorgimnasia6 = new Jugador("Johan Carbonero", 3600, 21, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorgimnasia7 = new Jugador("Victor Ayala", 5000, 33, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorgimnasia8 = new Jugador("Brahian Aleman", 2000, 31, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorgimnasia9 = new Jugador("Matias Perez Garcia", 3500, 36, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorgimnasia10 = new Jugador("Lucas Barrios", 1600, 36, Posicion.DELANTERO, new Jugador.Propiedades());
            Jugador jugadorgimnasia11 = new Jugador("Nicolas Contin", 2400, 25, Posicion.DELANTERO, new Jugador.Propiedades());
            jugadoresGimnasia.add(jugadorgimnasia1);
            jugadoresGimnasia.add(jugadorgimnasia2);
            jugadoresGimnasia.add(jugadorgimnasia3);
            jugadoresGimnasia.add(jugadorgimnasia4);
            jugadoresGimnasia.add(jugadorgimnasia5);
            jugadoresGimnasia.add(jugadorgimnasia6);
            jugadoresGimnasia.add(jugadorgimnasia7);
            jugadoresGimnasia.add(jugadorgimnasia8);
            jugadoresGimnasia.add(jugadorgimnasia9);
            jugadoresGimnasia.add(jugadorgimnasia10);
            jugadoresGimnasia.add(jugadorgimnasia11);

            //Patronato
            ArrayList<Jugador> jugadoresPatronato = new ArrayList<Jugador>();
            Jugador jugadorPatronato1 = new Jugador("Matias Ibañez", 1000, 34, Posicion.ARQUERO, new Jugador.Propiedades());
            Jugador jugadorPatronato2 = new Jugador("Leandro Marin", 800, 29, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorPatronato3 = new Jugador("Dylan Gissi", 1100, 30, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorPatronato4 = new Jugador("Rolando Garcia", 700, 31, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorPatronato5 = new Jugador("Lucas Kruzpzky", 2500, 29, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorPatronato6 = new Jugador("Damian Lemos", 1000, 32, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorPatronato7 = new Jugador("Nicolas Delgadillo", 3000, 23, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorPatronato8 = new Jugador("Hector Canteros", 600, 32, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorPatronato9 = new Jugador("Neri Bandiera", 4000, 31, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorPatronato10 = new Jugador("Sebastian Sosa", 1600, 27, Posicion.DELANTERO, new Jugador.Propiedades());
            Jugador jugadorPatronato11 = new Jugador("Junior Arias", 2900, 28, Posicion.DELANTERO, new Jugador.Propiedades());
            jugadoresPatronato.add(jugadorPatronato1);
            jugadoresPatronato.add(jugadorPatronato2);
            jugadoresPatronato.add(jugadorPatronato3);
            jugadoresPatronato.add(jugadorPatronato4);
            jugadoresPatronato.add(jugadorPatronato5);
            jugadoresPatronato.add(jugadorPatronato6);
            jugadoresPatronato.add(jugadorPatronato7);
            jugadoresPatronato.add(jugadorPatronato8);
            jugadoresPatronato.add(jugadorPatronato9);
            jugadoresPatronato.add(jugadorPatronato10);
            jugadoresPatronato.add(jugadorPatronato11);


            //Defensa Y Justicia
            ArrayList<Jugador> jugadoresDyJ = new ArrayList<Jugador>();
            Jugador jugadorDyJ1 = new Jugador("Ezequiel Unsain", 3000, 26, Posicion.ARQUERO, new Jugador.Propiedades());
            Jugador jugadorDyJ2 = new Jugador("Nicolas Tripicho", 1800, 29, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorDyJ3 = new Jugador("Franco Paredes", 2100, 22, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorDyJ4 = new Jugador("Juan Rodriguez", 1300, 27, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorDyJ5 = new Jugador("Nahuel Gallardo", 1500, 23, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorDyJ6 = new Jugador("Raul Loaiza", 4000, 27, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorDyJ7 = new Jugador("Ciro Rius", 3400, 32, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorDyJ8 = new Jugador("Tomas Martinez", 2300, 26, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorDyJ9 = new Jugador("Enzo Fernandez", 3500, 20, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorDyJ10 = new Jugador("Walter Bou", 6000, 27, Posicion.DELANTERO, new Jugador.Propiedades());
            Jugador jugadorDyJ11 = new Jugador("Braian Romero", 3900, 29, Posicion.DELANTERO, new Jugador.Propiedades());
            jugadoresDyJ.add(jugadorDyJ1);
            jugadoresDyJ.add(jugadorDyJ2);
            jugadoresDyJ.add(jugadorDyJ3);
            jugadoresDyJ.add(jugadorDyJ4);
            jugadoresDyJ.add(jugadorDyJ5);
            jugadoresDyJ.add(jugadorDyJ6);
            jugadoresDyJ.add(jugadorDyJ7);
            jugadoresDyJ.add(jugadorDyJ8);
            jugadoresDyJ.add(jugadorDyJ9);
            jugadoresDyJ.add(jugadorDyJ10);
            jugadoresDyJ.add(jugadorDyJ11);


            //Newell's Old Boys
            ArrayList<Jugador> jugadoresNewells = new ArrayList<Jugador>();
            Jugador jugadorNewells1 = new Jugador("Alan Aguerre", 1200, 30, Posicion.ARQUERO, new Jugador.Propiedades());
            Jugador jugadorNewells2 = new Jugador("Facundo Nadalin", 1700, 23, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorNewells3 = new Jugador("Cristian Lema", 3300, 31, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorNewells4 = new Jugador("Santiago Gentileti", 2400, 36, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorNewells5 = new Jugador("Mariano Bittolo", 2600, 31, Posicion.DEFENSOR, new Jugador.Propiedades());
            Jugador jugadorNewells6 = new Jugador("Juan Sforza", 2700, 19, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorNewells7 = new Jugador("Pablo Perez", 5400, 35, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorNewells8 = new Jugador("Fernando Belluschi", 3600, 37, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorNewells9 = new Jugador("Mauro Formica", 4200, 33, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
            Jugador jugadorNewells10 = new Jugador("Maximiliano Rodriguez", 6300, 40, Posicion.DELANTERO, new Jugador.Propiedades());
            Jugador jugadorNewells11 = new Jugador("Ignacio Scoco", 5100, 36, Posicion.DELANTERO, new Jugador.Propiedades());
            jugadoresNewells.add(jugadorNewells1);
            jugadoresNewells.add(jugadorNewells2);
            jugadoresNewells.add(jugadorNewells3);
            jugadoresNewells.add(jugadorNewells4);
            jugadoresNewells.add(jugadorNewells5);
            jugadoresNewells.add(jugadorNewells6);
            jugadoresNewells.add(jugadorNewells7);
            jugadoresNewells.add(jugadorNewells8);
            jugadoresNewells.add(jugadorNewells9);
            jugadoresNewells.add(jugadorNewells10);
            jugadoresNewells.add(jugadorNewells11);

            ///COLON
            ArrayList<Jugador> jugadoresColon = new ArrayList<Jugador>();

            Jugador jugador1 = new Jugador("Leonardo Burian", 3500, 37, Posicion.ARQUERO, new Jugador.Propiedades());
                jugadoresColon.add(jugador1);
            Jugador jugador2 = new Jugador("Facundo Mura", 2500, 25, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresColon.add(jugador2);
            Jugador jugador3 = new Jugador("Bruno Bianchi", 3500, 35, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresColon.add(jugador3);
            Jugador jugador4 = new Jugador("Gustavo Piovi", 2000, 24, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresColon.add(jugador4);
            Jugador jugador5 = new Jugador("Rafael Delgado", 3000, 35, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresColon.add(jugador5);
            Jugador jugador6 = new Jugador("Alexis Castro", 4000, 26, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresColon.add(jugador6);
            Jugador jugador7 = new Jugador("Federico Lertora", 3800, 32, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresColon.add(jugador7);
            Jugador jugador8 = new Jugador("Rodrigo Aliendro", 4200, 27, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresColon.add(jugador8);
            Jugador jugador9 = new Jugador("Christian Bernardi", 4500, 28, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresColon.add(jugador9);
            Jugador jugador10 = new Jugador("Facundo Farias", 2700, 18, Posicion.DELANTERO, new Jugador.Propiedades());
                jugadoresColon.add(jugador10);
            Jugador jugador11 = new Jugador("Luis Miguel Rodriguez", 7000, 37, Posicion.DELANTERO, new Jugador.Propiedades());
                jugadoresColon.add(jugador11);

            ///ESTUDIANTES
            ArrayList<Jugador> jugadoresEstudiantes = new ArrayList<Jugador>();

            Jugador jugador12 = new Jugador("Mariano Andujar", 5500, 37, Posicion.ARQUERO, new Jugador.Propiedades());
                jugadoresEstudiantes.add(jugador12);
            Jugador jugador13 = new Jugador("Leonardo Godoy", 3000, 24, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresEstudiantes.add(jugador13);
            Jugador jugador14 = new Jugador("Agustin Rogel", 1500, 23, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresEstudiantes.add(jugador14);
            Jugador jugador15 = new Jugador("Fabian Noguera", 3000, 26, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresEstudiantes.add(jugador15);
            Jugador jugador16 = new Jugador("Nicolas Pasquini", 2700, 33, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresEstudiantes.add(jugador16);
            Jugador jugador17 = new Jugador("Angel Gonzalez", 3200, 28, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresEstudiantes.add(jugador17);
            Jugador jugador18 = new Jugador("Joel Rodriguez", 2900, 22, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresEstudiantes.add(jugador18);
            Jugador jugador19 = new Jugador("Juan Sanchez Miño", 3000, 31, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresEstudiantes.add(jugador19);
            Jugador jugador20 = new Jugador("Lucas Rodriguez", 3300, 26, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresEstudiantes.add(jugador20);
            Jugador jugador21 = new Jugador("Leandro Diaz", 4000, 34, Posicion.DELANTERO, new Jugador.Propiedades());
                jugadoresEstudiantes.add(jugador21);
            Jugador jugador22 = new Jugador("Martin Cauteruccio", 3700, 32, Posicion.DELANTERO, new Jugador.Propiedades());
                jugadoresEstudiantes.add(jugador22);

            ///RIVER
            ArrayList<Jugador> jugadoresRiver = new ArrayList<Jugador>();

            Jugador jugador23 = new Jugador("Franco Armani", 6000, 32, Posicion.ARQUERO, new Jugador.Propiedades());
                jugadoresRiver.add(jugador23);
            Jugador jugador24 = new Jugador("Gonzalo Montiel", 5000, 24, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresRiver.add(jugador24);
            Jugador jugador25 = new Jugador("Paulo Diaz", 4000, 28, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresRiver.add(jugador25);
            Jugador jugador26 = new Jugador("Hector Martinez", 3000, 23, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresRiver.add(jugador26);
            Jugador jugador27 = new Jugador("Fabricio Angileri", 3500, 25, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresRiver.add(jugador27);
            Jugador jugador28 = new Jugador("Enzo Perez", 4500, 38, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresRiver.add(jugador28);
            Jugador jugador29 = new Jugador("Agustin Palavecino", 2900, 24, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresRiver.add(jugador29);
            Jugador jugador30 = new Jugador("Nicolas De La Cruz", 4500, 26, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresRiver.add(jugador30);
            Jugador jugador31 = new Jugador("Rafael Santos Borre", 5500, 26, Posicion.DELANTERO, new Jugador.Propiedades());
                jugadoresRiver.add(jugador31);
            Jugador jugador32 = new Jugador("Julian Alvarez", 4000, 22, Posicion.DELANTERO, new Jugador.Propiedades());
                jugadoresRiver.add(jugador32);
            Jugador jugador33 = new Jugador("Matias Suarez", 6000, 32, Posicion.DELANTERO, new Jugador.Propiedades());
                jugadoresRiver.add(jugador33);

            ///RACING
            ArrayList<Jugador> jugadoresRacing = new ArrayList<Jugador>();

            Jugador jugador34 = new Jugador("Gabriel Arias", 6000, 32, Posicion.ARQUERO, new Jugador.Propiedades());
                jugadoresRacing.add(jugador34);
            Jugador jugador35 = new Jugador("Ivan Pillud", 2000, 35, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresRacing.add(jugador35);
            Jugador jugador36 = new Jugador("Leonardo Sigali", 4500, 33, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresRacing.add(jugador36);
            Jugador jugador37 = new Jugador("Nery Dominguez", 3000, 28, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresRacing.add(jugador37);
            Jugador jugador38 = new Jugador("Eugenio Mena", 4700, 32, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresRacing.add(jugador38);
            Jugador jugador39 = new Jugador("Mauricio Martinez", 2500, 28, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresRacing.add(jugador39);
            Jugador jugador40 = new Jugador("Anibal Moreno", 2700, 22, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresRacing.add(jugador40);
            Jugador jugador41 = new Jugador("Leonel Miranda", 4000, 32, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresRacing.add(jugador41);
            Jugador jugador42 = new Jugador("Tomas Chancalay", 5000, 25, Posicion.DELANTERO, new Jugador.Propiedades());
                jugadoresRacing.add(jugador42);
            Jugador jugador43 = new Jugador("Dario Cvitanich", 5500, 36, Posicion.DELANTERO, new Jugador.Propiedades());
                jugadoresRacing.add(jugador43);
            Jugador jugador44 = new Jugador("Enzo Copetti", 4500, 25, Posicion.DELANTERO, new Jugador.Propiedades());
                jugadoresRacing.add(jugador44);

            ///SAN LORENZO
            ArrayList<Jugador> jugadoresCasla = new ArrayList<Jugador>();

            Jugador jugador45 = new Jugador("Sebastian Torrico", 3000, 41, Posicion.ARQUERO, new Jugador.Propiedades());
                jugadoresCasla.add(jugador45);
            Jugador jugador46 = new Jugador("Marcelo Herreras", 2000, 22, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresCasla.add(jugador46);
            Jugador jugador47 = new Jugador("Federico Gattoni", 2500, 22, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresCasla.add(jugador47);
            Jugador jugador48 = new Jugador("Diego Braghieri", 4500, 32, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresCasla.add(jugador48);
            Jugador jugador49 = new Jugador("Gabriel Rojas", 3200, 25, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresCasla.add(jugador49);
            Jugador jugador50 = new Jugador("Jalil Elias", 3000, 27, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresCasla.add(jugador50);
            Jugador jugador51 = new Jugador("Diego Rodriguez", 3000, 33, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresCasla.add(jugador51);
            Jugador jugador52 = new Jugador("Oscar Romero", 5500, 28, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresCasla.add(jugador52);
            Jugador jugador53 = new Jugador("Juan Ramirez", 4000, 29, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresCasla.add(jugador53);
            Jugador jugador54 = new Jugador("Nicolas Fernandez", 3500, 28, Posicion.DELANTERO, new Jugador.Propiedades());
                jugadoresCasla.add(jugador54);
            Jugador jugador55 = new Jugador("Angel Romero", 6500, 28, Posicion.DELANTERO, new Jugador.Propiedades());
                jugadoresCasla.add(jugador55);

            ///BANFIELD
            ArrayList<Jugador> jugadoresBanfield = new ArrayList<Jugador>();

            Jugador jugador56 = new Jugador("Ivan Arboleda", 4500, 29, Posicion.ARQUERO, new Jugador.Propiedades());
                jugadoresBanfield.add(jugador56);
            Jugador jugador57 = new Jugador("Emanuel Coronel", 2200, 27, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresBanfield.add(jugador57);
            Jugador jugador58 = new Jugador("Alexis Maldonado", 3500, 30, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresBanfield.add(jugador58);
            Jugador jugador59 = new Jugador("Luciano Lollo", 3500, 33, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresBanfield.add(jugador59);
            Jugador jugador60 = new Jugador("Alexis Sosa", 1500, 21, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresBanfield.add(jugador60);
            Jugador jugador61 = new Jugador("Franco Quinteros", 1500, 22, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresBanfield.add(jugador61);
            Jugador jugador62 = new Jugador("Martin Payero", 4000, 22, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresBanfield.add(jugador62);
            Jugador jugador63 = new Jugador("Alejandro Cabrera", 1800, 28, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresBanfield.add(jugador63);
            Jugador jugador64 = new Jugador("Giuliano Galoppo", 5000, 21, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresBanfield.add(jugador64);
            Jugador jugador65 = new Jugador("Juan Alvarez", 2500, 25, Posicion.DELANTERO, new Jugador.Propiedades());
                jugadoresBanfield.add(jugador65);
            Jugador jugador66 = new Jugador("Luciano Pons", 2200, 31, Posicion.DELANTERO, new Jugador.Propiedades());
                jugadoresBanfield.add(jugador66);

            ///ARGENTINOS
            ArrayList<Jugador> jugadoresArgentinos = new ArrayList<Jugador>();

            Jugador jugador67 = new Jugador("Lucas Chavez", 4000, 25, Posicion.ARQUERO, new Jugador.Propiedades());
                jugadoresArgentinos.add(jugador67);
            Jugador jugador68 = new Jugador("Jonathan Sandoval", 3500, 33, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresArgentinos.add(jugador68);
            Jugador jugador69 = new Jugador("Kevin Mac Allister", 2000, 24, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresArgentinos.add(jugador69);
            Jugador jugador70 = new Jugador("Miguel Torren", 4500, 32, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresArgentinos.add(jugador70);
            Jugador jugador71 = new Jugador("Carlos Quintana", 3800, 33, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresArgentinos.add(jugador71);
            Jugador jugador72 = new Jugador("Elias Gomez", 4000, 26, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresArgentinos.add(jugador72);
            Jugador jugador73 = new Jugador("Jonathan Gomez", 1600, 31, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresArgentinos.add(jugador73);
            Jugador jugador74 = new Jugador("Franco Moyano", 2200, 23, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresArgentinos.add(jugador74);
            Jugador jugador75 = new Jugador("Cesar Florentin", 1500, 22, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresArgentinos.add(jugador75);
            Jugador jugador76 = new Jugador("Gabriel Avalos", 4500, 29, Posicion.DELANTERO, new Jugador.Propiedades());
                jugadoresArgentinos.add(jugador76);
            Jugador jugador77 = new Jugador("Gabriel Hauche", 5000, 34, Posicion.DELANTERO, new Jugador.Propiedades());
                jugadoresArgentinos.add(jugador77);

            ///ROSARIO CENTRAL
            ArrayList<Jugador> jugadoresCentral = new ArrayList<Jugador>();

            Jugador jugador78 = new Jugador("Jorge Broun", 5000, 35, Posicion.ARQUERO, new Jugador.Propiedades());
                jugadoresCentral.add(jugador78);
            Jugador jugador79 = new Jugador("Damian Martinez", 2000, 28, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresCentral.add(jugador79);
            Jugador jugador80 = new Jugador("Facundo Almada", 1200, 22, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresCentral.add(jugador80);
            Jugador jugador81 = new Jugador("Gaston Avila", 2000, 22, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresCentral.add(jugador81);
            Jugador jugador82 = new Jugador("Lautaro Blanco", 1400, 22, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresCentral.add(jugador82);
            Jugador jugador83 = new Jugador("Luciano Ferreyra", 1100, 19, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresCentral.add(jugador83);
            Jugador jugador84 = new Jugador("Diego Zabala", 3500, 29, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresCentral.add(jugador84);
            Jugador jugador85 = new Jugador("Emiliano Vecchio", 5500, 32, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresCentral.add(jugador85);
            Jugador jugador86 = new Jugador("Pedro Ojeda", 1400, 23, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresCentral.add(jugador86);
            Jugador jugador87 = new Jugador("Lucas Gamba", 4000, 30, Posicion.DELANTERO, new Jugador.Propiedades());
                jugadoresCentral.add(jugador87);
            Jugador jugador88 = new Jugador("Marcos Ruben", 6000, 35, Posicion.DELANTERO, new Jugador.Propiedades());
                jugadoresCentral.add(jugador88);

            ///GODOY CRUZ
            ArrayList<Jugador> jugadoresGodoyCruz = new ArrayList<Jugador>();

            Jugador jugador89 = new Jugador("Nelson Ibañez", 3000, 38, Posicion.ARQUERO, new Jugador.Propiedades());
                jugadoresGodoyCruz.add(jugador89);
            Jugador jugador90 = new Jugador("Hugo Silva", 1800, 29, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresGodoyCruz.add(jugador90);
            Jugador jugador91 = new Jugador("Mauro Dos Santos", 2000, 31, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresGodoyCruz.add(jugador91);
            Jugador jugador92 = new Jugador("Augusto Aguirre", 1100, 21, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresGodoyCruz.add(jugador92);
            Jugador jugador93 = new Jugador("Damian Perez", 1500, 31, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresGodoyCruz.add(jugador93);
            Jugador jugador94 = new Jugador("Ian Escobar", 2200, 25, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresGodoyCruz.add(jugador94);
            Jugador jugador95 = new Jugador("Renzo Tesuri", 2000, 25, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresGodoyCruz.add(jugador95);
            Jugador jugador96 = new Jugador("Wilder Cartagena", 1800, 26, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresGodoyCruz.add(jugador96);
            Jugador jugador97 = new Jugador("Fabian Henriquez", 2200, 26, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresGodoyCruz.add(jugador97);
            Jugador jugador98 = new Jugador("Cristian Colman", 2800, 27, Posicion.DELANTERO, new Jugador.Propiedades());
                jugadoresGodoyCruz.add(jugador98);
            Jugador jugador99 = new Jugador("Matias Ramirez", 1500, 22, Posicion.DELANTERO, new Jugador.Propiedades());
                jugadoresGodoyCruz.add(jugador99);

            ///ALDOSIVI
            ArrayList<Jugador> jugadoresAldosivi = new ArrayList<Jugador>();

            Jugador jugador100 = new Jugador("Fabian Assmann", 2000, 35, Posicion.ARQUERO, new Jugador.Propiedades());
                jugadoresAldosivi.add(jugador100);
            Jugador jugador101 = new Jugador("Joaquin Indacoechea", 1400, 20, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresAldosivi.add(jugador101);
            Jugador jugador102 = new Jugador("Jonathan Schunke", 2500, 34, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresAldosivi.add(jugador102);
            Jugador jugador103 = new Jugador("Emiliano Insua", 3700, 32, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresAldosivi.add(jugador103);
            Jugador jugador104 = new Jugador("Emanuel Insua", 3000, 30, Posicion.DEFENSOR, new Jugador.Propiedades());
                jugadoresAldosivi.add(jugador104);
            Jugador jugador105 = new Jugador("Leandro Maciel", 2500, 25, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresAldosivi.add(jugador105);
            Jugador jugador106 = new Jugador("Gaston Gil Romero", 3500, 28, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresAldosivi.add(jugador106);
            Jugador jugador107 = new Jugador("Gaston Lodico", 2000, 23, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresAldosivi.add(jugador107);
            Jugador jugador108 = new Jugador("Francisco Grahl", 2500, 29, Posicion.MEDIOCAMPISTA, new Jugador.Propiedades());
                jugadoresAldosivi.add(jugador108);
            Jugador jugador109 = new Jugador("Federico Andrada", 4000, 27, Posicion.DELANTERO, new Jugador.Propiedades());
                jugadoresAldosivi.add(jugador109);
            Jugador jugador110 = new Jugador("Malcom Braida", 2200, 24, Posicion.DELANTERO, new Jugador.Propiedades());
                jugadoresAldosivi.add(jugador110);


            ClubReal boca = new ClubReal("Boca Juniors", 23, jugadoresBoca);
            ClubReal velez = new ClubReal("Velez Sarsfield", 23, jugadoresVelez);
            ClubReal independiente = new ClubReal("Independiente", 23, jugadoresIndependiente);
            ClubReal talleres = new ClubReal("Talleres", 23, jugadoresTalleres);
            ClubReal lanus = new ClubReal("Lanus", 23, jugadoresLanus);
            ClubReal huracan = new ClubReal("Huracan", 23, jugadoresHuracan);
            ClubReal gimnasia = new ClubReal("Gimnasia y Esgrima de la Plata", 23, jugadoresGimnasia);
            ClubReal patronato = new ClubReal("Patronato", 23, jugadoresPatronato);
            ClubReal defensayjusticia = new ClubReal("Defensa y Justicia", 23, jugadoresDyJ);
            ClubReal newells = new ClubReal("Newell's Old Boys", 23, jugadoresNewells);
            ClubReal colon = new ClubReal("Colon", 23, jugadoresColon);
            ClubReal estudiantes = new ClubReal("Estudiantes", 23, jugadoresEstudiantes);
            ClubReal river = new ClubReal("River", 23, jugadoresRiver);
            ClubReal racing = new ClubReal("Racing", 23, jugadoresRacing);
            ClubReal sanLorenzo = new ClubReal("San Lorenzo", 23, jugadoresCasla);
            ClubReal banfield = new ClubReal("Banfield", 23, jugadoresBanfield);
            ClubReal argentinos = new ClubReal("Argentinos", 23, jugadoresArgentinos);
            ClubReal rosarioCentral = new ClubReal("Rosario Central", 23, jugadoresCentral);
            ClubReal godoyCruz = new ClubReal("Godoy Cruz", 23, jugadoresGodoyCruz);
            ClubReal aldosivi = new ClubReal("Godoy Cruz", 23, jugadoresAldosivi);

            listaDeClubes.add(boca);
            listaDeClubes.add(river);
            listaDeClubes.add(independiente);
            listaDeClubes.add(racing);
            listaDeClubes.add(estudiantes);
            listaDeClubes.add(velez);
            listaDeClubes.add(sanLorenzo);
            listaDeClubes.add(rosarioCentral);
            listaDeClubes.add(newells);
            listaDeClubes.add(huracan);
            listaDeClubes.add(argentinos);
            listaDeClubes.add(aldosivi);
            listaDeClubes.add(godoyCruz);
            listaDeClubes.add(banfield);
            listaDeClubes.add(patronato);
            listaDeClubes.add(lanus);
            listaDeClubes.add(gimnasia);
            listaDeClubes.add(talleres);
            listaDeClubes.add(defensayjusticia);
            listaDeClubes.add(colon);

            String path = "C:\\Users\\Diego Contreras\\IdeaProjects\\Trabajo_Practico_Final_Prog3\\src\\main\\resources\\archivoClubes.txt";///Ubicacion del archivo

            File miArchi = new File(path);

                try

            {
                if (!miArchi.exists()) {
                    System.out.println("El archivo no existe, vamos a tener que crear uno.");
                    miArchi.createNewFile();
                    System.out.println("Archivo " + miArchi.getName() + " creado con exito!\n");
                }

                if (miArchi.isDirectory()) {
                    File[] fileList = miArchi.listFiles();

                    System.out.println("--- Lista de archivos de nuestro directorio ---");
                    for (File fichero : fileList) {
                        System.out.println(fichero.getName());
                    }
                } else {
                    /// MOSTRAMOS LOS DATOS DEL ARCHIVO
                    System.out.println("--- DATOS DEL ARCHIVO ---");
                    System.out.println("Nombre: " + miArchi.getName());
                    System.out.println("Ruta: " + miArchi.getPath());
                    System.out.println("Tamaño: (Bytes) " + miArchi.length());

                    Date lastUpdate = new Date(miArchi.lastModified());
                    System.out.println("Ultima modificacion: " + lastUpdate.toString());

                    FileWriter fWritter = new FileWriter(miArchi);
                    BufferedWriter bWritter = new BufferedWriter(fWritter);

                    if (!miArchi.canWrite()) {
                        miArchi.setWritable(true);
                    }

                    System.out.println("\n --- ESCRIBIR ARCHIVO ---");
                    for (int i = 0; i <= listaDeClubes.size() - 1; i++) {
                        bWritter.write("\n" + listaDeClubes.get(i).getNombre() + ": ");
                        bWritter.newLine();
                        for (int j = 0; j <= listaDeClubes.get(i).getListaJugadores().size() - 1; j++){
                            bWritter.write("---------------------------------------");
                            bWritter.newLine();
                            bWritter.write("Nombre Jugador: " + listaDeClubes.get(i).getListaJugadores().get(j).getNombre());
                            bWritter.newLine();
                            bWritter.write("Edad: " + listaDeClubes.get(i).getListaJugadores().get(j).getEdad());
                            bWritter.newLine();
                            bWritter.write("Posicion: " + listaDeClubes.get(i).getListaJugadores().get(j).getPosicion());
                            bWritter.newLine();
                            bWritter.write("Precio: $" + listaDeClubes.get(i).getListaJugadores().get(j).getPrecio());
                            bWritter.newLine();
                            bWritter.write("---------------------------------------");
                            bWritter.newLine();
                        }
                    }

                    ///FIN DE LA ESCRITURA EN EL ARCHIVO
                    System.out.println("--- CERRANDO EL BUFFER ---");
                    bWritter.close();
                }

                ///Preparamos nuestro ambiente de lectura
                FileReader fReader = new FileReader(miArchi);
                BufferedReader bReader = new BufferedReader(fReader);

                String line = null;

                if (!miArchi.canRead()) {
                    miArchi.setReadable(true);
                }

                line = bReader.readLine();

                System.out.println("\n --- INICIANDO LECTURA ---");
                while (line != null) {
                    System.out.println(line);
                    line = bReader.readLine();
                }

                System.out.println("\n --- CERRANDO BUFFER DE LECTURA ---");
                bReader.close();
            } catch(
            IOException e)

            {
                System.out.println("No se pudo leer/escribir el archivo: " + e.getMessage());
                e.printStackTrace();
            }
    }*/
}
