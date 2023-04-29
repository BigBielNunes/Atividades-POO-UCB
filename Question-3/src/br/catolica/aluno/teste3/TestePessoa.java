package br.catolica.aluno.teste3;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa joao = new Pessoa("Jõao","Rio de Janeiro","9999-9999");
		Pessoa maria = new Pessoa("Maria","Brasilia","8888-8888");
		
		
		System.out.println("Informações da Pessoa: \n" +joao.toString());
		System.out.println("Informações da Pessoa: \n" +maria.toString());

	}

}
