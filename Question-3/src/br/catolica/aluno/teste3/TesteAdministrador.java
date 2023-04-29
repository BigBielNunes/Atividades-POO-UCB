package br.catolica.aluno.teste3;

public class TesteAdministrador {

	public static void main(String[] args) {
		Administrador pedro = new Administrador("Pedro","Jõao Pessoa","8888-8888",18,2500.50,500,500);
		Administrador juliana = new Administrador("Juliana","Jõao Pessoa","8888-8888",18,2500.50,500,1000);
		
		System.out.println("Informações do Administrador: \n" + pedro.toString());
		System.out.println("Informações do Administrador: \n" + juliana.toString());
		
	}

}
