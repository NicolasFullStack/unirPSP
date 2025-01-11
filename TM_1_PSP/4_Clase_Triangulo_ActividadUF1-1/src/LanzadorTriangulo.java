import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class LanzadorTriangulo {
    public static void main(String[] args) {




        // Indico la classpath actual del sistema ya que no lo guarda. Asi siempre tiene la ruta exacta
        String classpath = System.getProperty("java.class.path");
        // Iniciar tres procesos simultáneos lanzando tres veces el programa Triangulo con los parámetros 5, 7 y 9.
        ProcessBuilder proceso1 = new ProcessBuilder("java", "-cp", classpath, "Triangulo", String.valueOf(5),String.valueOf(7),String.valueOf(9) );
        proceso1.redirectError(new File("errores1.txt"));// Guarda los errores en el fichero errores.txt
        proceso1.redirectOutput(new File("triangulo1.txt")); // Guarda la salida en el fichero triangulo1.txt

            // Indico la classpath actual del sistema ya que no lo guarda. Asi siempre tiene la ruta exacta
            classpath = System.getProperty("java.class.path");
        // Iniciar tres procesos simultáneos lanzando tres veces el programa Triangulo con los parámetros 5, 7 y 9.
        ProcessBuilder proceso2 = new ProcessBuilder("java", "-cp", classpath, "Triangulo", String.valueOf(5),String.valueOf(7),String.valueOf(9));
        proceso2.redirectError(new File("errores2.txt"));// Guarda los errores en el fichero errores.txt
        proceso2.redirectOutput(new File("triangulo2.txt")); // Guarda la salida en el fichero triangulo1.txt

        // Indico la classpath actual del sistema ya que no lo guarda. Asi siempre tiene la ruta exacta
            classpath = System.getProperty("java.class.path");
        // Iniciar tres procesos simultáneos lanzando tres veces el programa Triangulo con los parámetros 5, 7 y 9.
        ProcessBuilder proceso3 = new ProcessBuilder("java", "-cp", classpath, "Triangulo", String.valueOf(5),String.valueOf(7),String.valueOf(9));
        proceso3.redirectError(new File("errores3.txt"));// Guarda los errores en el fichero errores.txt
        proceso3.redirectOutput(new File("triangulo3.txt")); // Guarda la salida en el fichero triangulo1.txt

            try{
        // Iniciamos el proceso y manajamos la salida

            proceso1.start().waitFor();
                System.out.println("proceso 1 lanzado");
            proceso2.start().waitFor();
                System.out.println("proceso 2 lanzado");
            proceso3.start().waitFor();
                System.out.println("proceso 3 lanzado");


            System.out.println("el triangulo esperado se ha construido");
            System.out.println("La informaciob esta en  el archivoo triangulo1.txt");

        } catch (IOException | InterruptedException e) {

            e.printStackTrace();        }

    }
}