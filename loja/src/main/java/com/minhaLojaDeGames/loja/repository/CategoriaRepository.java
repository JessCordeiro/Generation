package com.minhaLojaDeGames.loja.repository;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaLojaDeGames.loja.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	public List<Categoria> findAllByTituloContainingIgnoreCase(String titulo);
}
