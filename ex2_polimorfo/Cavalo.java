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
		System.out.println("O nome do cavalo é: "+super.getNome()+"\nSua idade é: "+super.getIdade()+"\nO barulho do cavalo é: "+ this.som());
		if (correr==true) {
			System.out.println("O cavalo está correndo.\n");
		} else {
			System.out.println("O cavalo está trotando.\n");
		}
	}
}
