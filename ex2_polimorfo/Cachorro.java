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
		System.out.println("O nome do Cachorro é: "+super.getNome()+"\nSua idade é: "+super.getIdade()+"\nO barulho do cachorro é: "+ this.som());
		if (correr==true) {
			System.out.println("O cachorro está correndo.\n");
		} else {
			System.out.println("O cachorro está dançando.\n");
		}
	}
}
