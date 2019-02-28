/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpa.exemplocrud.main;

import com.jpa.exemplocrud.CrudLivro;
import com.jpa.exemplocrud.Livro;
import com.jpa.exemplocrud.LivroIF;

/**
 *
 * @author Cliente
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Livro livro = new Livro("Cidade do sol", " Khaled ", "editora", 322, "descricao");
       
        
        LivroIF lf= new CrudLivro();
        lf.salvar(livro);
      
       
  //lf.atualizar(livro);
      //Livro lv = lf.buscar(1);
      //System.out.println(lv);
        
        

    }

}
