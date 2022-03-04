package POO_polimorfismo;

public class Pregui�a extends Animal {
private boolean subir=false;
	
	
	@Override
	public String som(){
		return "...";
	}
	

	public void subir() {
		this.subir = true;
	}
	public void imprimirInfo(){
		System.out.println("O nome da pregui�a �: "+super.getNome()+"\nSua idade �: "+super.getIdade()+"\nO barulho da pregui�a �: "+ this.som());
		if (subir==true) {
			System.out.println("A pregui�a est� escalando a �rvore.\n");
		} else {
			System.out.println("A pregui�a est� desncansando.\n");
		}
	}
}
