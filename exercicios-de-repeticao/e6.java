package lacocondicional;
import java.util.Scanner;
public class e6 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int n,soma=0,media=0,contN=0;
		do {
			System.out.println("Informe um número (se quiser para o programa digite 0): ");
			n=ler.nextInt();
			if (n==0) {
				System.out.println("O programa parou.");
				}
			else if (n%3==0) {
				soma+=n;
				contN++;
			}
		} while(n!=0);
		
		if(contN!=0) {
			media=soma/contN;
		}
		System.out.println("A média dos números é: "+media+".");
 }
}