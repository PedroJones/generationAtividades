package br.org.generation.loja_de_games.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.loja_de_games.model.Categoria;





@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Long>{
	
}
