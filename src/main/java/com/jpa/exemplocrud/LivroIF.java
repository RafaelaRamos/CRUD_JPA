/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpa.exemplocrud;

import java.util.List;

/**
 *
 * @author Cliente
 */


public interface LivroIF {
    
  public void salvar( Livro livro);  
  public void remover(int id);
  public Livro buscar(int id);
  public void atualizar ( Livro livro);
   
  
}
