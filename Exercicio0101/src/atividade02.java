/*Ex 2. Escreva um algoritmo que leia dois números digitados 
 * pelo usuário e exiba o resultado da sua soma.*/

import java.util.Scanner;

public class atividade02 {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		
		
		System.out.println("Informe um numero: "); 
		double numero1 = dados.nextDouble();
		System.out.println("Informe mais um: ");
		double numero2 = dados.nextDouble();
		
		double soma = numero1 + numero2;
		System.out.println("A soma dos numeros são:" + soma);
	
	}

}
