package br.catolica.aluno.teste2;

public class Empregado extends Pessoa{
	
	private double salario;
	private String matricula;
	private double valorInss;
	
	public Empregado(String nome,int idade,String sexo,double salario,String matricula) {
		super(nome,idade,sexo);
		this.salario = salario;
		this.matricula = matricula;
	
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getValorInss() {
		return this.valorInss = valorInss + (salario * 0.11); 
	}
	
	
}
