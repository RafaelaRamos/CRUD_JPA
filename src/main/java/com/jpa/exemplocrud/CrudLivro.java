/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpa.exemplocrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Cliente
 */
public class CrudLivro implements LivroIF {
//obtendo a  instância de um EntityManager para gerenciar as  entidades 

    public EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("DAC");
        EntityManager em = factory.createEntityManager();

        return em;
    }

    @Override
    public void salvar(Livro livro) {
        EntityManager em = getEntityManager();
        EntityTransaction transaction = em.getTransaction();
        //inicio da transação
        transaction.begin();
        em.persist(livro);
        //fim da transação
        transaction.commit();
    }
//Determinar o uso do inicio e do fim da  transação 
    //é importante principalmente quando se trabalha com a persistencia
    //de entidades que possuem relacionamentos(Não é o caso desse exemplo) 
    // pois todas as ações dentro desse bloco serão tratadas como uma só

    @Override
    public void remover(int id) {
        EntityManager em = getEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        Livro livro = em.find(Livro.class, id);
        //remove a entidade
        em.remove(livro);
        transaction.commit();

    }

    @Override

    public void atualizar(Livro livro) {
        EntityManager em = getEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        //mescla a entidade
        Livro livro2 = em.merge(livro);

        transaction.commit();

    }

    @Override
    public Livro buscar(int id) {
        EntityManager em = getEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        Livro livro;
        //busca os dados no banco
        livro = em.find(Livro.class, id);

        transaction.commit();
        return livro;
    }

}
