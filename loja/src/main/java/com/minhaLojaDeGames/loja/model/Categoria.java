package com.minhaLojaDeGames.loja.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "categoria")


public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull
	@Size(min = 5, max = 100)
	private String JogosOnline;
	
	@NotNull
	@Size(min = 5, max = 500)
	private String Acessorios;
	
	@NotNull
	@Size(min = 5, max = 100)
	private String titulo;
	
	
	@NotNull
	@Size(min = 5, max = 500)
	private String Descricao;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getJogosOnline() {
		return JogosOnline;
	}

	public void setJogosOnline(String jogosOnline) {
		JogosOnline = jogosOnline;
	}

	public String getAcessorios() {
		return Acessorios;
	}

	public void setAcessorios(String acessorios) {
		Acessorios = acessorios;
	}
}
