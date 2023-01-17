package cursojava.fundamentos;

public class IfElse {

	public static void main(String[] args) {

		int mediaAluno = 69;
		
		String nome = "Alex";

		if (mediaAluno >= 70 && nome.equals("Alex")) {
			System.out.println("Parabens você está aprovado");
		} else if (mediaAluno <= 70) {
			System.out.println("Parabens você está reprovado");
		} else {
			System.out.println("Aluno não encontrado");
		}

	}

}
