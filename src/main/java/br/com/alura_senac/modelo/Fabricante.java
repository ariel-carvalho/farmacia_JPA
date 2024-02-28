package br.com.alura_senac.modelo;

import javax.persistence.*;

@Entity
@Table(name = "fabricantes")
public class Fabricante
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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

