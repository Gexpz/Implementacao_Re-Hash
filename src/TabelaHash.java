public class TabelaHash {
    int[] tabela;
    //Quantidade de posições ocupadas
    int ocupacao;
    //Guarda os números que foram inseridos.
    int[] elementos = new int[100];
    //Guarda quantas colisões cada número teve.
    int[] colisoes = new int[100];
    //Controla quantos elementos já registramos
    int quantidadeInseridos = 0;
    //Acumula as colisoes
    int totalColisoes = 0;
    //Atributos Colisão
    int maiorColisao1 = -1;
    int maiorColisao2 = -1;
    int maiorColisao3 = -1;

    //Atributos Elementos
    int maiorElemento1;
    int maiorElemento2;
    int maiorElemento3;

    //Construtor
    public TabelaHash() {
        tabela = new int[100];
        ocupacao = 0;

        for (int i = 0; i < 100; i++) {
            tabela[i] = -1;
        }
    }

    //Metodo Para evitar inserção se for >= 90
    public void inserir(int valor) {

        if (ocupacao >= 90) {
            System.out.println("Tabela atingiu 90% de ocupação!");
            return;
        }

        int posicao = valor % 100;
        //tratamento de colisões usando rehashing.
        int colisoesElemento = 0;

        //Verificar se a posição está livre
        if (tabela[posicao] == -1) {
            tabela[posicao] = valor;
            ocupacao++;
        }else {
            //Procura enquanto a posição estiver ocupada
            while (tabela[posicao] != -1) {
                colisoesElemento++;
                posicao = (posicao + 1) % 100;
            }
            tabela[posicao] = valor;
            ocupacao++;
        }
        //registram o número, quantidade de colisões e avançam o contador.
        elementos[quantidadeInseridos] = valor;
        colisoes[quantidadeInseridos] = colisoesElemento;
        totalColisoes += colisoesElemento;
        quantidadeInseridos++;
    }

    //Metodo para encontrar as Maiores colisões
    public void encontrarMaioresColisoes() {

        for (int i = 0; i < quantidadeInseridos; i++) {
            //Encontra o primeiro maior.
            if (colisoes[i] > maiorColisao1) {
                maiorColisao3 = maiorColisao2;
                maiorElemento3 = maiorElemento2;

                maiorColisao2 = maiorColisao1;
                maiorElemento2 = maiorElemento1;

                maiorColisao1 = colisoes[i];
                maiorElemento1 = elementos[i];

            //Encontrar o segundo maior
            }else if (colisoes[i] > maiorColisao2) {
                maiorColisao3 = maiorColisao2;
                maiorElemento3 = maiorElemento2;

                maiorColisao2 = colisoes[i];
                maiorElemento2 = elementos[i];

            //Encontra o terceiro maior
            }else if (colisoes[i] > maiorColisao3) {
                maiorColisao3 = colisoes[i];
                maiorElemento3 = elementos[i];
            }
        }

    }

    //Metodo para percorrer a tabela e mostrar posições livres
    public void mostrarPosicoesLivres() {

        for (int i = 0; i < 100; i++) {
            if (tabela[i] == -1) {
                System.out.println("Posição livre: " + i);
            }

        }

    }
}