/*Exercício de fixação 2
▪ Transformar o programa do exercício 1 para um sistema que permita ler a
entrada de dados pelo usuário em um vetor durante execução;
▪ Permitir que o usuário informe, primeiro, os dados de 5 (cinco) alunos e depois
de capturados os dados, imprimir o relatório final com todos os dados:
Matrícula: xxxxx
Nome: xxxxx xxxxx
Aprovado: ( x ) Sim ( ) Não
Nota final: xxxxx*/

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) { 
        Scanner leitor = new Scanner(System.in);

          
            String[] matricula = new String[5];
            String[] nome      = new String[5];
            int[] nota01      = new int[5];
            int[] nota02      = new int[5];
            int[] soma      = new int[5];
  
   


            for(int i=0; i<5; i++){
                System.out.println("Informe seu nome");
                nome[i] = leitor.next();
                System.out.println("Informe a matricula");
                matricula[i] = leitor.next();
                System.out.println("Informe a nota 01");
                nota01[i] = leitor.nextInt();
                System.out.println("Informe a nota 02");
                nota02[i] = leitor.nextInt();
                
                
 

            }

            for(int i=0; i< soma.length; i++){

                System.out.println(matricula[i]); 
                System.out.println(nome[i]); 
                System.out.println(nota01[i]); 
                System.out.println(nota02[i]); 
                soma[i] =  (nota01[i] + nota02[i]) / 2;

                if(soma[i] >= 6){
                    System.out.println("Aprovado: ( x ) Sim (  ) Não");
                }else {
                    System.out.println("Aprovado: (  ) Sim ( x ) Não");
                }

            }



    }
}









































