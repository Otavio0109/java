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
public class ContagemRegressiva {
    public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
int opcao, i=0;
while(true){
System.out.println("Digite apenas Número acima de 0: ");
opcao = entrada.nextInt();
if (opcao > 0){

System.out.println("Número Invalido. Tente novamente");
break;
}

}
while( opcao >= 0){
opcao--;
System.out.println(""+opcao);
}
}

}

