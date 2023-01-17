package cursojava.fundamentos;

public class For {

	public static void main(String[] args) {

		/*
		 * 
		 * for (int numero = 0; numero <= 10; numero++) {
		 * System.out.println("O numero atual é: " + numero);
		 * 
		 * }
		 * 
		 * for (int numero = 10; numero >= 0; numero--) {
		 * System.out.println("O numero atual é: " + numero);
		 * 
		 * }
		 */

		/*
		 * FOR COM BREAK
		 * 
		 * for (int numero = 0; numero <= 10; numero++) {
		 * 
		 * System.out.println(numero);
		 * 
		 * if (numero == 7) { System.out.println("Encontrei o numero 7!");
		 * System.out.println("Estou parando de executar!"); break; } }
		 */

		/*
		 * FOR COM CONTINUE
		 */

		for (int numero = 0; numero <= 10; numero++) {

			System.out.println(numero);

			if (numero == 3 || numero == 6 || numero == 9) {
				System.out.println("Encontrei o numero " + numero);
				continue;
			}
			
			System.out.println("Processando laço de repetição");
		}

	}

}
