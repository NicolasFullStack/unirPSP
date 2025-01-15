package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class servidor1 {
    public static void main(String[] args) {

        try {    //Creo un ServerSocket que escuche en el puerto 8080 uso de ServerSocket
            ServerSocket serverEscucha = new ServerSocket(1492);
            System.out.println("1- Servidor escuchando en el puerto numero 8080");

            //Esperar a que algun  cliente se conecte uso de Socket y accept()
            Socket socketCliente = serverEscucha.accept();
            System.out.println("2- El cliente se ha conectado");


            //enviamos un mensaje al cliente uso de outputStream
            OutputStream enviOutput = socketCliente.getOutputStream();
            String mesajeDelServidor = "3- !Hola esto es el mensaje del servidor";
            enviOutput.write(mesajeDelServidor.getBytes());
            enviOutput.flush();//Usamos flush para enviar los datos ya.
            System.out.println("4- el mensaje al cliente ha sido enviado");


            //Ahora recibimos el mensaje de respuesta del cliente usando el buffer
            InputStream menajeRecibido = socketCliente.getInputStream();
            byte[] buffer = new byte[1024];
            int bytesRead = menajeRecibido.read(buffer);
            String mensajeCliente = new String(buffer, 0, bytesRead);
            System.out.println("Este es el menaje del cliente de vuelta " + mensajeCliente);

            // Ahora cerramos la conexion con el cliente y el servidor
            socketCliente.close();
            System.out.println("el socket, la conexion con el cliente se ha cerrado");
            serverEscucha.close();
            System.out.println("el servidor lo hemos cerrado");

        } catch (IOException e) {
            System.out.println("Error en el servidor " + e.getMessage());
        }
    }
}
