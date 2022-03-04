package exercicios_arrays_matrizes;

//2- Faça um programa que receba 6 números inteiros e mostre: 
//• Os números pares digitados;  
//• A soma dos números pares digitados; 
//• Os números ímpares digitados; 
//• A quantidade de números ímpares digitados.
import java.util.Scanner;
public class e2 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int [6];
		int x,somaPar=0,contImpar=0;
		for (x=0;x<6;x++) {
			System.out.println("Informe um número: ");
			vetor[x]=ler.nextInt();
		}
		System.out.println("Os números pares são: ");
		for(x=0;x<6;x++) {
			if (vetor[x]%2==0) {
				System.out.println(vetor[x]);
				somaPar+=vetor[x];
			}
			else {
				contImpar++;
			}
		
		}
		System.out.println("A soma dos números pares foi: "+somaPar+".");
		System.out.println("Os números ímpares são: ");
		for(x=0;x<6;x++) {
			if(vetor[x]%2!=0) {
			System.out.println(vetor[x]);
			}
		}
	
		
		System.out.println("A quantidade de números ímpares foi: "+contImpar+".");
		
	}
}
