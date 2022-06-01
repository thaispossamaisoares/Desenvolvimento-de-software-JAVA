import java.util.Scanner;

/*Ex 3. Escreva um algoritmo que leia os valores de dois números inteiros 
 * distintos nas variáveis A e B e informe
qual deles é o maior. Caso os números sejam iguais informar ao 
usuário que a sequência de números informados é
inválida.
 * 
 * */


public class atividade03 {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Informe um numero a: "); 
		int numero1 = dados.nextInt();
		System.out.println("Informe um numero b: ");
		int numero2 = dados.nextInt();
		
		if(numero1 > numero2){
			System.out.println("O numero A:"+numero1+ " é maio que o B:" +numero2 );
		}else {
			if(numero1 < numero2){
				System.out.println("O numero B:"+numero2+ " é maio que o A:" +numero1 );
			}else {
				if(numero1 == numero2){
					System.out.println("O numero B:"+numero2+ " e A: "+numero1+" sao iguais"  );
				}
			}
		}
		
	

	}

}
