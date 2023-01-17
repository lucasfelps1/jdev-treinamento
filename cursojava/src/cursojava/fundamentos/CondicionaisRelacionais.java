package cursojava.fundamentos;

public class CondicionaisRelacionais {
	
	public static void main(String[] args) {
		
		int nota1 = 90;
		int nota2 = 70;
		int nota3 = 10;
		int nota4 = 60;

		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/* Operações lógicas aninhadas: São operações dentro de operações*/
		
		if (media >= 50 ) {
			
			if (media >= 70) {
				
				if (media >= 90) {
					System.out.println("Aluno aprovado direto! " + media);
				} else {
					System.out.println("Aluno esta aprovado direto!" + media);
				}
						
				System.out.println("Aluno está aprovado! " + media);
				
			} else {
				System.out.println("Aluno está em recuperação! " + media);
				
			}
			
		} else {
			System.out.println("Aluno reprovado direto! " + media);
			
		}
		
	}
	
}
