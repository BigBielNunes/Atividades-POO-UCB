package br.catolica.aluno.teste3;

public class TesteEmpregado {

	public static void main(String[] args) {
		
		Empregado carlos = new Empregado("Carlos","Curitiba","8888-8888",17,5000.50,1000);
		Empregado paula = new Empregado("Paula","Parana","8888-8888",17,5000.50,1000);
		
		
		System.out.println("Informações do Empregado: \n" + carlos.toString());
		System.out.println("Informações do Empregado: \n" + paula.toString());

	}

}
