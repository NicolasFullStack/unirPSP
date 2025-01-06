import java.io.IOException;
import java.io.InterruptedIOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Creacion del objeto ProcessBuilder. processo es del tipo Processbuilder
        ProcessBuilder proceso;

        //Instanciamos en el nuevo objeto la ruta del proceso que queremos lanzar
        proceso = new ProcessBuilder("C:/Windows/System32/calc.exe");
        try{
            //Indicamos el comienzo con proceso.start() ejecuta el contenido
            Process p= proceso.start();
            proceso.start();
            //Forma en la que lanzamos el proceso y obligamos al programa de java a que el sistema se queda
            //parado y cuando se pare la calculadora java sigue funcionando. 
            p.waitFor();
            System.out.println("proceso lanzado");
        } catch (IOException  | InterruptedException e) {
            System.out.println(e.getMessage());;
        }
        }
    }
