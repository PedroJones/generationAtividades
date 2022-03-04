package TestRPG;

public class Mago {
	private Magia arma;
	
	public Mago () {
		this.arma=new Magia("Fogo",80,100);
	}

	public int getArma() {
		return arma.getDano();
	}

	public void setArma(String x, int y, int z) {
		this.arma = new Magia(x,y,z);
	}
}
