package POO_polimorfismo;

public class testAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Frederico");
		cachorro.setIdade(5);
		cachorro.correr();
		cachorro.imprimirInfo();
		
		Cavalo cavalo = new Cavalo();
		cavalo.setNome("Pegasus");
		cavalo.setIdade(12);
		cavalo.correr();
		cavalo.imprimirInfo();
		
		Preguiça preguica = new Preguiça();
		preguica.setNome("Dorival");
		preguica.setIdade(20);
		preguica.subir();
		preguica.imprimirInfo();
	}

}
