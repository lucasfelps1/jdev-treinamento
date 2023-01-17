package cursojava.fundamentos;

public class OperadorTernario {

	public static void main(String[] args) {
		
		
		double media = 10;
		
		String saidaResultado = media >= 70 ? "Aluno Aprovado" : media >= 40 && media <= 69 ? "Aluno em recuperação" : "Reprovado";
		
		System.out.println(saidaResultado);
	}
	
}
