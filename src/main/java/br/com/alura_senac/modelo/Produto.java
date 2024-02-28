package br.com.alura_senac.modelo;

import javax.persistence.*;

@Entity
@Table(name = "produtos")
 public class Produto
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    @ManyToOne
    private Fabricante fabricante;

    public Produto(){}

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

    @Override
    public String toString()
    {
        return "Nome: " + this.nome + "| Descrição: "+ this.descricao + "| Preço: R$ " + this.preco;
    }
}
