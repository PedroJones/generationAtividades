package exerciciosJava;
import java.util.Scanner;
public class e8 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double custoConsumidor, custoFabrica, distribuidor, impostos;
		System.out.println("Informe o custo de Fábrica: ");
		custoFabrica=ler.nextDouble();
		distribuidor = (custoFabrica*28)/100;
		impostos = (custoFabrica*48)/100;
		custoConsumidor = custoFabrica + distribuidor + impostos;
		System.out.println("O custo do carro ao consumidor será: " + custoConsumidor);
}
}