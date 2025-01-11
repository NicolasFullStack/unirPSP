public class CarreraRunnable {
    public static void main(String[] args) throws InterruptedException {

        new CorredorRunnable("Corredor1", 1);
        new CorredorRunnable("Corredor2", 3);
        new CorredorRunnable("Corredor3", 5);
        new CorredorRunnable("Corredor4", 10);// Es la maxima prioridad
    }
}
