public class CorredorJoin  implements Runnable{
    private Thread hilo;

    public CorredorJoin(String nombre, int prioridad){

        hilo = new Thread(this, nombre);

        hilo.setPriority(prioridad);
        hilo.start();
    }
    public Thread getHilo(){ // METODO GETHILO() PARA TENER ACCESO EXTERNO AL OBJETO THREAD
        return hilo;
    }
    @Override
    public void run(){
        for (int i = 0; i <=10; i++) {

            System.out.println(hilo.getName()+" Va por el kilometro " + i);
        }
        System.out.println(hilo.getName()+ " ha Terminado en la meta ");
    }

}
