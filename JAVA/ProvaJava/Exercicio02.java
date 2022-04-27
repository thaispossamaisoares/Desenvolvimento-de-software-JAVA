/*
Exercício de fixação 6
▪ Dado o arquivo de texto grupos-tabulados.txt, crie um programa para fazer
a leitura do arquivo e:
1. Somar o valor total de todos os registros;
2. Somar o valor total de cada grupo;
3. Imprimir o valor total de cada grupo e de todos os registros;
▪ Após a leitura e o processamento, grave um arquivo de texto com o nome
relatorio-de-grupos.txt com os dados consolidados.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
public class Exercicio02 {
    
    public static void main(String[ ] args) throws FileNotFoundException {
        File arquivo = new File("C:\\Users\\Aluno\\ProvaJava\\grupos-tabulados\\grupos-tabulados.txt");
        Scanner leitor = new Scanner(arquivo);

            int GrupoA = 0;
            int GrupoB = 0;
            int GrupoC = 0;
            int GrupoD = 0;
            int GrupoE = 0;
            int GrupoF = 0;

            while (leitor.hasNext()) {
                String linha = leitor.nextLine();
                String[] dadoslinha = linha.split("\t");
                switch(dadoslinha[0]){
                    case "A":
                        GrupoA += Double.parseDouble(dadoslinha[1]);
                        break;
                    case "B":
                        GrupoB += Double.parseDouble(dadoslinha[1]);
                        break;
                    case "C":
                        GrupoC += Double.parseDouble(dadoslinha[1]);
                        break;
                    case "D":
                        GrupoD += Double.parseDouble(dadoslinha[1]);
                        break;
                    case "E":
                        GrupoE += Double.parseDouble(dadoslinha[1]);
                        break;
                    case "F":
                        GrupoF += Double.parseDouble(dadoslinha[1]);
                        break;
                }
            }
            double valorTotal = (GrupoA + GrupoB + GrupoC +GrupoD + GrupoE + GrupoF);
            System.out.println(valorTotal);

            Formatter gravador = new Formatter("C:\\Users\\Aluno\\ProvaJava\\grupos-tabulados\\bia.txt");

            gravador.format("valor a: " + GrupoA);
            System.out.println("valor a " + GrupoA);

            gravador.format("valor b: " + GrupoB);
            System.out.println("valor b " +  GrupoB);

            gravador.format("valor c: " + GrupoC);
            System.out.println("valor c " +  GrupoC);

            gravador.format("valor d: " + GrupoD);
            System.out.println("valor d " +  GrupoD);

            gravador.format("valor e: " + GrupoE);
            System.out.println("valor e " +  GrupoE);

            gravador.format("valor f: " + GrupoF);
            System.out.println("valor f " + GrupoF);
            
            leitor.close();
            gravador.close();
           
    }
 
}



