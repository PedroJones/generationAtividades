package PO_classe_subclasse;

public class Preguica extends Animal{
	private boolean subirArvore;
	
	public Preguica (String nome, int idade, String som, boolean subirArvore) {
		super (nome, idade, som);
		this.subirArvore = subirArvore;
	}

	public boolean isSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(boolean subirArvore) {
		this.subirArvore = subirArvore;
	}
	
	
}
