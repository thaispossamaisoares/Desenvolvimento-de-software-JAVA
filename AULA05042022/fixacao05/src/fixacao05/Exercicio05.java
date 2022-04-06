/*
1. Somar o valor total de todos os registros;
2. Somar o valor total de cada grupo;
3. Imprimir o valor total de cada grupo e de todos os registros.
*/

package fixacao05;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) throws FileNotFoundException {
		File arquivo = new File("C:\\Users\\Aluno\\Downloads\\grupos-tabulados\\grupos-tabulados.txt");
		Scanner leitor = new Scanner(arquivo);
		leitor.nextLine();
		
	
		double totalA = 0;
		double totalB = 0;
		double totalC = 0;
		double totalD = 0;
		double totalE = 0;
		double totalF = 0;
		double contaTudo = 0;
		
		while (leitor.hasNext()) {
			String linha = leitor.nextLine();
			String[] dados = linha.split("\t");
			String letra = dados[0];
			String nota = dados[1];
			double confere = Double.parseDouble(nota);
			
			if(letra.equals("A")) {
				totalA = totalA + confere;
			}
			if(letra.equals("B")) {
				totalB = totalB + confere;
			}
			if(letra.equals("C")) {
				totalC = totalC + confere;
			}
			if(letra.equals("D")) {
				totalD = totalD + confere;
			}
			if(letra.equals("E")) {
				totalE = totalE + confere;
			}
			if(letra.equals("F")) {
				totalF = totalF + confere;
			}
			
			contaTudo = totalF + totalE + totalD + totalC + totalB + totalA;
		}
		
		System.out.println("O TOTAL DE A É: "+totalA);
		System.out.println("O TOTAL DE B É: "+totalB);
		System.out.println("O TOTAL DE C É: "+totalC);
		System.out.println("O TOTAL DE D É: "+totalD);
		System.out.println("O TOTAL DE E É: "+totalE);
		System.out.println("O TOTAL DE F É: "+totalF);
		System.out.println("O TOTAL DE TUDO: "+contaTudo);
		

		leitor.close();
		
		 
	}
}
