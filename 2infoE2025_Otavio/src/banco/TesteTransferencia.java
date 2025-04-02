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
public class TesteTransferencia {
    public static void main(String[] args) {
        Conta contaJoao = new Conta();
        Conta contaPedro = new Conta();
        
        
        contaJoao.deposita(4000);
        contaPedro.deposita(7000);
        
        contaPedro.transfere(contaJoao, 50000);
        
        System.out.println("Saldo da conta do João: "+contaJoao.saldo);
        System.out.println("Saldo da conta do Pedro: "+contaPedro.saldo);
    }
}
