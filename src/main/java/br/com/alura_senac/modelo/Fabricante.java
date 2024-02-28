package br.com.alura_senac.modelo;

public class Fabricante
{
    private int id;
    private String nome;

    public Fabricante(String nome)
    {
        this.nome = nome;
    }

    public int getId()
    {
        return id;
    }

    public String getNome()
    {
        return nome;
    }
}

