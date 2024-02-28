package br.com.alura_senac.dao;

import br.com.alura_senac.modelo.Produto;

import javax.persistence.EntityManager;
import java.util.List;

public class ProdutoDAO
{
    private EntityManager em;

    public ProdutoDAO(EntityManager em)
    {
        this.em = em;
    }

    public void cadastrar(Produto produto)
    {
        this.em.persist(produto);
    }

    public List<Produto> buscarTodos()
    {
        String jpql = "SELECT produto FROM Produto produto";
        return em.createQuery(jpql, Produto.class).getResultList();
    }

}
