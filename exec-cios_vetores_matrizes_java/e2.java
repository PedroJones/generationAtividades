package exercicios_arrays_matrizes;

//2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
//� Os n�meros pares digitados;  
//� A soma dos n�meros pares digitados; 
//� Os n�meros �mpares digitados; 
//� A quantidade de n�meros �mpares digitados.
import java.util.Scanner;
public class e2 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int [6];
		int x,somaPar=0,contImpar=0;
		for (x=0;x<6;x++) {
			System.out.println("Informe um n�mero: ");
			vetor[x]=ler.nextInt();
		}
		System.out.println("Os n�meros pares s�o: ");
		for(x=0;x<6;x++) {
			if (vetor[x]%2==0) {
				System.out.println(vetor[x]);
				somaPar+=vetor[x];
			}
			else {
				contImpar++;
			}
		
		}
		System.out.println("A soma dos n�meros pares foi: "+somaPar+".");
		System.out.println("Os n�meros �mpares s�o: ");
		for(x=0;x<6;x++) {
			if(vetor[x]%2!=0) {
			System.out.println(vetor[x]);
			}
		}
	
		
		System.out.println("A quantidade de n�meros �mpares foi: "+contImpar+".");
		
	}
}
