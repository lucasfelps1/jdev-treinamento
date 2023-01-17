package cursojava.fundamentos;

import javax.swing.JOptionPane;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");                            
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");
		
		double carrosDouble = Double.parseDouble(carros);
		double pessoasDouble = Double.parseDouble(pessoas);
		
		int divisao = (int) (carrosDouble / pessoasDouble); // faz a conversão de double pra int
		
		double resto = carrosDouble % pessoasDouble;
		
		JOptionPane.showMessageDialog(null, "Divisao para pessoas deu" + divisao + " carros e sobrou " + resto + " carros.");
	}

}
