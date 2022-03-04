package br.org.generation.farmacia.model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	  @Id	
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotBlank(message = "O atributo Tipo é obrigatório e não pode conter espaços em branco")
		private String nome;
		
		private boolean estoque;
		
		@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
		@JsonIgnoreProperties("categoria")
		private List<Produto> produto;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public boolean isEstoque() {
			return estoque;
		}

		public void setEstoque(boolean estoque) {
			this.estoque = estoque;
		}

		public List<Produto> getProduto() {
			return produto;
		}

		public void setProduto(List<Produto> produto) {
			this.produto = produto;
		}

		

}
