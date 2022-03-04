package POO_polimorfismo;

public class Preguiça extends Animal {
private boolean subir=false;
	
	
	@Override
	public String som(){
		return "...";
	}
	

	public void subir() {
		this.subir = true;
	}
	public void imprimirInfo(){
		System.out.println("O nome da preguiça é: "+super.getNome()+"\nSua idade é: "+super.getIdade()+"\nO barulho da preguiça é: "+ this.som());
		if (subir==true) {
			System.out.println("A preguiça está escalando a árvore.\n");
		} else {
			System.out.println("A preguiça está desncansando.\n");
		}
	}
}
