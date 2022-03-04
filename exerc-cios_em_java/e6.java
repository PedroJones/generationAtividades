package exerciciosJava;

import java.util.Scanner;

public class e6 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double x1, x2, y1, y2, potencia1, potencia2, distancia;

		System.out.println("Insira o ponto1: ");
		x1=ler.nextDouble();
		y1=ler.nextDouble();
		System.out.println("Insira o ponto2: ");
		x2=ler.nextDouble();
		y2=ler.nextDouble();
		potencia1 = Math.pow(x2-x1, 2.0);
		potencia2 = Math.pow(y2-y1, 2.0);
		distancia = Math.sqrt(potencia1+potencia2) ;
		System.out.printf("A distância entre esses pontos é: %.2f.", distancia);
		
	}

}
