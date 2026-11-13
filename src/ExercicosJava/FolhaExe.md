# Folha de Exercícios - Maratona Java

A playlist **Maratona Java Virado no Jiraya (DevDojo)**, até a aula 68, cobre a sintaxe básica de Java e os conceitos fundamentais de Orientação a Objetos.

## Tópicos abordados

- Tipos Primitivos e Operadores
- Estruturas Condicionais (`if/else`, `switch`)
- Estruturas de Repetição (`for`, `while`, `do-while`)
- Arrays e Arrays Multidimensionais
- Orientação a Objetos: Classes, Atributos e Métodos
- Orientação a Objetos: Sobrecarga de Métodos e Construtores
- Modificadores de Acesso e Modificador `static`

---

## 1. Tipos Primitivos e Operadores

### Fácil (10 exercícios)

1. Crie uma variável `int` chamada `idade` com o valor `20` e imprima na tela.
2. Declare um `double` chamado `salario` com o valor `3500.50` e exiba-o.
3. Crie duas variáveis inteiras `a = 10` e `b = 5` e mostre a soma de ambas.
4. Calcule e exiba a subtração de `b` por `a` (use `a = 15` e `b = 8`).
5. Multiplique duas variáveis do tipo `float` e exiba o resultado.
6. Calcule o resto da divisão (%) de `17` por `4` e exiba na tela.
7. Crie uma variável `char` com a primeira letra do seu nome e imprima.
8. Declare uma variável booleana chamada `isMaiorDeIdade` com o valor `true`.
9. Converta um `double` contendo `89.9` para `int` usando casting explícito e imprima o resultado.
10. Crie um programa que declare três notas inteiras e exiba o resultado da média simples entre elas.

### Complicado / Mediano (10 exercícios)

1. Escreva um programa que calcule o valor de uma parcela de um empréstimo acrescida de juros simples de 2,5% ao mês sobre um capital inicial.
2. Crie um programa que converta uma temperatura de Celsius para Fahrenheit utilizando a fórmula `F = (C × 9/5) + 32`, usando tipos numéricos adequados para evitar perda de precisão.
3. Calcule o Índice de Massa Corporal (IMC) usando a fórmula `IMC = peso / altura²`, armazenando os valores como `double` e imprimindo o valor formatado.
4. Crie uma tabela de reajuste salarial: calcule o novo salário após uma taxa de aumento de 15% e deduza 7,5% de imposto sobre o salário reajustado.
5. Escreva um programa para calcular a distância entre dois pontos no plano cartesiano `(x1, y1)` e `(x2, y2)` utilizando operadores matemáticos e a classe `Math`.
6. Simule a troca dos valores de duas variáveis inteiras `x` e `y` sem utilizar uma terceira variável auxiliar, aproveitando apenas operadores aritméticos.
7. Escreva um programa que receba um número de dias inteiro e converta para anos, meses e dias restantes (considere 1 ano = 365 dias e 1 mês = 30 dias).
8. Demonstre o estouro de memória (overflow) em um tipo `byte` ao somar `1` ao seu valor máximo (`127`) e explique o resultado numérico obtido.
9. Dado o valor de um produto em centavos (ex.: 1575 centavos), converta e exiba o valor formatado em reais e centavos separados.
10. Crie um programa que use operadores de atribuição reduzida (`+=`, `-=`, `*=`, `/=`, `%=`) em sequência sobre uma mesma variável e exiba o resultado final esperado.

---

## 2. Estruturas Condicionais (`if/else`, `switch`)

### Fácil (10 exercícios)

