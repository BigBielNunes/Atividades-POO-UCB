/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CalculoCalorias;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author bieln
 */
public class ProjetoJava1 {

    /**
     * @param args the command line arguments
     */
public class CalculoCalorias{ 
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
        
        System.out.println("Monte o seu prato:");
    }
	int calculoCalorias = 0;
    switch (prato) {
        case 1:
            totalCalorias += 180;
            break;
        case 2:
            totalCalorias += 230;
            break;
        case 3:
            totalCalorias += 250;
            break;
        case 4:
            totalCalorias += 350;
            break;
        default:
            System.out.println("Opção inválida para o prato.");
    }

    switch (sobremesa) {
        case 1:
            totalCalorias += 75;
            break;
        case 2:
            totalCalorias += 110;
            break;
        case 3:
            totalCalorias += 170;
            break;
        case 4:
            totalCalorias += 200;
            break;
        default:
            System.out.println("Opção inválida para a sobremesa.");
    }

    switch (bebida) {
        case 1:
            totalCalorias += 20;
            break;
        case 2:
            totalCalorias += 70;
            break;
        case 3:
            totalCalorias += 100;
            break;
        case 4:
            totalCalorias += 65;
            break;
        default:
            System.out.println("Opção inválida para a bebida.");
    }

    System.out.printf("A refeição escolhida tem um total de %d calorias.%n", totalCalorias);
    
	}
	}
}

