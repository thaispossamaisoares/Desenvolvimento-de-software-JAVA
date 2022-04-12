import java.util.Scanner;

public class MyFirstClassProgrammer {
	    public static void main(String... args) {
            Scanner dados = new Scanner(System.in);
        /*
        Criar um programa para processar as seguintes informações de um aluno: 
        matrícula, nome , nota1, nota2 e se ele está aprovado ou reprovado;
         */
                String num;
                String nome;
                double nota1;
                double nota2;
               
                System.out.println("Digite sua matricula ");
                num = dados.nextLine();

                System.out.println("Digite seu nome ");
                nome = dados.nextLine();

                System.out.println("informa sua  nota 1Bimestre");
                nota1 = dados.nextInt();

                System.out.println("informa sua  nota 2Bimestre");
                nota2 = dados.nextInt();

                double soma = (nota1 + nota2) / 2;
                String resultado = soma <= 6 ? "(x)sim ( )não":"( )sim (x)não";
        

                System.out.println("matricula: " + num );
                System.out.println("Nome: " + nome);
                System.out.println("Nota 1° Bimestre: " + nota1);
                System.out.println("Nota 2° Bimestre: " + nota2);
                System.out.println("Resultado: " + resultado);
    }
}



    
      
    
