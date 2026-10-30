import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random(1090);
        TabelaHash tabela = new TabelaHash();

        //Gerar os 100 números aleatórios.
        for (int i = 0; i < 100; i++) {
            int numero = random.nextInt(100001);
            tabela.inserir(numero);
        }

        System.out.println("Total de colisões: " + tabela.totalColisoes);

        //Encontrar os 3 elementos com mais colisões.
        tabela.encontrarMaioresColisoes();

        //Mostrar os resultados.
        System.out.println("1º elemento: " + tabela.maiorElemento1 + " | Colisões: " + tabela.maiorColisao1);
        System.out.println("2º elemento: " + tabela.maiorElemento2 + " | Colisões: " + tabela.maiorColisao2);
        System.out.println("3º elemento: " + tabela.maiorElemento3 + " | Colisões: " + tabela.maiorColisao3);

        //Mostrar as posições que ficaram livres.
        System.out.println("Posições livres na tabela:");
        //percorre a matriz e mostra todas as posições cujo valor continua -1.
        tabela.mostrarPosicoesLivres();
    }
}