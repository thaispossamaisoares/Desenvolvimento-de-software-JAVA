/*Ex 5. Leia valores nas vari�veis A e B, e efetue a troca dos valores de forma que 
 * o valor da vari�vel A passe a ser
o valor da vari�vel B e o valor da vari�vel B passe a ser o valor da vari�vel A. 
Apresentar uma mensagem com o
valor original de cada vari�vel e outra com os valores trocados.*/

import java.util.Scanner;

public class atividade05 {
	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
	
		System.out.println("Informe A: "); 
		String numeroA = dados.nextLine();
		System.out.println("Informe B: ");
		String numeroB = dados.nextLine();
		
	
		String numeroC = numeroB;
	    numeroB = numeroA;
		numeroA = numeroB;
		
		System.out.println("A AGORA �:" + numeroC);
		System.out.println("B AGORA �:" + numeroB);
		
	}
}



