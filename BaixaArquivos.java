    import java.util.List;

import java.lang.reflect.Array;
import java.util.Arrays;


public class BaixaArquivos {
    // esse exercicio consiste em fazer o download de três, downloads de arquivos
    // diferentes ao mesmo tempo
    

        List<String> listaArquivos = Arrays.asList("arquivo #1", "arquivo #2", "arquivo #3");
            public static void main(String[] args) {
        
    BaixaArquivos baixaArquivos = new BaixaArquivos();
                for (String arquivo : baixaArquivos.listaArquivos) {
                        new Thread (() -> {
                System.out.println("Iniciando download de " + arquivo + " na thread " + Thread.currentThread().getName());
                                try {
                                    Thread.sleep(10000);

                                } catch (InterruptedException e) {
                                        e.printStackTrace();

                                }
                System.out.println("Download concluído de " + arquivo + " ✅");

                        }).start();

                }

             }
    }
    