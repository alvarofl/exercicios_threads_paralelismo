    import      java.util.concurrent.ExecutorService;
    import java.util.concurrent.Executors;

public class ExemploExecutor {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
                int taskId = i;
                    executor.submit(() -> {
                                        System.out.println("Executando tarefa " + taskId + " na thread: " + 
Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}