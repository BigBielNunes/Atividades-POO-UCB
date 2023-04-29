package br.catolica.aluno.teste2;

public class main {

	public static void main(String[] args) {
		
		Gerente marcos = new Gerente("Marcos",28,"Masculino",10500.50,"23FG56","Area de computação");
		Gerente julia = new Gerente("Julia",29,"Feminino",10500.50,"24FG56","Area de Finanças");
		Vendedor renato = new Vendedor("Renato",25,"Masculino",2000.50,"12ER56",1500.50,12);
		Vendedor brenda = new Vendedor("Brenda",25,"Feminino",2000.50,"11ER56",1700.50,13);
		Cliente chicago = new Cliente("Chicago",29,"Masculino",1500,1996);
		Cliente julieta = new Cliente("Julieta",29,"Feminino",1700,1996);

		
		System.out.println("Informações do Gerente: \n" +marcos.toString());
		System.out.println("Informações do Gerente: \n" +julia.toString());
		System.out.println("Informações do Vendedor: \n" +renato.toString());
		System.out.println("Informações do Vendedor: \n" +brenda.toString());
		System.out.println("Informações do Cliente: \n" +chicago.toString());
		System.out.println("Informações do Cliente: \n" +julieta.toString());
	}

}
