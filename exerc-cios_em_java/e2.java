package exerciciosJava;

import java.util.Scanner;

public class e2 {
	public static void main(String args[]) {
		int anos, meses, dias, idadeEmDias;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe a sua idade: ");
		idadeEmDias=ler.nextInt();
		anos = idadeEmDias/365;
		meses = (idadeEmDias%365)/30;
		dias = (idadeEmDias%365)%30;
		System.out.println("Você tem: "+ anos+ " anos "+ meses+ " meses e  "+ dias+" dias.");
		
		
	}
}
