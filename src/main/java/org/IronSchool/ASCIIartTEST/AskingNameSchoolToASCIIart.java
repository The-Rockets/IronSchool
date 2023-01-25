package org.IronSchool.ASCIIartTEST;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.PrintWriter;
import java.util.Scanner;

public class AskingNameSchoolToASCIIart {

    public static String askingSchoolNameASCIIMethod(){

        System.out.println("Enter the name of the school");
        // Obtener el nombre del usuario
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        try {
            // Generar el ASCII art
            String asciiArt = FigletFont.convertOneLine(name);

/*
            // Escribir el ASCII art en un archivo
            PrintWriter writer = new PrintWriter("nombre.txt", "UTF-8");
            writer.println(asciiArt);
            writer.close();
*/

            // imprimir en pantalla
            System.out.println(asciiArt);

        } catch (Exception e) {
            System.out.println("Error al generar el ASCII art: " + e.getMessage());
        }
        return name;
    }
}
