/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetojava1;

import java.util.Scanner;

/**
 *
 * @author bieln
 */
public class ProjetoJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Digite o seu nome: ");
        String aluno = sc.nextLine();
       
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        
        System.out.println("Digite seu CPF: ");
        int cpf = sc.nextInt();
        
        System.out.println("Digite sua nota: ");
        float nota = sc.nextFloat();
        
        System.out.println("aluno: " + aluno + "\nidade: " + idade + "\ncpf: " + cpf + "nota: " + nota);
    }
    
}
