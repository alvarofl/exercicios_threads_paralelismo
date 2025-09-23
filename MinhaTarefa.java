public class MinhaTarefa implements      Runnable     {
@Override
        public void run() {
        System.out.println("Executando na thread: " + Thread.currentThread().getName());

        }

}
