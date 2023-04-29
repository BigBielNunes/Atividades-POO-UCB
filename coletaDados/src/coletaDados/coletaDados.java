package coletaDados;

import java.util.Scanner;

public class coletaDados {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int numeroPessoas = 0;
	        int mulheresOlhoECabeloCastanho = 0;
	        
	        while (true) {
	            System.out.print("Sexo digite: \nm para masculino\nf para feminino: ");
	            String sexo = scanner.nextLine().toLowerCase();
	            if (!sexo.equals("m") && !sexo.equals("f")) {
	                System.out.println("Opção, invalida digite uma opção valida");
	                continue;
	            }
	            
	            System.out.print("Cor dos olhos digite: \na para azul\nv para verde\nc para castanho\n p para preto: ");
	            String corOlho = scanner.nextLine().toLowerCase();
	            if (!corOlho.equals("a") && !corOlho.equals("v") && !corOlho.equals("c") && !corOlho.equals("p")) {
	                System.out.println("Opção, invalida digite uma opção valida");
	                continue;
	            }
	            
	            System.out.print("Cor dos cabelos digite: \nl para loiro\nc para castanho\n p para preto\nr para ruivo: (l, c, p ou r): ");
	            String corCabelo = scanner.nextLine().toLowerCase();
	            if (!corCabelo.equals("l") && !corCabelo.equals("c") && !corCabelo.equals("p") && !corCabelo.equals("r")) {
	                System.out.println("Opção, invalida digite uma opção valida");
	                continue;
	            }
	            
	            System.out.print("Digite uma idade entre 10 e 100 anos: ");
	            int idade = scanner.nextInt();
	            scanner.nextLine(); 
	            if (idade < 10 || idade > 100) {
	                System.out.println("Opção, invalida digite uma opção valida");
	                continue;
	            }
	            
	            System.out.print("Salário: ");
	            double salario = scanner.nextDouble();
	            scanner.nextLine();
	            if (salario < 0) {
	                System.out.println("Salário inválido pois está com saldo negativo. Digite uma opção valida");
	                continue;
	            }
	            
	            if (idade == -1) {
	            	System.out.println("Idade invalida");
	                break;
	            }
	            if (sexo.equals("f") && corOlho.equals("c") && corCabelo.equals("c") && idade >= 18 && idade <= 35) {
	            	mulheresOlhoECabeloCastanho++;
	            }
	        	}
	            
	            numeroPessoas++;
	        }
	 
	 			
	        
	 			
	    }

	


