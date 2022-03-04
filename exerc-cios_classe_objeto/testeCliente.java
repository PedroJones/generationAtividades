package POO;

public class testeCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1 = new Cliente("Márcio", 26, "Calça Cargo");
		Cliente cliente2 = new Cliente("José", 41, "Jaqueta");
		Cliente cliente3 = new Cliente("Maria", 16, "Saia Jeans");
		cliente1.imprimirInfo();
		cliente1.atenderCliente();
		System.out.println();
		cliente2.imprimirInfo();
		cliente2.atenderCliente();
		System.out.println();
		cliente3.imprimirInfo();
		cliente3.atenderCliente();
		cliente3.setNome("Maria das Neves");
		cliente3.atenderCliente();

	}

}
