package br.catolica.aluno.teste3;

public class TesteVendedor {

	public static void main(String[] args) {
		
		Vendedor pirlo = new Vendedor("Pirlo","Jõao Pessoa","8888-8888",18,2500.50,500,5000,0);
		Vendedor mateus = new Vendedor("Mateus","Jõao Pessoa","8888-8888",18,2500.50,300,3000,0);
		
		System.out.println("Informações do Vendedor: \n" + pirlo.toString());
		System.out.println("Informações do Vendedor: \n" + mateus.toString());

	}

}
