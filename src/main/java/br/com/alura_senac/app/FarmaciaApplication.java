package br.com.alura_senac.app;

import br.com.alura_senac.dao.FabricanteDAO;
import br.com.alura_senac.dao.ProdutoDAO;
import br.com.alura_senac.modelo.Fabricante;
import br.com.alura_senac.modelo.Produto;
import br.com.alura_senac.util.JPAUtil;


import javax.persistence.EntityManager;

public class FarmaciaApplication
{
    public static void main(String[] args)
    {

        EntityManager em = JPAUtil.getEntityManager();

        FabricanteDAO fabricanteDAO = new FabricanteDAO(em);
        ProdutoDAO produtoDAO = new ProdutoDAO(em);

        Fabricante fabricante = new Fabricante("Fabricante 1");
        Produto produto = new Produto("Produto 1", "Primeiro Produto", 1, fabricante);

        em.getTransaction().begin();

        fabricanteDAO.cadastrar(fabricante);
        produtoDAO.cadastrar(produto);

        em.getTransaction().commit();
        em.close();


    }
}