1. Dado um número inteiro, verifique com `if/else` se ele é positivo ou negativo.
2. Crie uma condição que verifique se uma idade é maior ou igual a 18 e exiba `Maior de idade`.
3. Dado um número inteiro, verifique se ele é par ou ímpar utilizando o operador de resto (`%`).
4. Escreva uma estrutura `if/else` para comparar dois números inteiros e exibir qual é o maior.
5. Crie um operador ternário que defina se um aluno foi `Aprovado` ou `Reprovado` com base em uma nota mínima de 7.
6. Use `switch` para exibir o dia da semana correspondente aos números de 1 a 7.
7. Crie um `switch` que receba uma letra indicando o estado civil (`S`, `C`, `D`, `V`) e exiba a descrição.
8. Verifique se um número inteiro está no intervalo entre 10 e 50 (inclusive).
9. Dado o ano de nascimento, verifique se a pessoa pode votar (`idade >= 16`).
10. Verifique se uma variável booleana `isAluno` é verdadeira e exiba uma mensagem de acesso liberado.

### Complicado / Mediano (10 exercícios)

1. Escreva um programa que receba os três lados de um triângulo e determine se ele é Equilátero, Isósceles ou Escaleno (validando primeiro se os lados formam um triângulo válido).
2. Crie uma calculadora de imposto de renda progressivo com base em faixas salariais atreladas a diferentes alíquotas (0%, 7,5%, 15%, 22,5%, 27,5%).
3. Escreva um algoritmo para determinar se um determinado ano informado é bissexto, respeitando as regras do calendário gregoriano: divisível por 4, exceto centenários não divisíveis por 400.
4. Crie um menu interativo utilizando `switch` com expressões complexas ou `fall-through` proposital para mapear dias úteis vs. fins de semana.
5. Desenvolva um sistema de classificação de atletas por faixa etária: Infantil A (5-7), Infantil B (8-10), Juvenil A (11-13), Juvenil B (14-17) e Adulto (>= 18).
6. Crie um algoritmo para caixa eletrônico que determine a quantidade mínima de notas (R$ 100, R$ 50, R$ 20, R$ 10) necessárias para entregar um determinado valor sacado.
7. Escreva um programa que leia três números distintos e os exiba em ordem crescente utilizando apenas estruturas `if/else`.
8. Simule um sistema de verificação de login que valide usuário e senha separadamente, retornando mensagens de erro específicas para cada falha.
9. Implemente um cálculo de desconto em compras onde o desconto varia conforme o tipo do cliente (Comum, VIP, Funcionário) e o valor total gasto.
10. Crie um validador de datas simples que receba dia, mês e ano e informe se a data existe no calendário, atentando-se ao número de dias de cada mês e aos anos bissextos.

---

## 3. Estruturas de Repetição (`for`, `while`, `do-while`)

### Fácil (10 exercícios)

1. Imprima os números de 1 a 10 utilizando a estrutura `for`.
2. Imprima os números de 10 a 1 em ordem decrescente utilizando `while`.
3. Escreva um laço `for` que exiba a tabuada do número 5.
4. Calcule a soma de todos os números inteiros de 1 a 100 usando `for`.
5. Exiba todos os números pares entre 1 e 50.
6. Crie um laço `do-while` que execute pelo menos uma vez e exiba a mensagem `Executou do-while`.
7. Use um laço para imprimir os primeiros 10 múltiplos de 3.
8. Escreva um programa que conte quantas vezes um laço `while` roda até que uma variável contadora alcance 5.
9. Imprima os caracteres de `A` a `Z` usando um laço e incremento de variáveis do tipo `char`.
10. Some apenas os números ímpares entre 1 e 20 e exiba o resultado final.

### Complicado / Mediano (10 exercícios)

