/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Case;

/**
 *
 * @author 16662272698
 */
public class Pessoa {
    String nome;
    int idade;
    double dataAniver;
    
//    public void fazAniversarioAno{
//       Date níver = new Date();
//    this.dataAniver = niver.getYear()- this.idade;
//       System.out.println(""+niver);
//}
    public void exibir(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Ano de Aniversário: "+this.dataAniver);
    }
}