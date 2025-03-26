/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade16_03;
import java.util.Scanner;
        
/**
 *
 * @author Otávio
 */
public class CalculandoMedia {
    public static float calcularMedia(float num1 , float num2 , float num3){
        return (num1+num2+num3)/3;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float media,num1,num2,num3;
        
        System.out.printf("Digite o primeiro número: ");
        num1 = entrada.nextFloat();
        
        System.out.printf("Digite o segundo número: ");
         num2 = entrada.nextFloat();
        
         System.out.printf("Digite o terceiro número: ");
         num3 = entrada.nextFloat();
        
        media = calcularMedia(num1, num2, num3);
        
        System.out.println("Média "+media);
        
             
        
        
    }
          
}
