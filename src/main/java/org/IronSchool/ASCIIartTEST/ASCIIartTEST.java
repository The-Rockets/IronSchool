package org.IronSchool.ASCIIartTEST;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ASCIIartTEST {

    public static void metodoASSCIart(){
     try {
        // Abrir el archivo "test.txt"
        BufferedReader reader = new BufferedReader(new FileReader("TEST.txt"));

        // Leer cada línea del archivo
        String line;
        while ((line = reader.readLine()) != null) {
            // Imprimir cada línea en pantalla
            System.out.println(line);
        }

        // Cerrar el archivo
        reader.close();
    } catch (IOException e) {
        // Mostrar un mensaje de error si no se puede abrir el archivo
        System.out.println("Error al abrir el archivo: " + e.getMessage());
    }
}
}
