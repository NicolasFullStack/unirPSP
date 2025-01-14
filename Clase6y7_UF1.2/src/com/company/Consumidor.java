package com.company;

public class Consumidor implements Runnable {
    private Thread hilo;
    private BufferRadios buffer;
    private static int contador = 0;
    public Consumidor(BufferRadios buffer) {
        contador++;
        hilo = new Thread(this, "Consumidor" + contador);
        this.buffer = buffer;
        hilo.start();
    }
    @Override
    public void run() {
        consumirUnRadio();
    }
    public void consumirUnRadio() {
        Integer radio = buffer.sacar();
        if (radio != null) {
            double l = 2 * Math.PI * radio;
            double a = Math.PI * radio * radio;
            System.out.println(hilo.getName() + " - Radio = " + radio + ", Longitud = " + l + " Area = "+ a );
        }
        else {
            System.out.println("Agotado el tiempo de espera y bno hay mas radios para consumir ");
        }
    }
}

