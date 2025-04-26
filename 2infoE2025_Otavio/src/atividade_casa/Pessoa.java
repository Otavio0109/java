/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_casa;
/**
 *
 * @author Otávio
 */
public class Pessoa {
     String nome;
    int idade;
    double dataAniver;
    
    public void exibir(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Ano de Aniversário: "+this.dataAniver);
        
    }
}
