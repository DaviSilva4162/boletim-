package tstart;

import java.util.Scanner;
import  java.util.Arrays;
import java.util.Locale;

public class Tst {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in) .useLocale(Locale.forLanguageTag("pt-BR"));
        
           

        double[] notas = new double[5];

        media(notas, teclado, 0);
    } 


    
    // Método que recebe os valores e realiza as operações aritméticas. 
    // Dentro dela estão todos os outros métodos
    public static double media(double[] notas, Scanner teclado, double soma) {


    // Laço que irá percorrer o array, e preenchendo cada posição com a média!  
    for (int contador = 0; contador < notas.length; contador++) {

       //INICIO DO CÓDIGO PARA SOLICITAR O NOME.
        System.out.println("Digite seu nome!");
        // Recebe o nome do usuário, na varíavel nome, do tipo String
        String nome = teclado.nextLine() .trim();
        //Função para garantir que oque foi inserido em String, são caracteres /ou não foi inserido nada.
         if (nome.isEmpty()) {              
             while(nome.isEmpty()){
               System.out.println("Campo não preenchido, digite seu nome, apenas Caracteres");
               nome = teclado.nextLine() .trim();
             }
        }
           if ((!nome.isEmpty() && nome.matches("[\\p{L} ]+")) == false){
            while((!nome.isEmpty() && nome.matches("[\\p{L} ]+")) == false) {
                 System.out.println("Entrada invalida! Digite Caracteres.");
                 nome = teclado.nextLine() .trim(); 
            }
                 if(nome.isEmpty()){
                    while(nome.isEmpty()){
                     System.out.println("Campo não preenchido, digite seu nome!");
                     nome = teclado.nextLine() .trim();
                 }
                }
            }
      //FINAL 
            

      
        // INICIO DO CÓDIGO QUE IRÁ SOLICITAR A 1(PRIMEIRA) NOTA
          double n1;
            while (true) {
            System.out.println("Digite a primeira nota!:");
            String entrada = teclado.nextLine().trim();

            if (entrada.isEmpty()) {
            System.out.println("O campo não pode estar vazio!");
        continue;
    }


    try {
        n1 = Double.parseDouble(entrada.replace(',', '.'));
          if (n1 < 0 || n1 > 10 ){
          System.out.println("Digite um valor de 0 a 10!");
          continue;
      }
        break;
    } catch (NumberFormatException erro) {
        System.out.println("Entrada inválida! Digite um número.");
    }
}
 //FINAL 
        
  

 
        // INICIO DO CÓDIGO QUE IRÁ SOLICITAR A 2(SEGUNDA) NOTA
             double n2;
               while (true) {
              System.out.println("Digite a segunda nota:");
              String entrada = teclado.nextLine().trim();

           if (entrada.isEmpty()) {
             System.out.println("O campo não estar  vazio!");
             continue;
    }

    try {
        n2 = Double.parseDouble(entrada.replace(',', '.'));
         if (n2 < 0 || n2 > 10 ){
          System.out.println("Digite um valor de 0 a 10!");
          continue;
      }
        break;
    } catch (NumberFormatException erro) {
        System.out.println("Entrada inválida! Digite um número.");
    }
}
        //FINAL


        //Divide a soma da primeira e segunda nota e divide por 2!
        double mediaAluno = (n1 + n2) / 2;

        //Adiciona o valor de media aluano, a cada indice do array, a cada repetição do laço
        notas[contador] = mediaAluno;

        //Argurmento para o RETURN
        soma += mediaAluno;  


        //Exibe a média do aluno a cada volta do laço
         System.out.printf("Média de %s: %.2f%n", nome, mediaAluno);
        //Método que irá verificar se a média está dentro dos parametros esperados.
        aprovacao(mediaAluno);
    }


    //ABAIXO ESTÃO OS CÓDIGOS QUE SERÃO EXECUTADOS, APÓS AS 5 VOLTAS DO LAÇO


    // Váriavel que ira calcular a média geral da turma
    double MediaGeral = soma/5;

    //Exibe todos os valores do array
    System.out.printf("Notas da Turma   " + Arrays.toString(notas) + "\n");
    
    // Metodo que irá identificar a menor e maior nota do Array
    maiormenor(notas, 0, soma, soma); 

    //Irá exibir a média geral da turma.
    System.out.printf("A média geral da turma foi: %.2f%n", MediaGeral);
    return soma;   
}
    

