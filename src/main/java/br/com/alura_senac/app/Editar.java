package br.com.alura_senac.app;

import br.com.alura_senac.dao.ProdutoDAO;
import br.com.alura_senac.modelo.Produto;
import br.com.alura_senac.util.JPAUtil;

import javax.persistence.EntityManager;

public class Editar
{
    public static void main(String[] args)
    {
        EntityManager em = JPAUtil.getEntityManager();

        ProdutoDAO produtoDAO = new ProdutoDAO(em);

        em.getTransaction().begin();

        Produto produto = produtoDAO.buscarPorId(1);
        produto.setDescricao("Nova Descrição");

        System.out.println("Nome: " + produto.getNome() + "| Descrição: "
                + produto.getDescricao() + "| Preço: R$ " + produto.getPreco() + produto.getFabricante());
    }
}
