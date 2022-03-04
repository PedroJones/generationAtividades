package POO;

public class Cliente {

	// declara��o dos atributos da classe
	private String nome;
	private int idade;
	private String preferencias;

	// declarar o m�todo construtor
	public Cliente(String nome, int idade, String preferencias) {
		this.nome = nome; // todo atributo vem com a refer�ncia this
		this.idade = idade;
		this.preferencias = preferencias;

	}

	public void atenderCliente() {
		System.out.println("Boa tarde, " + nome + ", em que posso ajudar?");
	}

	public int getIdade() {
		return idade;
	}

	// cria��o dos m�todos get e set
	public String getNome() {
		return nome;
	}

	public String getPreferencias() {
		return preferencias;
	}

	// declara��o dos demais m�todos da classe
	public void imprimirInfo() {
		System.out.println("Nome do cliente: " + nome + ".\nIdade: " + idade + ".\nPrefer�ncia: " + preferencias + ".");
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
