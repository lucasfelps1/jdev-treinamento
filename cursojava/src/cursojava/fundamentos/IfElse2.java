package cursojava.fundamentos;

public class IfElse2 {

	public static void main(String[] args) {

		int nota1 = 90;
		int nota2 = 70;
		int nota3 = 10;
		int nota4 = 60;

		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		
		// Condições lógicas com IF e ELSE 
		if (media >= 70) {
			System.out.println("Aluno aprovado " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("Aluno em recuperação " + media);
		} else {
			System.out.println("Aluno reprovado " + media);
		}
		
		// Operadores ternários são para micro validações
		
		String saidaResultado = media >= 70 ? "Aprovado1" : (media >= 40 && media <= 69) ? "Recuperação1" : "Reprovado";
		
		System.out.println(saidaResultado);
		
		
		

	}

}
