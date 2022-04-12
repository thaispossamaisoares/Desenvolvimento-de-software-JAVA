public class exercicio01 {
	public static void imprimir(String txt) {
		int vlr = 100;
		System.out.println(txt);
	}
		public static double somar(double a, double b) {
			double valor = a + b;
			return valor;
		}
		public static void main(String[] args) {
			double valor1 = 100;
			double valor2 = 20;
			
			double resultado = somar(valor1, valor2);
			String texto = String.valueOf(resultado);
			imprimir(texto);
		}
}


/**
 * Tipo Primitivos
 * 
 * int
 * float
 * double
 * boolen
 * char
 * lang
 */
 