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
public class TesteConversor {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ConversorDeTemperatura conversor = new ConversorDeTemperatura();
        System.out.println("Digite 1 para celsiusParaFahrenheit ");
        System.out.println("Digite 2 para fahrenheitParaCelsius ");
      
        int opcao = entrada.nextInt();
        System.out.println("Digite a temperatura: ");
      
        float temperatura = entrada.nextFloat();
        double resultado;
        switch(opcao){
            case 1:
                resultado = conversor.celsiusParaFahrenheit(temperatura);
            break;
            case 2:
                resultado = conversor.fahrenheitParaCelsius(temperatura);
            break;
            default:
                resultado = 0;    
                
        } 
        System.out.println("A conversor é "+resultado);
    }
    
}
