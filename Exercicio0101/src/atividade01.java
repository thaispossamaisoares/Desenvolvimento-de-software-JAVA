	/*Ex 1. Escreva um algoritmo que leia um n�mero digitado pelo usu�rio e
	mostre a mensagem �N�mero maior do
		que 10! �, caso este n�mero seja maior, ou �N�mero menor ou 
		igual a 10! �, caso este n�mero seja menor ou igual.*/

	

import java.util.Scanner;

public class atividade01 {
	public static void main(String[] args) { //inicio metodo main 
		Scanner dados = new Scanner(System.in);
		
		
		System.out.println("Informe um numero: "); 
		int matricula = dados.nextInt();
		
		if(matricula >= 10){
			System.out.println("maior ou igual que 10!");
		}else {
			System.out.println("menor que 10!");
		
		}
		
	}
}
