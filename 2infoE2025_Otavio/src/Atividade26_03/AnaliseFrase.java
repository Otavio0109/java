/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade26_03;
import java.util.Scanner;
/**
 *
 * @author 16662272698
 */
public class AnaliseFrase {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

System.out.println("Digite uma Frase: ");
String frase = entrada.nextLine();

System.out.print("\nQuantidade de caracteres: " + frase.length()+
"\nMaiúsculas: " + frase.toUpperCase()+
"\nMinúsculas: " + frase.toLowerCase()+
"\nPrimeiro caractere: " +frase.charAt(0)+
"\nÚltimo caractere: "+frase.charAt(frase.length() - 1));
}
}