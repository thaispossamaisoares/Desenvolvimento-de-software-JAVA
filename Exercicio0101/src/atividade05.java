/*Ex 5. Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que 
 * o valor da variável A passe a ser
o valor da variável B e o valor da variável B passe a ser o valor da variável A. 
Apresentar uma mensagem com o
valor original de cada variável e outra com os valores trocados.*/

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
		
		System.out.println("A AGORA É:" + numeroC);
		System.out.println("B AGORA É:" + numeroB);
		
	}
}



