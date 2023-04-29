package br.catolica.aluno.teste2;

public class Gerente extends Empregado{
	
	private String nomeGerencia;

	public Gerente(String nome,int idade,String sexo,double salario,String matricula,String nomeGerencia) {
		super(nome,idade,sexo,salario,matricula);
		this.nomeGerencia = nomeGerencia;
	}
	
	public String getNomeGerencia() {
		return nomeGerencia;
	}

	public void setNomeGerencia(String nomeGerencia) {
		this.nomeGerencia = nomeGerencia;
	}
	
	public String toString() {
		return "Nome: " + getNome()
				+ "\nIdade: " + getIdade()
				+ "\nNome da gerencia: " + getNomeGerencia()
				+ "\nValor do Inss: " + getValorInss();
	}

}
