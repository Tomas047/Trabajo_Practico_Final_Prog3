package com.company;

public class Basura {
    /* AdministracionUsuarios.cargarCuentas();

        // 50 equipos
        /*String[] nombreEquipos = new String[]{"Boca Juniors", "River Plate", "Independiente", "Racing", "San Lorenzo", "Estudiantes", "Velez", "Patronato", "Godoy Cruz", "Lanus", "Banfield", "Argentinos Juniors", "Huracan", "Ferro", "Aldosivi", "Alvarado", "Newells", "Rosario Central", "Real Madrid", "Barcelona", "Atletico de Madrid", "Sevilla", "Valencia", "Juventus", "Inter", "Milan", "Atalanta", "Napoli", "Bayern Munich", "Borussia Dortmund", "Schalke 04", "Manchester United", "Liverpool", "Manchester City", "Chelsea", "Tottenham", "PSG", "Olympique de Marsella", "Arsenal", "Talleres", "Belgrano", "Instituto", "Athletic de Bilbao", "Crotone", "Defensa y Justicia", "Benfica", "Atletico Mineiro", "Santos", "Cruzeiro", "Palmeiras"};
        String[] apellidos = new String[]{"Castro", "Rodriguez", "Perez", "Contreras", "Eguzquiza", "Ledesma", "Castillo", "Vega", "Villalba", "Arias", "Navarro", "Barrios", "Soria", "Alvarado", "Lozano", "James", "Basualdo", "Bedoya", "Martinez", "Orsini", "Pauletta", "Gomez", "Nani", "Sanchez", "Alvarez", "Segovia", "Mura", "Jurado", "Lerner", "Balvin", "Alvear", "Cardona", "Fabra", "Riquelme", "Tevez", "Lapadula", "Silva", "Antunes", "Castroman", "Heimer", "Soraka", "Rey", "Reyes", "Leon", "Nuñez", "Melgarejo", "Lopez"};
        String[] nombresAdmins = new String[]{"George", "SangreXeneixe", "Norbert", "Futbol360", "DeporTV"};
        String[] nombresTorneos = new String[]{"Copa A", "Copa B", "Superliga A", "Superliga B"};
        String[] nombres = new String[]{"Diego", "German", "Mateo", "Daniel", "Martin", "Juani", "Leo", "Eliseo", "Danilo", "Nicolas", "Pablo", "Alvaro", "Adrian", "David", "Javier", "Mario", "Sergio", "Marcos", "Manuel", "Jorge", "Axel", "Luke", "Julian", "Benjamin", "Dante","Gerardo","Facundo","Sixto","Germán","Felipe","Santiago","Javier","Wilfredo","Cristóbal","Simón","Feliciano","Pedro","Julián","Leonardo","Joaquín","Domigo","Fernando","Ignacio","Gregorio","Beltrán","Tobías","Teodoro","Guillermo","David","Agustín","Eduardo","Darío","Lázaro","Ismael","Salvador","Alejo","Jesús","Constantino","Gonzalo","Elías","Federico","Dimas","Tomás","Juan","Félix","Alberto","Francisco","Cayetano","Sebastián","Ernesto","Isaías","Camilo","Valerio","Jorge","Humberto","Enrique","Jonás","Abrahám","Isaac","Tylor","Robert","Kurtis","Bryan","Peter","Cameron","Andy","Benny","Emilio","Zacarías","Bruno","Dámaso","Damián","Emiliano","Alexander","John","Jeremy","Charlie","Dexter","Dean","Oswald","Mitchell","Howard","Luke","Roger","Donald","Christian","Zac","Salvatore","Valentino","Paulino","Fabiano","Luigi","Lazzaro","Alessandro","Giacomo","Emiliano","Donatello","Agostino","Cecilio","Luciano","Massimo","Silvano","Riccardo","Flavio","Damiano","Iker","Asier","Fermin","Ibai", "Marco", "Andrea", "Ariel", "Fabricio", "Santino", "Adriano", "Carlo", "Federico", "Donato", "Giovanni", "Lorenzo", "Leonardo", "Ulises", "Hipolito", "Luis Miguel", "Aaron", "Abel", "Ismael", "Abraham", "Agustino", "Simon", "Alcides", "Aldo", "Alex", "Alejo", "Aleph", "Alesio", "Alessandro", "Alfredo", "Alan", "Alvaro", "Amadeo", "Amancio", "Amilcar", "Anacleto", "Anibal", "Anselmo", "Aparicio", "Julio Argentino", "Benjamin", "Blas", "Connor", "Dan", "Dante", "Dariel", "Eithan", "Eladio", "Nahitan", "Fernan", "Filipe", "Felipe", "Flavio", "Guido"};
        //String[] paises = new String[]{"Afganistán","Kabul","Asia","Albania","Tirana","Europa","Alemania","Berlín","Europa","Andorra","Andorra la Vieja","Europa","Angola","Luanda","África","Antigua y Barbuda","Saint John","América","Arabia Saudita","Riad","Asia","Argelia","Argel","África","Argentina","Buenos Aires","América","Armenia","Ereván","Asia","Australia","Canberra","Oceanía","Austria","Viena","Europa","Azerbaiyán","Bakú","Asia","Bahamas","Nasáu","América","Bangladés","Daca","Asia","Barbados","Bridgetown","América","Baréin","Manama","Asia","Bélgica","Bruselas","Europa"};

        ArrayList<String> hombre = new ArrayList<>();

        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < apellidos.length; j++) {
                hombre.add(nombres[i] + " " + apellidos[j]);
            }
        }
        Collections.shuffle(hombre);

        for (String nombreAdmin:nombresAdmins) {
            AdministracionUsuarios.crearAdmin(nombreAdmin);
        }

        Random rand = new Random();

        int j = 0;
        int p = 0;
        ArrayList<Admin> admins = AdministracionUsuarios.getAdmins();
        for (Admin admin : admins) {
            for (String nombreTorneo:nombresTorneos) {
                int maxJug = rand.nextInt(7) + 5; // min 5 ,max 5+7
                Torneo torneo = new Torneo(nombreTorneo + " " + admin.getNombre(), maxJug);///Modificar
                for (int k = 0; k < 6; k++) {
                    j = j == 49 ? 0 : j;
                    //p = p == 53 ? 0 : p;
                    //String pais = paises[p++];
                    torneo.addClub(new ClubReal(nombreEquipos[j++], torneo.getMaxJugadores()));
                }
                admin.addTorneo(torneo);
            }
        }

        int i = 0;
        for (Admin admin : admins) {
            Set<Torneo> torneos = admin.getTorneo();
            for (Torneo torneo:torneos) {
                ArrayList<ClubReal> equipos = torneo.getEquipos();
                int maxJugadores = torneo.getMaxJugadores();
                for (ClubReal equipo : equipos) {
                    for (int k = 0; k < maxJugadores; k++) {
                        try{
                            i = i == 14*18 ? 0 : i;
                            Jugador.Propiedades prop = new Jugador.Propiedades();
                            for (int l = 0; l < 7; l++) {
                                prop.setPropiedad(l, rand.nextInt(25));
                            }
                            Jugador jugador = new Jugador(hombre.get(i++), prop);
                            jugador.refreshPrecio();
                            equipo.addJugador(jugador);
                        }catch (ExisteNombreException e){
                            System.out.println("SALTA\n"); ///Si salta es porque hay pocos nombres cargados
                        }
                    }
                }
            }
        }

        ArrayList<Admin> admins = AdministracionUsuarios.getAdmins();
        System.out.println("--- Manejo de admins ---");

        for(int m = 0; m < admins.size(); m++){
            System.out.println("\n" + admins.get(m) + "\n");
        }

        DT dt25 = new DT("Paton Bauza");
        Torneo torneito = new Torneo("Torneito", 23);
        Admin carlito = new Admin("Carlito");
        AdministracionEquipo adminEquipo = dt25.getAdminEquipo();


        dt25.inscribirse(torneito);
        carlito.addTorneo(torneito);
        carlito.addDT("Torneito", dt25);

        Presupuesto presu = dt25.getPresupuesto();

        /* DT dt1 = new DT("Diego Contreras");
        //
        //        Torneo superligaArgentina = new Torneo("Superliga Argentina", 23);
        //
        //        dt1.inscribirse(superligaArgentina);
        //
        //        System.out.println(dt1.estaInscripto(superligaArgentina));
        //
        //        System.out.println(dt1.getPuntos(superligaArgentina) + " puntos.");
        //
        //        Presupuesto presu = dt1.getPresupuesto();
        //
        //        System.out.println("$" + presu.getPresupuestoInicial(superligaArgentina));*/
    //
    //        ///Asignarle una posicion a cada equipito
    //
    //       /* System.out.println(presu.consultarCompra(superligaArgentina, listaDeClubes.get(1).listaJugadores.get(1)));
    //
    //        presu.setPresupuestoInicial(superligaArgentina);
    //
    //        System.out.println("$" + presu.getPresupuestoInicial(superligaArgentina));*/
    //
    //        //AdministracionEquipo adminEquipo = dt1.getAdminEquipo();
    //
    //        /*dt1.comprar(superligaArgentina, boca.listaJugadores.get(2));
    //        presu.comprar(superligaArgentina, boca.listaJugadores.get(2));
    //
    //        System.out.println(presu.getPresupuestoInicial(superligaArgentina))

