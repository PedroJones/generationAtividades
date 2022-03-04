package POO;

public class Aviao {
	// Atributos
	private String nome;
	private String destino;
	// Construtor
	public Aviao(String nome, String destino) {
		this.setNome(nome);
		this.setDestino(destino);
	}
	// Outros m�todos
	public void decolar() {
		System.out.println("Avi�o "+nome+" com destino a(o) "+ destino+ " permiss�o para decolar!");
	}
	public void pousar() {
		System.out.println("Avi�o "+nome+" com destino a(o) "+ destino+ " permiss�o para pousar!");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

}
