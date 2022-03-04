package exercicios_arrays_matrizes;
import java.util.Scanner;
//4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
//(1) somar as duas matrizes 
//(2) subtrair a primeira matriz da segunda 
//(3) adicionar uma constante as duas matrizes
//(4) imprimir as matrizes 
//Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.

public class e4 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int[][] matriz = new int[2][2];
		int[][] matriz2 = new int[2][2];
		int opcao=0;
		for(int linha=0;linha<2;linha++) {
			for(int coluna=0;coluna<2;coluna++) {
				System.out.println("Informe um número para a matriz 1: ");
				matriz[linha][coluna]=ler.nextInt();
			}
		}
		for(int linha=0;linha<2;linha++) {
			for(int coluna=0;coluna<2;coluna++) {
				System.out.println("Informe um número para a matriz 2: ");
				matriz2[linha][coluna]=ler.nextInt();
			}
		}
		while(opcao<=0 || opcao>4) {
		System.out.println("Escolha o que deseja fazer com as matrizes:\n1 - Soma-las.\n2 - Subtraí-las\n3 - Adicionar uma constante à elas.\n4 - Imprimi-las.");
		opcao=ler.nextInt();
	}
		switch (opcao) {
			case 1:  
				int[][] matriz3 = new int[2][2];
				System.out.println("A soma das duas matrizes é: ");
				for(int linha=0;linha<2;linha++) {
					for(int coluna=0;coluna<2;coluna++) {
						matriz3[linha][coluna]=matriz[linha][coluna]+matriz2[linha][coluna];
						System.out.printf("[%d]",matriz3[linha][coluna]);
					}
					System.out.println();
				}
				break;
			case 2:  
				int[][] matriz4 = new int[2][2];
				System.out.println("A substração das duas matrizes é: ");
				for(int linha=0;linha<2;linha++) {
					for(int coluna=0;coluna<2;coluna++) {
						matriz4[linha][coluna]=matriz[linha][coluna]-matriz2[linha][coluna];
						System.out.printf("[%d]",matriz4[linha][coluna]);
					}
					System.out.println();
				}
				break;
			case 3:
				int[][] matriz5 = new int[2][2];
				int[][] matriz6 = new int[2][2];
				System.out.println("Informe um número para adcionar nas matrizes: ");
				int n=ler.nextInt();
				System.out.println("Se adicionarmos "+n+" às matrizes o resultado fica:");
				for(int linha=0;linha<2;linha++) {
					for(int coluna=0;coluna<2;coluna++) {
						matriz5[linha][coluna]=matriz[linha][coluna]+n;
						System.out.printf("[%d]",matriz5[linha][coluna]);
					}
					System.out.println();
				}
					System.out.println();
				for(int linha=0;linha<2;linha++) {
					for(int coluna=0;coluna<2;coluna++) {
						matriz6[linha][coluna]=matriz2[linha][coluna]+n;
						System.out.printf("[%d]",matriz6[linha][coluna]);
					}
					System.out.println();
				}
				break;
			
			case 4:
				System.out.println("A matriz 1 e a matriz 2 são, respectivamente: ");
				for(int linha=0;linha<2;linha++) {
					for(int coluna=0;coluna<2;coluna++) {
						System.out.printf("[%d]",matriz[linha][coluna]);
					}
					System.out.println();
				}
				System.out.println("\n");
				for(int linha=0;linha<2;linha++) {
					for(int coluna=0;coluna<2;coluna++) {
						System.out.printf("[%d]",matriz2[linha][coluna]);
					}
					System.out.println();
				}
				break;
		}
 }	
}