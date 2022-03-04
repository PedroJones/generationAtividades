package POO_polimorfismo;

public class Cachorro extends Animal {
	private boolean correr=false;
	
	
	@Override
	public String som(){
		return "AUAUAUAUAUAAUAUAUAU!!!!";
	}
	

	public void correr() {
		this.correr = true;
	}
	public void imprimirInfo(){
		System.out.println("O nome do Cachorro �: "+super.getNome()+"\nSua idade �: "+super.getIdade()+"\nO barulho do cachorro �: "+ this.som());
		if (correr==true) {
			System.out.println("O cachorro est� correndo.\n");
		} else {
			System.out.println("O cachorro est� dan�ando.\n");
		}
	}
}
