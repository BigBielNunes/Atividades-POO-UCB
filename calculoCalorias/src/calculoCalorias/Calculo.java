package calculoCalorias;

import java.util.Scanner;

public class Calculo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha o prato:");
        System.out.println("1 - Vegetariano (180 cal)");
        System.out.println("2 - Peixe (230 cal)");
        System.out.println("3 - Frango (250 cal)");
        System.out.println("4 - Carne (350 cal)");
        int prato = sc.nextInt();

        System.out.println("Escolha a sobremesa:");
        System.out.println("1 - Abacaxi (75 cal)");
        System.out.println("2 - Sorvete Diet (110 cal)");
        System.out.println("3 - Mouse Diet (170 cal)");
        System.out.println("4 - Mouse Chocolate (200 cal)");
        int sobremesa = sc.nextInt();

        System.out.println("Escolha a bebida:");
        System.out.println("1 - Chá (20 cal)");
        System.out.println("2 - Suco de laranja (70 cal)");
        System.out.println("3 - Suco de melão (100 cal)");
        System.out.println("4 - Refrigerante Diet (65 cal)");
        int bebida = sc.nextInt();
        
        int calorias = 0;
        switch (prato) {
        case 1:
            calorias += 180;
            break;
        case 2:
            calorias += 230;
            break;
        case 3:
            calorias += 250;
            break;
        case 4:
            calorias += 350;
            break;
        default:
            System.out.println("Opção digitada invalida");
        }
        switch (sobremesa) {
        case 1:
            calorias += 75;
            break;
        case 2:
            calorias += 110;
            break;
        case 3:
            calorias += 170;
            break;
        case 4:
            calorias += 200;
            break;
        default:
            System.out.println("Opção digitada invalida");
       }
        switch (bebida) {
        case 1:
            calorias += 20;
            break;
        case 2:
            calorias += 70;
            break;
        case 3:
            calorias += 100;
            break;
        case 4:
            calorias += 65;
            break;
        default:
            System.out.println("Opção digitada invalida");
       }
        
        System.out.printf("Seu prato tem um total de %d calorias.%n", calorias);
	}
	
}
