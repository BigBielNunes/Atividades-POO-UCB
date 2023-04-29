package br.catolica.aluno.teste4;

public class ComplexoEsportivo {
	private String nome;
	private int qntPessoas;
	private int qntDiasSemana;
	private int qtnProfessor;
	private String tipoUniforme;
	private double mensalidade;
	
	public ComplexoEsportivo(String nome,int qntPessoas, int qntDiasSemana, int qtnProfessor, String tipoUniforme,
			double mensalidade) {
		this.qntPessoas = qntPessoas;
		this.qntDiasSemana = qntDiasSemana;
		this.qtnProfessor = qtnProfessor;
		this.tipoUniforme = tipoUniforme;
		this.mensalidade = mensalidade;
		
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQntPessoas() {
		return qntPessoas;
	}

	public void setQntPessoas(int qntPessoas) {
		this.qntPessoas = qntPessoas;
	}

	public int getQntDiasSemana() {
		return qntDiasSemana;
	}

	public void setQntDiasSemana(int qntDiasSemana) {
		this.qntDiasSemana = qntDiasSemana;
	}

	public int getQtnProfessor() {
		return qtnProfessor;
	}

	public void setQtnProfessor(int qtnProfessor) {
		this.qtnProfessor = qtnProfessor;
	}

	public String getTipoUniforme() {
		return tipoUniforme;
	}

	public void setTipoUniforme(String tipoUniforme) {
		this.tipoUniforme = tipoUniforme;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public String toString() {
		return "Nome: " + getNome()
				+"\nQuantidade de pessoas suportadas: " + getQntPessoas()
				+"\nQuantidade de dias na semana: " + getQntDiasSemana()
				+"\nQuantidade de Professores: " + getQtnProfessor()
				+"\nTipo de Uniforme: " + getTipoUniforme()
				+"\nÈ gratuito para visitar";
	}
}
