/*Ex 6. 6. Ler uma temperatura em graus Celsius e apresent�-la convertida 
 * em graus Fahrenheit. A f�rmula de
convers�o �:
F = (9 * C + 160) / 5*/

import java.util.Scanner;

public class atividade06 {
	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
	
		System.out.println("Informe a temperatura em Celsius : "); 
		int temp = dados.nextInt();
	
	
		int soma  = (9 * temp + 160) / 5 ;
		
		System.out.println("A temperatura convertida para Fahrenheit �:" + soma);
		
		
	}
}
