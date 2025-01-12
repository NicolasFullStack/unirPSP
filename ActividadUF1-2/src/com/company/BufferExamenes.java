package com.company;

import java.util.LinkedList;

import java.util.Queue;



public class BufferExamenes {

        private Queue<String> colaExamenes;


        public BufferExamenes() {

            colaExamenes = new LinkedList<String>();

        }

        public synchronized void fabricarNuevoExamen(String codigo){

            // Aquí se fabrica un nuevo examen.
            // Un hilo de la clase ProductorExamenes se encargará de fabricarlo y pasarlo como argumento a este método.
            // Añade el código pasado como argumento a la cola
            // y libera el hilo que está intentando consumir
            // un nuevo examen.

            while (colaExamenes.isEmpty()) {
                colaExamenes.add(codigo);
                notify();
            }

        }


        public synchronized String consumirExamen() {

            // Este método se encargará de suministrar un examen
            // a cada hilo de tipo Examinador que lo solicite.
            // Para suministrar el examen habrá antes que esperar
            // hasta que haya algún examen para consumir en la cola.

            while (colaExamenes.isEmpty()) {
                // Haz aquí una pausa hasta que se haya fabricado algún examen.
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (!colaExamenes.isEmpty()) {
                colaExamenes.remove();

            }
            return consumirExamen();

            // Si la cola sigue sin estar vacía, saca un examen y

            // entrégalo como retorno de esta función.

        }

}