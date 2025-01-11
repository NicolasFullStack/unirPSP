public class CarreraJoin {
    public static void main(String[] args) throws InterruptedException {


        CorredorJoin cj1 = new CorredorJoin("Corredor 1", Thread.MIN_PRIORITY);
        cj1.getHilo().join();

        new CorredorJoin("Corredor 24", 3);
        new CorredorJoin("Corredor 22", 3);

        CorredorJoin cj4 = new CorredorJoin("Corredor 4", 10);
        cj4.getHilo().join();

        new CorredorJoin("Corredor 12", 3);
        new CorredorJoin("Corredor 32", 3);
        new CorredorJoin("Corredor 42", 3);
        //CorredorJoin cj3 = new CorredorJoin("Corredor 3", Thread.MAX_PRIORITY);
        //cj3.getHilo().join();


    }


}
