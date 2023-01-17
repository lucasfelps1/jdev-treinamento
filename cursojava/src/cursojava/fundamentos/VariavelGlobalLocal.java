package cursojava.fundamentos;

public class VariavelGlobalLocal {
	
	/* Variavel Global � acessivel a todos e o seu valor � compartilhado*/
	static int maiorIdadeGlobal = 30;
	
	public static void main(TipoStrings[] args) {
		
		/* Variavel local porque pertence somente a esse m�todo e o valor fica no m�todo*/
		int maiorIdade = 18; 
		System.out.println("Valor variavel local = " + maiorIdade);
		System.out.println("Valor variavel global = " + maiorIdadeGlobal);
		metodo2();
		
	}
	
	public static void metodo2() {
		
		System.out.println("Valor da vari�vel Global = " + maiorIdadeGlobal);
		
		
	}

}
