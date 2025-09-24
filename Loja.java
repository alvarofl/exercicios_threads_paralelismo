import java.util.List;
    import java.util.Arrays;
public class Loja {
    List <String> itemPedidos = Arrays.asList("pedido #1", "pedido #2", "pedido #3");
        public static void main(String[] args) {
            Loja loja = new Loja();
                for (String pedido : loja.itemPedidos) {
                        new Thread (() -> {
                System.out.println("Processando " + pedido + " na thread " + 
                            Thread.currentThread().getName());

                        }).start();

                }
        
}
}