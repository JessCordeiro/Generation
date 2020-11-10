package com.minhaLojaDeGames.loja.repository;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaLojaDeGames.loja.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	public List<Produto>findAlllByDescricaoContainingIgnoreCase(String descricao);
}
