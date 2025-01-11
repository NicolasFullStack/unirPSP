package com.company;

import java.util.LinkedList;
import java.util.Queue;

// 1--Codigo inicial sin esperas que dará problemas de stock
/*public class BufferRadios {

    private Queue<Integer> cola;

    public BufferRadios(){
        cola = new LinkedList<Integer>();//creación de la lista donde se almacenan lo que sea
    }
    public void poner (Integer r){ // la funcion se llama poner y la lista cola
        cola.add(r);
    }
    public void sacar(Integer r){
        if ( cola.isEmpty()){
            return null;
        }else {
            Integer radio = cola.remove();
            return radio;
        }
    }
}*/

// 2-- Codigo añadiendo wait() y Notify() para parar y reanudar procesos y que siempre tengamos stocki


public class BufferRadios {
    private Queue<Integer> cola;

    public BufferRadios() {
        cola = new LinkedList<Integer>();
    }

    public synchronized void poner(Integer r) {
        cola.add(r);
        notify();
    }

    public synchronized Integer sacar() {
        while (cola.isEmpty()) {

            try {

                wait(1000);

            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        if (!cola.isEmpty()) {
            Integer radio = cola.remove();
            return radio;

        } else {
            return null;
        }
    }
}
    /* Añadimos numeros de 20 ESPERAS

public class BufferRadios {
private Queue<Integer> cola;
public BufferRadios() {
cola = new LinkedList<Integer>();
}
public synchronized void poner(Integer r) {
cola.add(r);
notify();
}
public synchronized Integer sacar() {
int esperas = 0;
while (cola.isEmpty() && esperas<20) {
esperas ++;
try {
wait(10);
} catch (InterruptedException e) {
System.out.println(e.getMessage());
}
}
if (esperas<20) {
Integer radio = cola.remove();
return radio;
} else {
return null;
}
}
}
*/
