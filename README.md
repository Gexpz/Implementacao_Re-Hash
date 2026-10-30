# Tabela Hash com Rehashing

## Descrição
Este projeto foi desenvolvido como atividade acadêmica para praticar a implementação de uma Tabela Hash utilizando a técnica de **Rehashing (sondagem linear)** em Java.
O programa realiza a inserção de números aleatórios em uma matriz de 100 posições, respeitando o limite de 90% de ocupação.

## Funcionalidades
- Criação de uma tabela hash com 100 posições.
- Geração de 100 números aleatórios utilizando `Random`.
- Utilização da seed `1090` para reproduzir a sequência de números.
- Tratamento de colisões por rehashing linear.
- Bloqueio de novas inserções ao atingir 90% de ocupação.
- Contagem total de colisões durante as inserções.
- Identificação dos três elementos que mais tiveram colisões.
- Exibição das posições livres na tabela.

## Tecnologias utilizadas
- Java
- IntelliJ IDEA

## Execução
A classe `Main` é responsável por gerar os números aleatórios e executar as operações da tabela hash.
Para executar o projeto, basta iniciar o método `main` da classe `Main`.

## Autoria
Projeto desenvolvido como atividade acadêmica da disciplina de Engenharia de Software.
