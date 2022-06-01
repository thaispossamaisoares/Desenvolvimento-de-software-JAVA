/*
 * Ex 4. Escreva um algoritmo que leia dois números e ao final mostre a soma, 
 * subtração, multiplicação e a divisão
dos números lidos.
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
		System.out.println("A soma dos numeros são:" + soma);
		
		double subtracao = numero1 - numero2;
		System.out.println("A soma dos numeros são:" + subtracao);
		
		double multiplicacao = numero1 * numero2;
		System.out.println("A soma dos numeros são:" + multiplicacao);
		
		double divisao = numero1 / numero2;
		System.out.println("A soma dos numeros são:" + divisao);
		
	}
	
}
