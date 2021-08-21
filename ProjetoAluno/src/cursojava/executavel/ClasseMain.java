package cursojava.executavel;

import cursojava.classes.Aluno;

public class ClasseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*New Aluno() é uma instancia (Criação de Objeto)*/
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("João");
		aluno1.setIdade(50);
		aluno1.setDataMatricula("11/02/2054");
		aluno1.setDataNascimento("17/06/1993");
		aluno1.setNomeEscola("Senai");
		aluno1.setNomeMae("Jerusa");
		aluno1.setNumeroCpf("02382256458");
		aluno1.setSerieMatriculado("Ensino médio");
		aluno1.setSexo("Masculino");
		aluno1.setNomePai("Solismar");
		aluno1.setRegistroGeral("6025458");
	    
		System.out.println(aluno1.toString());
		
		Aluno aluno2 = new Aluno();
		
		
		Aluno aluno3 = new Aluno();
		
		
		Aluno aluno4 = new Aluno("Maria");
		
		
		Aluno aluno5 = new Aluno("José", 50);
		
		
		
		
	}

}
