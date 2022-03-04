package exerciciosJava;

import java.util.Scanner;

public class e3 {
	public static void main(String args[]) {
		int segundos, minutos, horas;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o evento em segundos: ");
		segundos=ler.nextInt();
		horas=segundos/3600;
		minutos=(segundos%3600)/60;
		segundos=(segundos%3600)%60;
		System.out.println("O evento teve " + horas+ " horas, " + minutos+ " minutos e " + segundos+" segundos.");
		
		
	}
}
