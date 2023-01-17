package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		
		/* new Aluno() é uma instancia (Criação de objeto) */
		/* aluno1 é uma referncia para o objeto Aluno*/
		
		
		/*
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno?");
		String RG = JOptionPane.showInputDialog("Qual o RG do aluno?");
		String CPF = JOptionPane.showInputDialog("Qual o CPF do aluno?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da mae do aluno?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai do aluno?");
		String DataMatricula = JOptionPane.showInputDialog("Qual a data de matricula do aluno?");
		String SerieMatriculado = JOptionPane.showInputDialog("Qual a serie do aluno?");
		String nomeEscola = JOptionPane.showInputDialog("Qual a escola do aluno?");
		
		String nota1 = JOptionPane.showInputDialog("Nota 1: ");
		String nota2 = JOptionPane.showInputDialog("Nota 2: ");
		String nota3 = JOptionPane.showInputDialog("Nota 3: ");
		String nota4 = JOptionPane.showInputDialog("Nota 4: ");
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(RG);
		aluno1.setNumeroCpf(CPF);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(DataMatricula);
		aluno1.setSerieMatriculado(SerieMatriculado);
		aluno1.setNomeEscola(nomeEscola);
		
		aluno1.setNota1(Double.valueOf(nota1));
		aluno1.setNota2(Double.valueOf(nota2));
		aluno1.setNota3(Double.valueOf(nota3));
		aluno1.setNota4(Double.valueOf(nota4));
		
		System.out.println("O aluno " + aluno1.getNome() + " ficou com a media " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Restulado 2 = " + aluno1.getAlunoAprovado2()); */
		
		Aluno aluno = new Aluno();
		System.out.println(aluno.toString()); /* Descrição do objeto na memoria */
		
		Aluno aluno2 = new Aluno();
		System.out.println(aluno2.toString()); /* Descrição do objeto na memoria */
		

		
	
		
	}
	
}
