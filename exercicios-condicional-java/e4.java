package exercicioslacocondicional;
import java.util.Scanner;
public class e4 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double x,raiz,potencia;
		System.out.println("Informe um número: ");
		x=ler.nextDouble();
		if (x%2==0) {
			raiz=Math.sqrt(x);
			System.out.printf("Este número é par e sua raiz quadrada é: %.2f",raiz);
		}
		else {
			potencia=Math.pow(x, 2.0);
			System.out.println("Este número é ímpar e sua potência ao quadrado é: "+potencia);
		}
}
}