1. Escreva um programa para calcular o fatorial de um número inteiro fornecido utilizando `for`.
2. Gere os `n` primeiros termos da sequência de Fibonacci utilizando a estrutura de repetição de sua escolha.
3. Crie um algoritmo que verifique se um dado número inteiro é primo ou não.
4. Dado um valor total de um carro, simule a quantidade máxima de parcelas em que ele pode ser dividido mantendo o valor mínimo de cada parcela em R$ 1.000,00 (usando `break`).
5. Imprima todas as combinações possíveis de dois dados de 6 faces cuja soma resulte em 7.
6. Escreva um laço que percorra de 1 a 100 e utilize `continue` para pular a impressão de números divisíveis por 5.
7. Desenvolva um programa que inverta a ordem dos dígitos de um número inteiro (ex.: transformar 1234 em 4321) utilizando operações aritméticas em um laço `while`.
8. Crie um programa de adivinhação de números onde o laço continua pedindo palpites até acertar o número secreto, contando a quantidade de tentativas.
9. Calcule a média de uma quantidade indeterminada de números fornecidos até que o valor `-1` seja digitado como sinalizador de parada.
10. Imprima uma pirâmide de asteriscos no console de `n` linhas utilizando laços de repetição aninhados.

---

## 4. Arrays e Arrays Multidimensionais

### Fácil (10 exercícios)

1. Declare um array de inteiros de 5 posições, atribua valores e imprima todos os elementos com `for`.
2. Crie um array do tipo `String` com 4 nomes de cidades e exiba o terceiro elemento.
3. Percorra um array de inteiros usando a estrutura `for-each` e exiba cada elemento.
4. Encontre e exiba o tamanho de um array utilizando a propriedade `.length`.
5. Calcule a soma de todos os elementos contidos em um array numérico de 6 posições.
6. Crie uma matriz 2x2 de inteiros, inicialize seus valores manualmente e exiba-os.
7. Altere o valor do primeiro elemento de um array pré-existente e exiba o novo valor.
8. Crie um array de `double` com 3 notas e exiba a média aritmética dessas notas.
9. Percorra um array e conte quantos números contidos nele são negativos.
10. Declare e inicialize um array usando a sintaxe direta `{1, 2, 3, 4, 5}` e exiba o último elemento.

### Complicado / Mediano (10 exercícios)

1. Escreva um programa que encontre o maior e o menor valor armazenados dentro de um array de inteiros.
2. Escreva um código para inverter a ordem dos elementos de um array sem criar outro array auxiliar.
3. Copie os elementos de um array para outro array em ordem inversa.
4. Crie um programa que identifique e remova elementos duplicados em um array (ou gere um novo array contendo apenas valores únicos).
5. Escreva um algoritmo de ordenação simples, como Bubble Sort, para ordenar um array de inteiros em ordem crescente.
6. Crie uma matriz 3x3 e calcule a soma de todos os elementos localizados na diagonal principal.
7. Desenvolva um programa que realize a transposição de uma matriz `M x N` para `N x M`.
8. Crie uma matriz irregular (array de arrays com tamanhos de colunas diferentes) para armazenar dados de turmas com números distintos de alunos e exiba suas notas.
9. Dado um array de inteiros, busque a posição (índice) de um elemento específico. Se não for encontrado, exiba `-1`.
10. Some duas matrizes de mesmo tamanho `3 x 3` e armazene o resultado em uma terceira matriz.

---

## 5. Orientação a Objetos: Classes, Atributos e Métodos

### Fácil (10 exercícios)

1. Crie uma classe `Pessoa` com os atributos `nome`, `idade` e `sexo`.
2. Instancie um objeto da classe `Pessoa` na classe principal e atribua valores aos seus atributos.
3. Crie uma classe `Carro` com os atributos `modelo`, `marca` e `ano`.
4. Adicione um método `imprime()` na classe `Carro` para exibir seus dados no console.
5. Crie uma classe `Calculadora` com um método `soma(int num1, int num2)` que retorne o resultado da soma.
6. Adicione um método na classe `Calculadora` que receba dois números e retorne o maior deles.
7. Crie uma classe `Estudante` e adicione um método que exiba uma mensagem de boas-vindas contendo o nome do estudante.
8. Crie uma classe `ContaBancaria` com o atributo `saldo` do tipo `double`.
9. Crie um método `depositar(double valor)` na classe `ContaBancaria` que adicione o valor ao saldo.
10. Crie um método `sacar(double valor)` na classe `ContaBancaria` que subtraia o valor do saldo.

