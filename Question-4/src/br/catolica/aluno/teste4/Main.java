package br.catolica.aluno.teste4;

public class Main {
	
	public static void main(String[] args) {
		
		ComplexoEsportivo botafogo = new ComplexoEsportivo ("Complexo esportido do Botafogo",1500,7,25,"Varios tipos", 0);
		Futebol aulaFutebol = new Futebol ("Aula de futebol",30,3,1,"Camisa e Bermuda", 100,"Futebol de campo");
		Volei aulaVolei = new Volei ("Aula de Volei",30,3,1,"Camisa e Bermuda", 100,"Volei de quadra",3.25);
		Natacao aulaNatacao = new Natacao ("Aula de Volei",15,3,1,"Toca e Sunga ou biquini", 100,50,"30°c");
		
		
		System.out.println("Informações: \n" + botafogo.toString());
		System.out.println("Informações: \n" + aulaFutebol.toString());
		System.out.println("Informações: \n" + aulaVolei.toString());
		System.out.println("Informações: \n" + aulaNatacao.toString());
		
	}
}
