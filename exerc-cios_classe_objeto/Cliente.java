package POO;

public class Cliente {

	// declaração dos atributos da classe
	private String nome;
	private int idade;
	private String preferencias;

	// declarar o método construtor
	public Cliente(String nome, int idade, String preferencias) {
		this.nome = nome; // todo atributo vem com a referência this
		this.idade = idade;
		this.preferencias = preferencias;

	}

	public void atenderCliente() {
		System.out.println("Boa tarde, " + nome + ", em que posso ajudar?");
	}

	public int getIdade() {
		return idade;
	}

	// criação dos métodos get e set
	public String getNome() {
		return nome;
	}

	public String getPreferencias() {
		return preferencias;
	}

	// declaração dos demais métodos da classe
	public void imprimirInfo() {
		System.out.println("Nome do cliente: " + nome + ".\nIdade: " + idade + ".\nPreferência: " + preferencias + ".");
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreferencias(String preferencias) {
		this.preferencias = preferencias;
	}

}
