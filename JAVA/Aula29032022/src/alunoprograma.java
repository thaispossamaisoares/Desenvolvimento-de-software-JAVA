import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

// ta junto com o arquivo aluno  (vetor)
public class alunoprograma { 
	public static void main(String[] args) throws FileNotFoundException {
		
		File arquivo = new File("C:\\Users\\Aluno\\eclipse-workspace\\aula29032022\\src\\ALUNOS.csv");
		Scanner leitor = new Scanner(arquivo);
		leitor.nextLine();
		
		aluno[] alunos = new aluno[5];
		int contador = 0;
		
		while(leitor.hasNext()) {
			String linha = leitor.nextLine();
			String[] dados = linha.split(";");
			String matricula = dados[0];
			String nome = dados[1];
			String nota1 = dados[2];
			String nota2 = dados[3];
			String nota3 = dados[4];
			
			aluno aluno = new aluno();
			aluno.matricula = matricula;
			aluno.nome = nome;
			aluno.nota1 = Double.parseDouble(nota1);
			aluno.nota2 = Double.parseDouble(nota2);
			aluno.nota3 = Double.parseDouble(nota3);
			
			
			alunos[contador] = aluno;
			contador++;
			
		}
		
		for (int i = 0; i < alunos.length; i++) {
			aluno a = alunos[i];
			System.out.println("matricula: " + a.matricula);
			System.out.println("nome: " + a.nome);
			System.out.println("nota1 " + a.nota1);
			System.out.println("nota2 " + a.nota2);
			System.out.println("nota3 " + a.nota3);
			System.out.println();
		}
		 leitor.close();
		 
		 /////////////////forma a cima é mais simples e usa o arquivo .csv//////////////////////////
		 
		 
		/*aluno aluno1 = new aluno();
		aluno1.matricula = "123546";
		aluno1.nome = "Joao";
		aluno1.nota1 = 7.8;
		aluno1.nota2 = 9.5;
		aluno1.nota3 = 8.0;
		
		aluno aluno2 = new aluno();
		aluno2.matricula = "556451552";
		aluno2.nome = "Carla";
		aluno2.nota1 = 6.8;
		aluno2.nota2 = 9.9;
		aluno2.nota3 = 8.9;
		
		aluno aluno3 = new aluno();
		aluno3.matricula = "55555969";
		aluno3.nome = "Ana";
		aluno3.nota1 = 6.8;
		aluno3.nota2 = 5.5;
		aluno3.nota3 = 9.0;
		
		// outra maneira de vetor 
		aluno[] alunos = new aluno[2];
		alunos[0] = aluno1;
		alunos[1] = aluno2;
		
		// com o for ele chama
		for (int i = 0; i < alunos.length; i++) {
			aluno a = alunos[i];
			System.out.println("matricula" + a.matricula);
			System.out.println("nome: " + a.nome);
			System.out.println("nota1 " + a.nota1);
			System.out.println("nota2 " + a.nota2);
			System.out.println("nota3 " + a.nota3);
			System.out.println();
		}*/
		
	}
}
