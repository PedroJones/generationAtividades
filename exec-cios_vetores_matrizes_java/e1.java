package exercicios_arrays_matrizes;

public class e1 {
	public static void main(String args[]) {
		int[] vetor = new int[] {1,0,5,-2,-5,7};
		int somaVetor=vetor[0]+vetor[1]+vetor[5];
		System.out.println("A soma das posições 0,1 e 5 do vetor é: "+ somaVetor+".");
		vetor[4]=100;
		System.out.println("Os números do vetor são:");
		for(int mostraVetor:vetor) {
			System.out.println(mostraVetor);
		}
		
	}

}