//Método utilizado para identicar qual o menor/maior valor do array Notas!
    public static void maiormenor( double[] notas,
        int contador, double maior, double menor) {

    maior = notas[0];
    menor = notas[0];

    for (contador = 1; contador < notas.length; contador++) {

        if (notas[contador] > maior) {
            maior = notas[contador];
        }

        if (notas[contador] < menor) {
            menor = notas[contador];
        }
    }

    System.out.printf("Maior nota é %.2f%n  ", maior);
    System.out.printf("Menor nota é %.2f%n  ", menor);
}




/*
 Método utilizado para identicar se a soma das duas notas recebidas, divididas por 2. Está dentro 
 dos valores de média esperado.
*/
    public static void aprovacao(double soma){

      if (soma >= 5){
        System.out.println("Aprovado");
      }else{
        if (soma >= 4.5 && soma < 5.0){
          System.out.println("Em recuperação!");
        }else{
          if (soma < 4.5){
            System.out.println("Reprovado!");
          }
        }
      }

    }

}

                try {
                    n1 = Double.parseDouble(entrada.replace(',', '.'));

                    if (n1 < 0 || n1 > 10) {
                        System.out.println("Digite um valor de 0 a 10!");
                        continue;
                    }

                    break;
                } catch (NumberFormatException erro) {
                    System.out.println("Entrada inválida! Digite um número.");
                }
            }
            // FINAL

            // INICIO DO CÓDIGO QUE IRÁ SOLICITAR A 2(SEGUNDA) NOTA
            double n2;

            while (true) {
                System.out.println("Digite a segunda nota:");
                String entrada = teclado.nextLine().trim();

                if (entrada.isEmpty()) {
                    System.out.println("O campo não estar  vazio!");
                    continue;
                }

                try {
                    n2 = Double.parseDouble(entrada.replace(',', '.'));

                    if (n2 < 0 || n2 > 10) {
                        System.out.println("Digite um valor de 0 a 10!");
                        continue;
                    }

                    break;
                } catch (NumberFormatException erro) {
                    System.out.println("Entrada inválida! Digite um número.");
                }
            }
            // FINAL

            // Divide a soma da primeira e segunda nota e divide por 2!
            double mediaAluno = (n1 + n2) / 2;

            // Adiciona o valor de media aluano, a cada indice do array, a cada repetição do laço
            notas[contador] = mediaAluno;

            // Argurmento para o RETURN
            soma += mediaAluno;

            // Exibe a média do aluno a cada volta do laço
            System.out.printf("Média de %s: %.2f%n", nome, mediaAluno);

            // Método que irá verificar se a média está dentro dos parametros esperados.
            aprovacao(mediaAluno);
        }

        // ABAIXO ESTÃO OS CÓDIGOS QUE SERÃO EXECUTADOS, APÓS AS 5 VOLTAS DO LAÇO

        // Exibe todos os valores do array
        System.out.printf("Notas da Turma \n " + Arrays.toString(notas));

        // Metodo que irá identificar a menor e maior nota do Array
        maiormenor(notas, 0, soma, soma);

        return soma;
    }

    // Método utilizado para identicar qual o menor/maior valor do array Notas!
    public static void maiormenor(double[] notas, int contador, double maior, double menor) {
        maior = notas[0];
        menor = notas[0];

        for (contador = 1; contador < notas.length; contador++) {
            if (notas[contador] > maior) {
                maior = notas[contador];
            }

            if (notas[contador] < menor) {
                menor = notas[contador];
            }
        }

        System.out.printf("Maior nota é %.2f%n", maior);
        System.out.printf("Menor nota é %.2f%n", menor);
    }

    /*
     Método utilizado para identicar se a soma das duas notas recebidas, divididas por 2. Está dentro
     dos valores de média esperado.
    */
    public static void aprovacao(double soma) {
        if (soma >= 5) {
            System.out.println("Aprovado");
        } else {
            if (soma >= 4.5 && soma < 5.0) {
                System.out.println("Em recuperação!");
            } else {
                if (soma < 4.5) {
                    System.out.println("Reprovado!");
                }
            }
        }
    }
}


 