        /*dt25.comprar(torneito,admins.get(1).getTorneo(torneito.getNombre()).getEquipo("Boca Juniors").getListaJugadores().get(2));
        presu.comprar(torneito, admins.get(1).getTorneo(torneito.getNombre()).getEquipo("Boca Juniors").getListaJugadores().get(2));

        System.out.println("Mi presupuesto actual es: $" + dt25.getPresupuesto().getPresupuestoInicial(torneito));
       /* System.out.println("Nombre Admin: " + admins.get(1).getNombre());

        System.out.println(admins.get(1).getTorneo("Copa B"));

        Admin diego = new Admin("Diego Contreras");

        //System.out.println(diego.crearTorneo("Superligarcha", 23));


        System.out.println("--- Manejo de torneos y admins ---");

        Torneo torneito = new Torneo("Torneito", 23);
        DT dt1 = new DT("Carlos Bianchi");
        DT dt2 = new DT("Miguel Angel Russo");
        //ClubReal allBoys = new ClubReal("All Boys", );

        diego.addTorneo(torneito);
        diego.addDT("Torneito", dt1);
        diego.addDT("Torneito", dt2);

        System.out.println(diego.existeTorneo(torneito));

        ArrayList<DT> arregloDT = new ArrayList<DT>();

        arregloDT = diego.getDTsOrdenados(torneito);

        for(int x=0; x < arregloDT.size(); x++){
            System.out.println("\n" + arregloDT.get(x) + "\n");
        }

        torneito.setAdmin(diego);

        System.out.println("Nombre Torneo: " + torneito.getNombre());

        System.out.println("Max Jugadores: " + torneito.getMaxJugadores());

        System.out.println("ADMIN torneo: " + torneito.getAdmin());

        //System.out.println();

        System.out.println("--- MANEJO DE  ----");

        AdministracionUsuarios.guardarCuenta();
*/
}
