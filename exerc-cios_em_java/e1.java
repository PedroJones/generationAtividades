package exerciciosJava;

import java.util.Scanner;

public class e1 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias, totalDias;
		System.out.println("Quantos anos voc�s tem? ");
		anos=ler.nextInt();
		System.out.println("Quantos meses voc� tem? ");
		meses=ler.nextInt();
		System.out.println("Quantos dias voc�s tem? ");
		dias=ler.nextInt();
		totalDias = (anos*365)+(meses*30)+dias; 
		System.out.println("O seu total de dias vividos foi: " + totalDias +".");
	
	
		
		
	}
}
