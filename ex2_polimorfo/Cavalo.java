package POO_polimorfismo;

public class Cavalo extends Animal {
private boolean correr=false;
	
	
	@Override
	public String som(){
		return "IIIIIIIRIRIRIRIRIRIRIRIRI!!!";
	}
	

	public void correr() {
		this.correr = true;
	}
	public void imprimirInfo(){
		System.out.println("O nome do cavalo �: "+super.getNome()+"\nSua idade �: "+super.getIdade()+"\nO barulho do cavalo �: "+ this.som());
		if (correr==true) {
			System.out.println("O cavalo est� correndo.\n");
		} else {
			System.out.println("O cavalo est� trotando.\n");
		}
	}
}
