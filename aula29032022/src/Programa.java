
public class Programa {
	public static void main(String[] args) {
		
		/*//tipos primitivos
		int numero = 100;
		
		//Classe -> variavel � um objeto.
		String texto = "S� sei que nada sei: (S�creates)";
		
		int comprimento = texto.length(); // le tamanho
		System.out.println("O comprimento �: " + comprimento);
		
		String bubtexto = texto.substring(4, 9); // pula casinhas e pega oque pedi
		System.out.println("O sub retornou: " + bubtexto);
		
		char caractere = texto.charAt(9);
		System.out.println("Char: " + caractere);//letrinha unica na posi��o
		
		
		// impime letra por letra
		String texto = "S� sei que nada sei: (S�creates)";
		for(int i=0; i<texto.length() ; i++) {
			char caractere = texto.charAt(i);
			System.out.println("Char: " + caractere);
			
			//simplificado System.out.println(texto.charAt(i));

		}
		
		String[] palavras = texto.split(" "); // quebra por vazio (caracter dentro) 
		for(String plv : palavras) {
			System.out.println(plv);
		}
		
		String textoHifen = texto.replace(" ", " - "); //troca um pelo outro (vazio por hifen)
		System.out.println(textoHifen);
		
		*/
		String texto = "S� sei que nada sei: (S�creates)";
		String textoTab = texto.replace(" ", "-"); // quebra linha \t
		System.out.println(textoTab);
		String[] palavrasTab = textoTab.split("\t");
		for(String pll : palavrasTab) {
			System.out.println(pll);
		}
		
		
		
	}

}
