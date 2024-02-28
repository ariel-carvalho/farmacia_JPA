package br.com.alura_senac.modelo;

public class Produto
{
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private Fabricante fabricante;

    public Produto(String nome, String descricao, double preco, Fabricante fabricante)
    {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.fabricante = fabricante;
    }

    public int getId()
    {
        return id;
    }

    public String getNome()
    {
        return nome;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public double getPreco()
    {
        return preco;
    }

    public Fabricante getFabricante()
    {
        return fabricante;
    }
}
