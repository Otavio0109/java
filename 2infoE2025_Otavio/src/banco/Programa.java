/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author 16662272698
 */
public class Programa {
    public static void main(String[] args) {
        Conta minhaConta = new Conta(); //criei um objeto
        Conta outraConta = new Conta(); //Crie outro objeto
        
        minhaConta.deposita (10000);
        minhaConta.cliente = "Otávio";// O método executou o problema
        outraConta.deposita (20000);
        minhaConta.saca(50000);//Chamando Atributo
        
        System.out.println("Saldo da minha conta: "+minhaConta.saldo);
        System.out.println("Saldo da minha conta: "+outraConta.saldo);
        
        System.out.println("Endereço da minha conta"+minhaConta);
        System.out.println("Endereço da minha conta"+outraConta);
    }
       
 }
