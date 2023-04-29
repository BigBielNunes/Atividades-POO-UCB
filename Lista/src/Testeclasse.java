import java.util.Scanner;

public class Testeclasse {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double arrecadado;
		double comissao;
		double salario_final;
		
		System.out.println("Digite o salario fixo por mês: ");
		double salario = sc.nextDouble();
		
		System.out.println("Digite a quantidade de carros vendidos: ");
		int quantidade = sc.nextInt();
		
		System.out.println("Valor de cada carro vendido: ");
		double valor = sc.nextDouble();
		
		arrecadado = quantidade * valor;
		
		comissao = arrecadado * 0.05;
		
		salario_final = salario + comissao;
		
		System.out.println("A quantidade de carros vendidos é: " + quantidade + "\nValor total de vendas: " + arrecadado + "\nSalário fixo: " + salario + "\nValor da comissão recebido: " + comissao + "\nSalário final: " + salario_final);
	}
}
