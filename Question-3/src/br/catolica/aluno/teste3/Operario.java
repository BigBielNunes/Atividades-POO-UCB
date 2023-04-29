package br.catolica.aluno.teste3;

public class Operario extends Empregado {
	private double valorProducao;
	private double comissao;
	
	public Operario(String nome,String endereco, String telefone,int codigoSetor,double salarioBase,double imposto,double valorProducao,double comissao){
		super(nome,endereco,telefone,codigoSetor,salarioBase,imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return this.comissao = comissao + (valorProducao * 0.20);
	}

	public void setComissao(double comissao) {
		this.comissao = comissao ;
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
				+"\nValor de Produção: " + getValorProducao()
				+"\nComissão: " + getComissao()
				+"\nSalario Final: " + getCalcularSalario();
	}
}
