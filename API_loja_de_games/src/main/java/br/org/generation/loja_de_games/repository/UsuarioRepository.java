package br.org.generation.loja_de_games.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.loja_de_games.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>  {
	/**
	 * Método que busca um usuário pelo seu usuario (email).
	 * 
	 * select * from tb_usuarios where usuario = "usuario procurado"
	 */
	public Optional<Usuario> findByUsuario(String usuario);
			/**
			 * Optional<>
				Pode me retornar um objeto, mas pode não retornar.
				Por exemplo, procura um objeto da classe usuário. 
				Se encontrar, você pode retornar um objeto.
				Se não encontrar, retorna nada.
			 */
	public Optional<Usuario> findByIdAndUsuario(long id, String usuario);
}
