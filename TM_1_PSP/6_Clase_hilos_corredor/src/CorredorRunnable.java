public class CorredorRunnable  implements Runnable { // IMPLEMENTA LA INTERFAZ RUNNABLE

    private Thread hilo; //CREAMOS LA VARIABLE DE TIPO HILO QUE ES PARTE DEL CONSTRUCTOR. SE TRATA COMO CLASE
    //INTERNA

    public CorredorRunnable(String nombre, int prioridad) {
        hilo = new Thread(this, nombre);
        hilo.setPriority(prioridad);
        hilo.start();
    }
    @Override
    public void run() {
        for (int i = 0; i <=10; i++) {

            System.out.println(hilo.getName()+ " Va por el kilometro " + i);
        }
        System.out.println(hilo.getName()+ " ha Terminado en la meta ");
    }

}




