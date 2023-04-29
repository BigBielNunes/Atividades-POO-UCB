package br.catolica.aluno.teste3;

public class Vendedor extends Empregado{
	
	private double valorVendas;
	private double comissao;
	
	public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto,
			double valorVendas, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return this.comissao = comissao + (valorVendas * 0.20);
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getCalcularSalario() {
		return this.calcularSalario= calcularSalario + (salarioBase + comissao - imposto);
	}
	
	public String toString() {
		return "Nome: " + getNome()
				+"\nEndereço: " + getEndereco()
				+"\nTelefone: " + getTelefone()
				+"\nCodigo do setor: " + getCodigoSetor()
				+"\nSalario Base: " + getSalarioBase()
				+"\nImpostos: " + getImposto()
				+"\nValor de Vendas: " + getValorVendas()
				+"\nComissão: " + getComissao()
				+"\nSalario Final: " + getCalcularSalario();
	}

}
