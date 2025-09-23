public class MinhaThread extends Thread {
    @Override
    public void run() {
            System.out.println("Executando na thread: " + Thread.currentThread().getName());

    }
}
