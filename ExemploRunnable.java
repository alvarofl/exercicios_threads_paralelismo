public class ExemploRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MinhaTarefa());
        
t1.start();

    }
}
