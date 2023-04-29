package br.catolica.aluno.teste3;

public class Empregado extends Pessoa {
	
	private int codigoSetor;
	protected double salarioBase;
	protected double imposto;
	protected double calcularSalario;
	
	public Empregado(String nome,String endereco, String telefone,int codigoSetor,double salarioBase,double imposto) {
		super(nome,endereco,telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public double getCalcularSalario() {
		return this.calcularSalario = calcularSalario + (salarioBase - imposto);
	}
	
	public String toString() {
		return "Nome: " + getNome()
				+"\nEndereço: " + getEndereco()
				+"\nTelefone: " + getTelefone()
				+"\nCodigo do setor: " + getCodigoSetor()
				+"\nSalario Base: " + getSalarioBase()
				+"\nImpostos: " + getImposto()
				+"\nSalario Final: " + getCalcularSalario();
				
	}

}
