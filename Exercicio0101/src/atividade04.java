/*
 * Ex 4. Escreva um algoritmo que leia dois n�meros e ao final mostre a soma, 
 * subtra��o, multiplica��o e a divis�o
dos n�meros lidos.
*/

import java.util.Scanner;

public class atividade04 {

	
	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Informe um numero: "); 
		double numero1 = dados.nextDouble();
		System.out.println("Informe mais um: ");
		double numero2 = dados.nextDouble();
		
		double soma = numero1 + numero2;
		System.out.println("A soma dos numeros s�o:" + soma);
		
		double subtracao = numero1 - numero2;
		System.out.println("A soma dos numeros s�o:" + subtracao);
		
		double multiplicacao = numero1 * numero2;
		System.out.println("A soma dos numeros s�o:" + multiplicacao);
		
		double divisao = numero1 / numero2;
		System.out.println("A soma dos numeros s�o:" + divisao);
		
	}
	
}
