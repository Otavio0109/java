/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxe;

import java.util.Scanner;


/**
 *
 * @author 16662272698
 */
public class EntradaSaidaPadrao {
    public static void main(String arg[]){
        
        Scanner entrada = new Scanner(System.in);//Declarando variaveis 
        
        System.out.println("Digite seu nome");// saída padrão
        String nome = entrada.nextLine();// scanf
        System.out.println("Digite sua idade");
        int idade = entrada.nextInt ();
        idade ++;
         System.out.println("Digite seu salário:");
         double salario = entrada.nextDouble();
        
        System.out.println("Nome: "+nome);//saída padrão
        System.out.println("Idade: "+idade);//saída padrão
        System.out.println("Salário: "+salario);//saída padrão
        
        
}
}