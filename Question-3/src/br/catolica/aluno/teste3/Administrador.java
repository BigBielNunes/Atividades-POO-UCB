package br.catolica.aluno.teste3;

public class Administrador extends Empregado {
	private double ajudaCustos;
	
	public Administrador(String nome,String endereco, String telefone,int codigoSetor,double salarioBase,double imposto,double ajudaCustos) {
		super(nome,endereco,telefone,codigoSetor,salarioBase,imposto);
		this.ajudaCustos = ajudaCustos;
	}

	public double getAjudaCustos() {
		return ajudaCustos;
	}

	public void setAjudaCustos(double ajudaCustos) {
		this.ajudaCustos = ajudaCustos;
	}
	
	public double getCalcularSalario() {
		return this.calcularSalario= calcularSalario + (salarioBase + ajudaCustos - imposto);
	}
	
	public String toString() {
		return "Nome: " + getNome()
				+"\nEndereço: " + getEndereco()
				+"\nTelefone: " + getTelefone()
				+"\nCodigo do setor: " + getCodigoSetor()
				+"\nSalario Base: " + getSalarioBase()
				+"\nImpostos: " + getImposto()
				+"\nAjuda de Custo: " + getAjudaCustos()
				+"\nSalario Final: " + getCalcularSalario();
	}

}
