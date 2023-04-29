package br.catolica.aluno.teste3;

public class TesteOperario {

	public static void main(String[] args) {
		
		Operario gustavo = new Operario("Gustavo","Jõao Pessoa","8888-8888",18,2500.50,500,10000,0);
		Operario peter = new Operario("Peter","Jõao Pessoa","8888-8888",18,2500.50,300,12000,0);
		
		System.out.println("Informações do Operario: \n" + gustavo.toString());
		System.out.println("Informações do Operario: \n" + peter.toString());

	}

}
