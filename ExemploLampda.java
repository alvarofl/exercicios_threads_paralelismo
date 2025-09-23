public class ExemploLampda {
    public static void main(String[] args) {
        Thread t1 = new Thread (() -> {
                        System.out.println("Executando com lambda na thread: " + 
            Thread.currentThread().getName());

        });
        t1.start();

    }

}