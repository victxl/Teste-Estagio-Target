# Teste de Programação em Java

Este repositório contém um programa em Java que resolve diferentes questões de um teste técnico. O objetivo é demonstrar habilidades em lógica de programação, manipulação de dados e interação com o usuário.

## Descrição do Projeto

O programa permite ao usuário escolher entre cinco questões diferentes. Cada questão possui uma implementação específica e as opções incluem:

1. **Cálculo da Soma**: Calcula a soma de números de 1 a 13 utilizando um loop.
2. **Verificação da Sequência de Fibonacci**: Recebe um número do usuário e verifica se ele pertence à sequência de Fibonacci.
3. **Análise de Faturamento Diário**: Analisa um conjunto de dados de faturamento diário, identificando o menor e maior faturamento, além do número de dias com faturamento superior à média mensal.
4. **Cálculo do Percentual de Faturamento por Estado**: Calcula e exibe o percentual de faturamento de uma distribuidora por estado.
5. **Inversão de String**: Inverte os caracteres de uma string fornecida pelo usuário.

### Funcionamento do Programa

O usuário é apresentado a um menu de opções. Ao escolher uma opção, o programa executa a funcionalidade correspondente e aguarda o pressionamento da tecla Enter antes de retornar ao menu principal. Isso garante que o usuário tenha tempo para ler os resultados de cada execução.

### Estrutura do Código

O código é estruturado em métodos para cada questão, facilitando a manutenção e a leitura. O método `main` controla o fluxo do programa e lida com a interação com o usuário. Abaixo está a descrição de cada método:

- **`calcularSoma()`**: Calcula e imprime a soma dos números de 1 a 13.
- **`verificarFibonacci()`**: Solicita um número ao usuário e verifica se ele pertence à sequência de Fibonacci.
- **`analisarFaturamento()`**: Processa um array de dados de faturamento diário, identificando o menor e maior faturamento e contando quantos dias tiveram faturamento acima da média.
- **`calcularPercentualEstado()`**: Calcula e exibe o percentual de faturamento por estado baseado em valores pré-definidos.
- **`inverterString()`**: Lê uma string do usuário e a inverte, exibindo o resultado.

### Como Executar

Para executar o programa, siga os passos abaixo:

1. Clone o repositório:
   git clone https://github.com/victxl/Teste-Estagio-Target.git
   cd Teste-Estagio-Target
2. Compile o codigo Java
  javac Teste.java
3. Execute o programa:
  java Teste
