package POO;

public class testeAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aviao aviao1 = new Aviao("Boeing 581","Cabo Frio");
		aviao1.decolar();
		System.out.println();
		Aviao aviao2 = new Aviao("Boeing 678", "Hong Kong");
		aviao2.pousar();
	}

}
