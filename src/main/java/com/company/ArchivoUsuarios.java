package com.company;

import java.io.*;

/**
 * Se ocupa de guardar la inforacion del Juego*/

class ArchivosUsuario{

    /**Busca la ruta donde esta guardado el archivo
     * devuelve la ruta del directorio*/
    private static String obtenerrutadirect() {
        File rutadirectorio = new File("src/resources");
        return rutadirectorio.getAbsoluteFile().toString();
    }
    /**
     * Guarda un objeto en el archivo
     * @param objeto el objeto a guardar
     * @param nombrearchivo el nombre del archivo donde guardar el objeto*/
    static void escribirArchivo(Object objeto, String nombrearchivo) throws IOException, ClassNotFoundException{
        String rutadirect = obtenerrutadirect();
        ObjectOutputStream outStream = null;
        outStream = new ObjectOutputStream(new FileOutputStream(rutadirect + "/" + nombrearchivo));
        outStream.writeObject(objeto);
        if (outStream != null)
            outStream.close();
    }
    /**
     * Busca un objeto en el archivo
     * @param nombrearchivo el nombre del archivo donde buscar el objeto*/
    static Object leerArchivo(String nombrearchivo) throws IOException, ClassNotFoundException {
        String rutadirect = obtenerrutadirect();
        String filePath = rutadirect + "/" + nombrearchivo;
        Object objeto = null;
        // si el archivo está vacio, no lo abrimos
        if (new File(filePath).length() != 0){
            ObjectInputStream inputStream;
            inputStream = new ObjectInputStream(new FileInputStream(filePath));
            objeto = inputStream.readObject();
            inputStream.close();
        }
        return objeto;
    }
}

