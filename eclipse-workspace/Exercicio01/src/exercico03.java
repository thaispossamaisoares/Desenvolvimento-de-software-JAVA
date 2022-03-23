
/**
Exercício de fixação 3

▪ Criar um programa para processar as seguintes informações de um aluno:
matrícula, nome , nota 1, nota 2, nota 3, nota 4 e nota 5;
▪ O sistema deverá ler as notas do aluno em um vetor e a entrada de dados
pelo usuário só poderá ser nos valores de 0 a 10;
▪ No final da execução imprimir o seguinte relatório:

Matrícula: xxxxx
Nome: xxxxx xxxxx
Nota (x) : xxxxx
Nota (y) : yyyyy
*/

import java.util.Scanner;
public class exercico03 { //inicio

	public static void main(String[] args) { //inicio metodo main 
		Scanner dados = new Scanner(System.in);
		
		String nome ="";
		String matricula ="";
		double[] nota = new double[5];
		double soma = 0;
		double media = 6;
		
		for(int i =0; i<2; i++){
			System.out.println("mostre sua matricula: ");
			 matricula = dados.nextLine();
		    System.out.println("Digite o nome n" +(i+1)+ ":");
		    nome = dados.nextLine();
		    System.out.println("Digite a nota" +(i+1)+ ":");
		    nota[i] = dados.nextDouble();
		    dados.nextLine();
		    soma = soma + nota[i];
		    
			  if(nota[i] > media){
				     System.out.println("O aluno(a) "+ nome +" possui nota "+ nota[i] +", maior que a media 6 => Aprovado");
				}else {
					  System.out.println("O aluno(a) "+ nome +" possui nota "+ nota[i] +", menor que a media 6 => Nao aprovado");
			 } 
		    
		}
		   

	    
	    
	    

		  
	
		

	}//fim metodo main
	
}//fim
