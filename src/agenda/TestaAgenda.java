/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.Scanner;

/**
 *
 * @author Bruno Ramos
 */
public class TestaAgenda {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Agenda agenda = new Agenda();
        
        agenda.armazenarPessoa("Bruno", 21, 1.75);
        agenda.armazenarPessoa("Pedro", 18, 1.80);
        
        agenda.imprimeAgenda();
        
        agenda.imprimePessoa(0);
        
        System.out.println(agenda.buscarPessoa("Bruno"));
        
        agenda.removerPessoa("Bruno");
        
        agenda.imprimeAgenda();   
    }
}
