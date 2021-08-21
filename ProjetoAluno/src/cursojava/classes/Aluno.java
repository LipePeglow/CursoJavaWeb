package cursojava.classes;

/*CLASSE/OBJETO QUE REPRESENTA O ALUNO*/
public class Aluno {

	private String nome;
	private String sexo;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private int idade;

   public Aluno() {
	
}

	/* METODO QUE SE UTILIZA PARA CLASSE JA TER UM VALOR */
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

	@Override
	public String toString() {
		return "Aluno nome = " + getNome() +
				"\n, sexo = " + sexo + 
				"\n, dataNascimento = " + dataNascimento + 
				"\n, registroGeral = "+ registroGeral +
				"\n, numeroCpf = " + numeroCpf +
				"\n, nomeMae = " + nomeMae + 
				"\n, nomePai = " + nomePai + 
				"\n, dataMatricula = " + dataMatricula + 
				"\n, nomeEscola = " + nomeEscola + 
				"\n, serieMatriculado = "
				+ serieMatriculado + 
				"\n, idade = " + idade + "]";
		
		}
	
	
	/*Metodos SETTERS e GETTERS do Objeto*/
	/*SET é para adicionar ou receber dados para os atributos*/
	/*GET é para resgatar ou obter o valor do atributo*/

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	
	

}
