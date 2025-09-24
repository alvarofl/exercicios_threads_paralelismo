import java.util.List;
import java.lang.reflect.Array;
import java.util.Arrays;
public class CaixaMercado {
//declarando a lista  de estatos
        enum Processo {
            passaCompra, pagandoCompra, compraPaga
        }
//criando a lista de threads 
        List<String> caixa = Arrays.asList("caixa #1", "caixa #2", "caixa #3");
        public static void main(String[] args) {
            //instancia o objeto

                CaixaMercado Mercado = new CaixaMercado();
                for (String caixa : mercado.caixas) {
                        new Thread = (() -> {
                                            System.out.println(caixa + " iniciou atendimento na " + 
                                                Thread.currentThread().getName());
                            try {
                                //simulando cada parte do processo de compra, passaCompra, pagandoCompra e pagaCompra
                                        for(Processo p : Processo.values()) {
                                                                    System.out.println(caixa + " está em: " + p);
                                            Thread.sleep(1000   );
                                            //esse comando thread sleep faz uma pausa

                                        }   catch (InterruptedException e) {
                                                                e.printStackTrace();

                                        }
                System.out.println(caixa + " finalizou atendimento ✅");
                            }).start();
                        }

                }
        }
}