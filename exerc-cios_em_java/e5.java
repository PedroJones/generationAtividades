package exerciciosJava;

import java.util.Scanner;


public class e5 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, nota3, mediaPonderada;
		System.out.println("Insira a primeira nota: ");
		nota1=ler.nextDouble();
		System.out.println("Insira a segunda nota: ");
		nota2=ler.nextDouble();
		System.out.println("Insira a terceira nota: ");
		nota3=ler.nextDouble();
		mediaPonderada = ((nota1*2) + (nota2*3) + (nota3*5))/10;
		System.out.println("Sua média ponderada é: " + mediaPonderada);
}
}