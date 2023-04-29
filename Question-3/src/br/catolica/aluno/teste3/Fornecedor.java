package br.catolica.aluno.teste3;

public class Fornecedor extends Pessoa{
	
	private double valorCredito;
	private double valorDivida;
	private double obterSaldo;
	
	public Fornecedor(String nome, String endereco, String telefone,double valorCredito,double valorDivida) {
		super(nome,endereco,telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public double getValorCreditio() {
		return valorCredito;
	}

	public void setValorCreditio(double valorCreditio) {
		this.valorCredito = valorCreditio;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	public double getObterSaldo() {
		return this.obterSaldo + (valorDivida - valorCredito);
	}
	
}
