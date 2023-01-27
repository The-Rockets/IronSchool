package org.IronSchool.ASCIIartTEST;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GodByAsciiArt {

    public static void goodBy() throws IOException {

            String nombre = "By  Rockets";
            // Generar el ASCII art
            String asciiArt = FigletFont.convertOneLine(nombre);
            // imprimir en pantalla
            System.out.println(asciiArt);
    }
}
