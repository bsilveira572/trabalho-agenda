/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno Ramos
 */
public class TestaPessoa {
    static Pessoa pessoa = new Pessoa();
    public static void main(String[] args) {
        pessoa.setNome("Bruno");
        pessoa.setDataNascimento(LocalDate.of(1996,10,22));
        pessoa.setAltura(1.75);
        System.out.println(pessoa);
        
    }
}
