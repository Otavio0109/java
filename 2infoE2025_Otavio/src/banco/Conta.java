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
public class Conta {
    int numero; //Atributos ou variaveis de instância
    String cliente;//Indetiicando o cliente
    double saldo,limite;
   
    public void saca(double quantidade){//metodo  
        if(this.saldo > quantidade){//Esta sendo uma condição se vai acontecer ou não
            this.saldo = this.saldo - quantidade;//Calculando reajuste do saldo 
        }
        else {
            System.out.println("Prezado\t"+this.cliente+"  .Saldo Insuficiente.Seu salario é: "+this.saldo);//mensagem pro usuario  
        }
      }
      public void deposita(double quantidade) { //Metodo para depositar
          if(quantidade > 0){
             this.saldo = this.saldo =quantidade; 
          }
          else if (quantidade == 0) {
              System.out.println("O número e NULLO");
    }
          else {
                  System.out.println("O número e positivo");
          } 
      }  
           public void transfere(Conta destino, double valor){
              if(valor>this.saldo){
                  System.out.println("saldo Insufiente para transferência");
              }
              else {
                  this.saldo = this.saldo - valor;
                  destino.saldo = destino.saldo + valor;
              }
              this.saldo = this.saldo - valor;// saque 
              destino.saldo = destino.saldo = valor; //deposita
    }      

   
    
}