### Complicado / Mediano (10 exercícios)

1. Crie uma classe `Funcionario` com os atributos `nome`, `idade` e um array de `salarios`. Adicione um método para imprimir os dados e calcular a média salarial.
2. Implemente a validação no método `sacar` da classe `ContaBancaria`: o saque só deve ocorrer se o saldo for suficiente, exibindo mensagem de erro caso contrário.
3. Crie uma classe `ImpressoraDeRelatorio` que receba como parâmetro de um método um objeto da classe `Funcionario` e imprima a ficha completa do funcionário.
4. Crie uma classe `Retangulo` com atributos `largura` e `altura`. Adicione métodos para calcular a área e o perímetro do retângulo.
5. Crie uma classe `Termometro` que armazene a temperatura atual em Celsius e forneça métodos para retornar essa temperatura convertida para Fahrenheit e Kelvin.
6. Crie uma classe `Livro` com `titulo`, `autor` e um atributo boolean `impresso`. Crie métodos para emprestar e devolver o livro mudando seu estado.
7. Simule um sistema de transferência bancária adicionando um método `transferir(ContaBancaria destino, double valor)` na classe `ContaBancaria`.
8. Crie uma classe `Aluno` que possua um array com 4 notas. Escreva um método que retorne se o aluno foi aprovado (`média >= 7.0`).
9. Crie uma classe `Produto` com atributos `nome`, `preco` e `quantidadeEmEstoque`. Crie métodos para dar entrada e saída no estoque.
10. Implemente uma classe `Agenda` que contenha um array de objetos do tipo `Contato` e métodos para adicionar e listar todos os contatos salvos.

---

## 6. Orientação a Objetos: Sobrecarga de Métodos e Construtores

### Fácil (10 exercícios)

1. Crie um construtor padrão (sem parâmetros) para uma classe `Filme`.
2. Crie um construtor com parâmetros para a classe `Filme` que inicialize os atributos `nome` e `duracao`.
3. Escreva dois métodos `imprime()` sobrecarregados na mesma classe: um sem parâmetros e outro que aceite um caractere delimitador.
4. Crie uma classe `Anime` e adicione dois construtores: um que recebe apenas o nome e outro que recebe nome e tipo.
5. Crie uma classe `Quadrado` com construtor que receba apenas a medida do lado.
6. Sobrecarregue o método `calcular` de uma classe para aceitar dois parâmetros inteiros ou dois parâmetros do tipo `double`.
7. Crie uma classe `Usuario` com construtor inicializando `login` e `senha`.
8. Demonstre o encadeamento de construtores utilizando a palavra reservada `this(...)` dentro de uma classe.
9. Crie uma classe `Pessoa` cujo construtor exiba uma mensagem no console sempre que um novo objeto for instanciado.
10. Crie um construtor para a classe `Produto` que receba `nome`, `preco` e defina por padrão a quantidade inicial como `0`.

### Complicado / Mediano (10 exercícios)

1. Crie uma classe `Jogador` com construtores encadeados usando `this(...)` para lidar com múltiplos cenários de criação (ex.: apenas nome; nome + posição; nome + posição + número da camisa).
2. Implemente a sobrecarga de um método `buscar` em uma classe `Biblioteca` para pesquisar por `id` (inteiro), por `titulo` (`String`) ou por `autor` e `ano`.
3. Crie uma classe `Data` com três construtores: um sem parâmetros (data padrão `01/01/2000`), um com dia/mês/ano inteiros e um com a data em formato de texto `DD/MM/AAAA`.
4. Escreva uma classe `Pedido` com atributos `id`, `itens` (array) e `status`. Garanta, via construtores, que nenhum pedido possa ser criado sem um `id` e ao menos 1 item inicial.
5. Crie uma classe `NaveEspacial` com atributos de velocidade e capacidade. Sobrecarregue um método `acelerar` para aumentar a velocidade com ou sem um fator de impulso informado.
6. Implemente uma classe `ConversorMoeda` com métodos sobrecarregados `converter` para transformar Real em Dólar, Euro ou Libra com base nos tipos de parâmetros passados.
7. Crie uma classe `Caixa` com construtores sobrecarregados para criar uma caixa cúbica (passando 1 lado) ou retangular (passando largura, altura e profundidade).
8. Desenvolva uma classe `MatematicaUtil` que contenha versões sobrecarregadas de um método `somar` capazes de somar arrays inteiros, arrays `double` ou listas variáveis de números.
9. Crie uma classe `Cliente` com construtor que exija a passagem do CPF e valide a presença do atributo no ato de criação da instância.
10. Crie uma classe `Curso` contendo construtores sobrecarregados que aceitem a adição direta de um array de módulos na inicialização do objeto.

