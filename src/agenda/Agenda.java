/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import modelo.Pessoa;

/**
 *
 * @author Bruno Ramos
 */
public class Agenda {
    List<Pessoa> pessoas = new ArrayList<>();
    
    public void armazenarPessoa (String nome, Integer idade, Double altura){
        LocalDate nascimento = LocalDate.now().plusYears(-idade);
        Pessoa pessoa = new Pessoa();
        pessoa.setDataNascimento(nascimento);
        pessoa.setAltura(altura);
        pessoa.setNome(nome);
        pessoas.add(pessoa);
        
    }
    
    public void removerPessoa(String nome) {
	Pessoa pessoa = new Pessoa();
	pessoa.setNome(nome);
	pessoas.remove(pessoa);
    }
    
    public Integer buscarPessoa(String nome){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        Integer index = pessoas.indexOf(pessoa);
        return index;
    }
    
    public void imprimeAgenda(){
        pessoas.stream().forEach(p->{System.out.println(p);});
    }
    
    public void imprimePessoa(Integer posicao){
        System.out.println(pessoas.get(posicao));
    }
    
    
}
