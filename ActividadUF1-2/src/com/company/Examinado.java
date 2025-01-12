package com.company;

import java.util.Random;

public class Examinado implements Runnable {
    public static String[] RESPUESTAS = {"A", "B", "C", "D", "-"};


    private BufferExamenes buffer;
    private static int numeroExamen = 0;
    private Thread hilo;


    public Thread getHilo() {
        return hilo;
    }

    public Examinado(String alumno, BufferExamenes generador) {

        // Construye el hilo. El nombre será el nombre del alumno
        // Establece el valor de la propiedad buffer
        // Inicia el hilo.
        numeroExamen++;
        this.buffer = generador;
        hilo = new Thread( this, "alumno" );// Usa 'alumno' como nombre del hilo
        hilo.start();
    }

    @Override

    public synchronized void run() {


        String codigoExamen = this.buffer.consumirExamen();
        if (codigoExamen != null) {
        // Simula aquí un examen de 10 preguntas
        // cuyas respuestas se seleccionarán al azar
        // entre A, B, C, D o – (sin contestar).

            for (int i=1; i <=10; i++){
                String respuesta = respuestAleatoria();
                System.out.println(" respuesta "+ i +  " Respuesta seleccionada" + respuesta);
            }
        }
        else {

            System.out.println("Agotado tiempo de espera y " + "no hay más exámenes");
        }
    }

    private String respuestAleatoria() {
        Random random = new Random();
        int index = random.nextInt(RESPUESTAS.length);//Selecciona un índice aleatorio
        return RESPUESTAS[index]; // Devuelve la respuesta aleatoria

    }
}

