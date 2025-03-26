/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade16_03;
import  java.util.Scanner;
/**
 *
 * @author Otávio
 */
public class VerificarNumeropar {
    public static String verificarNumeroPar(float num1){

        
        if(num1 %2 == 0){
          
           return "true";
        } else{
           return "false";
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
      float num1;
      String verificar;
       
       System.out.println("Digite o primeiro número: ");
        num1 = entrada.nextFloat();
        verificar = verificarNumeroPar(num1);
        System.out.printf("Verificação:  "+verificar);
        
        
    } 
}
