import java.time.LocalDateTime;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {

        // Pido al usuario un numero
        // que requiere que el usuario introduzca un número como argumento
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un argumento ");
        int argumento1 = scanner.nextInt();
        System.out.println(argumento1);




        // Al principio de cada fichero de salida debe escribirse la fecha al inicio del proceso.

        System.out.println("Datos inicio del proceso de Triangulo: " + LocalDateTime.now());
        if (args.length == 0)
        {
            //avisa en caso de que no sea introducido.
            System.out.println("No se ha introducido ningun argumento y Se requiere un argumento sea colaborativo por favor");
            return;
        }
        int filas = Integer.parseInt(args[0]);
        for (int i=filas; i>=1; i--)
        {
            for (int n=1; n<=i; n++)
            {
                System.out.print(n);

            }
            System.out.println(argumento1);
            // Al final de cada fichero de salida debe escribirse la fecha al inicio del proceso.
            System.out.println("Datos final  del proceso de Triangulo: " + LocalDateTime.now());
        }


    }
}