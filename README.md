# Resolução Exercicio26

## Descrição do problema
Escreva um programa em Java que faça a leitura de 20 números inteiros
quaisquer e armazene em um vetor. Após a leitura mostre todos os números
ordenados crescentemente.

## Como Funciona
1. **Entrada de Dados:** Um primeiro laço `for` percorre os índices do vetor (de 0 até ao valor de `qtde` no caso do exemplo no valor de `20`) armazenando cada número inteiro digitado pelo usuário nas posições correspondentes do vetor `numeros`.
2. **Ordenação (Processamento):** O programa utiliza dois laços `for` aninhados para comparar os elementos entre si:
   - Se o número na posição atual `i` for maior que o número na posição seguinte `j` (`if (numeros[i] > numeros[j])`), eles trocam de lugar.
   - Uma variável temporária (`int aux`) é utilizada para segurar o valor de uma das posições e garantir que nenhum dado seja sobrescrito ou perdido durante a inversão.
3. **Saída de Dados:** Um último laço `for` percorre o vetor já totalmente ordenado e imprime cada número, um por linha, no console.