---

## 7. Modificadores de Acesso e Modificador `static`

### Fácil (10 exercícios)

1. Modifique os atributos de uma classe `Pessoa` para `private` e crie seus respectivos métodos `getters` e `setters`.
2. Crie uma classe com um atributo `static` chamado `contador` para contar quantas instâncias dessa classe foram criadas.
3. Crie um método `static` em uma classe utilitária que imprima uma mensagem simples sem precisar instanciar o objeto.
4. Crie o `getter` e o `setter` para o atributo `private double saldo` da classe `ContaBancaria`.
5. Tente acessar um atributo `private` de uma classe diretamente a partir de outra classe e observe o erro de compilação.
6. Declare uma constante `public static final double PI = 3.14159;` e acesse-a na classe principal.
7. Escreva um método `static` que receba um número e retorne o seu quadrado.
8. Crie uma classe `Carro` com o atributo `private String marca` e use o método `setMarca` com validação para impedir nomes vazios.
9. Crie um bloco de inicialização estático (`static { ... }`) que exiba uma mensagem quando a classe for carregada pela JVM.
10. Crie um atributo estático `nomeEmpresa` em uma classe `Funcionario` e altere o valor desse atributo para afetar todas as instâncias.

### Complicado / Mediano (10 exercícios)

1. Crie uma classe `UtilitarioData` contendo apenas métodos estáticos para validação e formatação de datas, garantindo que não precise ser instanciada.
2. Implemente o padrão de encapsulamento rigoroso em uma classe `Funcionario`: garanta que alterações de salário via `setSalario` aceitem apenas aumentos e nunca reduções.
3. Crie uma classe `Configuracao` usando atributos e métodos estáticos juntamente com um bloco de inicialização estático para carregar configurações padrão na memória.
4. Crie uma classe `Cliente` onde o atributo `id` seja gerado automaticamente de forma sequencial utilizando um contador interno `private static int proximoId`.
5. Implemente um controle estático de limite de instâncias: restrinja a classe para permitir a criação de no máximo 3 objetos ativos.
6. Crie uma classe `ConversorUnidades` com constantes estáticas (`public static final`) para taxas de conversão de distância (milhas para km, pés para metros, etc.).
7. Escreva uma classe `Banco` com um atributo estático `taxaDeJurosPadrao`. Adicione um método estático para alterar essa taxa e demonstre como a mudança afeta o cálculo do rendimento de todas as contas associadas.
8. Crie um sistema de login onde uma classe `SessaoUsuario` mantenha em um atributo estático privado o usuário atualmente autenticado no sistema.
9. Demonstre a diferença de comportamento entre um bloco de inicialização de instância e um bloco de inicialização estático criando múltiplos objetos da mesma classe.
10. Crie uma classe `ValidadorCPF` com métodos utilitários estáticos para verificar o formato e a estrutura matemática de um CPF fornecido como `String`.

---

## Observação

Este material pode ser usado como guia de estudo para reforçar os conceitos básicos de Java, bem como para praticar lógica de programação, manipulação de estruturas de controle e desenvolvimento orientado a objetos.
