import java.util.Scanner;

public class projeteFuncoes {
	public static void imprimir (String retorna) {
		System.out.println(retorna);
	}
	
	public static double soma(double a, double b) {
		double valor = a + b;
		return valor;
	}
	
	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		String letra = "h";
		imprimir(letra);
		
		double valor1 = 100;
		double valor2 = 100;
		double resultado = soma(valor1, valor2);
		
		
//		metodo != funcao (cobrar)
//		Fun��o: Parte de um programa ou classe que retorna um valor (. NET); 
//		M�todo: Procedimento ou fun��o pertencente a uma classe (v�rias linguagens de programa��o definem desta forma, por exemplo, c#)
	}

}


