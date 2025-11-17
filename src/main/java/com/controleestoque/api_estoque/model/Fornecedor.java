package com.controleestoque.api_estoque.model;

import java.util.List;
import java.util.Set;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_fornecedores")
public class Fornecedor{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany(mappedBy = "fornecedores")
    private Set<Produto> produtos;

    public Fornecedor() {}

    public Fornecedor(String nome, Set<Produtos> produtos) {
        this.nome = nome;
        this.produtos = produtos;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome (String nome) { this.nome = nome; }
    public Set<Produto> getProdutos() { return produtos; }
    public void setProdutos(Set<Produto> produtos) { this.produtos = produtos; }
}

