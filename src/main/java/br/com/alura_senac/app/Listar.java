package br.com.alura_senac.app;

import br.com.alura_senac.dao.FabricanteDAO;
import br.com.alura_senac.dao.ProdutoDAO;
import br.com.alura_senac.modelo.Fabricante;
import br.com.alura_senac.modelo.Produto;
import br.com.alura_senac.util.JPAUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class Listar
{
    public static void main(String[] args)
    {
        EntityManager em = JPAUtil.getEntityManager();

        ProdutoDAO produtoDAO = new ProdutoDAO(em);

        List<Produto> todos = produtoDAO.buscarTodos();
        todos.forEach(produto -> System.out.println("Nome: " + produto.getNome()
                + "| Descrição: " + produto.getDescricao() + "| Preço: R$ " + produto.getPreco() + produto.getFabricante()));



    }
}
