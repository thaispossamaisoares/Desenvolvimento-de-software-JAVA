/*Ex 7. Escreva um algoritmo que leia um n�mero e diga, atrav�s de uma mensagem, 
 * se este n�mero est� no
intervalo entre 100 e 200. Caso o n�mero esteja fora do intervalo o usu�rio tamb�m
 dever� ser informado.
*/

import java.util.Scanner;

public class atividade07 {
	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
	
		System.out.println("Informe um numero a: "); 
		int numero1 = dados.nextInt();
		
		
		if(numero1 >= 100 && numero1 <= 200){
			System.out.println("O numero esta entre 100 e 200: " + numero1);
		}else {
			System.out.println("O numero � menor que 100 ou maior que 200: " + numero1);
			
		}
		
	}
}
