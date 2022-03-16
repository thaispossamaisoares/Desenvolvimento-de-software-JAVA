/**
Exercício de fixação 2

▪ Transformar o programa do exercício 1 para um sistema que permita ler a
entrada de dados pelo usuário em um vetor durante execução;
▪ Permitir que o usuário informe, primeiro, os dados de 5 (cinco) alunos e depois
de capturados os dados, imprimir o relatório final com todos os dados:

Matrícula: xxxxx
Nome: xxxxx xxxxx
Aprovado: ( x ) Sim ( ) Não
Nota final: xxxxx
*/
import java.util.Scanner;
public class Programa { //inicio

	public static void main(String[] args) { //inicio metodo main 
		Scanner dados = new Scanner(System.in);
		
		String[] matriculas = new String[5];
		matriculas[0] = "123456";
		matriculas[1] = "1111111";
		matriculas[2] = "2222222";
		matriculas[3] = "33333333";
		matriculas[4] = "44444444";
		
		String[] nome = new String[5];
		nome[0] = "123456";
		nome[1] = "1111111";
		nome[2] = "2222222";
		nome[3] = "33333333";
		nome[4] = "44444444";
		
		int[] nota = new int[5];
		nota[0] = 2;
		nota[1] = 3;
		nota[2] = 4;
		nota[3] = 5;
		nota[4] = 6;
		
		for(int i =0; i<5; i++ ) { // roda dentro e mostra todos 
			System.out.println("mostre sua matricula: " + matriculas[i]); 
			System.out.println("mostre seu nome: " + nome[i]);
			System.out.println("mostre a nota: " + nota[i]);
			
			if(nota[i] >= 6 ) {
				String app = "Aprovado: ( x ) Sim (  ) Não";
				System.out.println("mostre a aprovação: " + app);
			}else {
				String app = "Aprovado: (  ) Sim ( x ) Não";
				System.out.println("mostre a aprovação: " + app);
			}
		}
		
		/** imprime a nota do aluno e matricula 0
		   System.out.println("matriculas " + matriculas[0]);
		   System.out.println("nome " + nome[0]);
		   System.out.println("mostre a nota: " + nota[0]);
		 */

	}//fim metodo main
	
}//fim
/*
String[] nomes = new String[5];
nomes[i] = dados.next();*/
