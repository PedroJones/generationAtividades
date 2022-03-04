package exerciciosJava;

import java.util.Scanner;

public class e4 {
	public static void main(String args[]) {
		double A, B, C, D, R, S;
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira um número: ");
		A=ler.nextDouble();
		System.out.println("Insira um número: ");
		B=ler.nextDouble();
		System.out.println("Insira um número: ");
		C=ler.nextDouble();
		S = Math.pow((A+B), 2.0);
		R = Math.pow((B+C), 2.0);
		D = (R+S)/2;
		System.out.println("Resultado de D é: " + D);
		
		
	}
}
