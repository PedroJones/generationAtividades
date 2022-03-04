package lacocondicional;
import java.util.Scanner;
public class e3 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int idade=0,i1=0,i2=0;
		while(idade!=-99) {
			System.out.println("Informe a idade de uma pessoa (não o faça, porém, caso ela tenha -99 anos): ");
			idade=ler.nextInt();
			if (idade==-99) {
				System.out.println("O programa foi parado.");
				break;
			}
			else if (idade>50) {
				i2++;
			}
			else if (idade<21) {
				i1++;
			}
			
		}
		System.out.println("O número de pessoas com menos de 21 anos é: "+i1+".");
		System.out.println("O número de pessoas com mais de 50 anos é: "+i2+".");
	}
}