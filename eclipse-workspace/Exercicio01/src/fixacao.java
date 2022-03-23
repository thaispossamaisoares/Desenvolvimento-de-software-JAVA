/**
Exercício de fixação 4
Com base no exercício de fixação 3, o sistema deverá dizer se o aluno está aprovado
ou reprovado na disciplina, para isso considerar as seguintes informações:
▪ Os valores 0.05, 0.05, 0.2, 0.2 e 0.5 são, respectivamente, os pesos das notas que
deverão ser armazenadas em um vetor para cálculo da nota final;
▪ Para calcular a nota final do aluno utilizar a seguinte regra:
nFinal = (n1 * 0.05) + (n2 * 0.05) + (n3 * 0.2) + (n4 * 0.2) + (n5 * 0.5);
▪ Se a nota final for igual ou superior a 6 o programa deverá imprimir a informação
de que o aluno está aprovado, caso contrário de que está reprovado.
 * */
import java.util.Scanner;
public class fixacao {
	
	public static void main(String[] args) { //inicio metodo main 
		Scanner dados = new Scanner(System.in);

		double[] nota = new double[5];
		for(int i=0; i<5; i++) {
			System.out.println("Digite a nota" +(i+1)+ ":");
		    nota[i] = dados.nextDouble();
		    dados.nextLine();
		    
		}
		double nFinal = (nota[0] * 0.05) + (nota[1] * 0.05) + (nota[2] * 0.2) + (nota[3] * 0.2) + (nota[4] * 0.5);
		System.out.println(nFinal);
	}
}

//vetor 
//double[] nFinal= {0.05,  0.05 ,  0.2 ,  0.2 ,  0.5};
//double[] notas = new double[5];
//double notafinal = 0;
//		
//		
		
		
		
