# Calculadora de Médias em Java

Projeto de estudos desenvolvido em Java para calcular as médias de cinco alunos pelo terminal, informar a situação de aprovação e identificar a maior e a menor média da turma.

## Funcionalidades

- Solicitar e validar o nome de cada aluno.
- Receber duas notas por aluno.
- Verificar se as notas estão entre 0 e 10.
- Aceitar notas com vírgula ou ponto decimal.
- Solicitar novamente a entrada quando houver campos vazios ou valores inválidos.
- Calcular e armazenar as médias em um array.
- Informar se o aluno foi aprovado, ficou em recuperação ou foi reprovado.
- Exibir as médias da turma e identificar a maior e a menor.

## Regras de avaliação

A média é calculada pela fórmula:

Média = (primeira nota + segunda nota) / 2

| Média | Situação |
|---|---|
| Maior ou igual a 5,0 | Aprovado |
| Maior ou igual a 4,5 e menor que 5,0 | Em recuperação |
| Menor que 4,5 | Reprovado |

## Tecnologias utilizadas

- Java.
- Scanner para leitura de dados.
- Arrays para armazenamento das médias.

## Como executar

É necessário ter o JDK instalado e os comandos `javac` e `java` disponíveis no terminal.

Na pasta que contém o arquivo `Tst.java`, execute:

```bash
javac -encoding UTF-8 -d out Tst.java
java -cp out tstart.Tst
```

Depois, siga as instruções exibidas no terminal.

## Conhecimentos praticados

- Variáveis e tipos de dados.
- Operadores aritméticos e lógicos.
- Condicionais `if` e `else`.
- Laços `for` e `while`.
- Controle de repetição com `break` e `continue`.
- Arrays e acesso por índice.
- Criação e chamada de métodos.
- Manipulação de strings.
- Conversão de texto para números.
- Tratamento de exceções com `try/catch`.

## Próximas melhorias

- Criar métodos para reaproveitar a validação das notas.
- Permitir escolher a quantidade de alunos.
- Associar o nome de cada aluno à sua média.
- Calcular a média geral da turma.

## Autor

Desenvolvido por Davi como parte dos estudos de fundamentos de Java.
