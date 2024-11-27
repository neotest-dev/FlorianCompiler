/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author noefl
 */
public class Principal {
    public static void main(String[] args) throws Exception {
        String ruta2 = "C:/Users/noefl/OneDrive/Documentos/NetBeansProjects/FlorianCompiler/src/parser/LexerCup.flex";
        String[] rutaS = {"-parser", "Sintax", "C:/Users/noefl/OneDrive/Documentos/NetBeansProjects/FlorianCompiler/src/parser/Sintax.cup"};
        generar(ruta2, rutaS);
    }
    
    public static void generar(String ruta2, String[] rutaS) throws IOException, Exception {
        File archivo = new File(ruta2);

        // Generar lexer
        if (!archivo.exists()) {
            throw new IOException("El archivo LexerCup.flex no se encuentra en la ruta especificada.");
        }
        JFlex.Main.generate(archivo);

        // Generar parser
        java_cup.Main.main(rutaS);

        // Manejo de sym.java
        Path rutaSymGenerado = Paths.get("C:/Users/noefl/OneDrive/Documentos/NetBeansProjects/FlorianCompiler/sym.java");
        Path rutaSymDestino = Paths.get("C:/Users/noefl/OneDrive/Documentos/NetBeansProjects/FlorianCompiler/src/parser/sym.java");

        if (Files.exists(rutaSymGenerado)) {
            if (Files.exists(rutaSymDestino)) {
                Files.delete(rutaSymDestino);
            }
            Files.move(rutaSymGenerado, rutaSymDestino);
        } else {
            System.err.println("Error: sym.java no se generó correctamente.");
        }

        // Manejo de Sintax.java
        Path rutaSintaxGenerado = Paths.get("C:/Users/noefl/OneDrive/Documentos/NetBeansProjects/FlorianCompiler/Sintax.java");
        Path rutaSintaxDestino = Paths.get("C:/Users/noefl/OneDrive/Documentos/NetBeansProjects/FlorianCompiler/src/parser/Sintax.java");

        if (Files.exists(rutaSintaxGenerado)) {
            if (Files.exists(rutaSintaxDestino)) {
                Files.delete(rutaSintaxDestino);
            }
            Files.move(rutaSintaxGenerado, rutaSintaxDestino);
        } else {
            System.err.println("Error: Sintax.java no se generó correctamente.");
        }
    }

}
