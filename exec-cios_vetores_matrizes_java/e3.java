package exercicios_arrays_matrizes;
import java.util.Scanner;
// 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
public class e3 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int contN=0;
		for(int linha=0;linha<3;linha++) {
			for(int coluna=0;coluna<3;coluna++) {
				System.out.println("Informe um número: ");
				matriz[linha][coluna]=ler.nextInt();
				if(matriz[linha][coluna]>10) {
					contN++;
			 }
			}
		  }
		System.out.println("Essa matriz possuí "+contN+" números maiores que 10.");
		}
}
