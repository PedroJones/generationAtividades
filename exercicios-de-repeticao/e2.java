package lacocondicional;
import java.util.Scanner;
public class e2 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int x, n,contPar=0,contImpar=0;
		for(x=1;x<=10;x++) {
			System.out.println("Informe um n�mero: ");
			n=ler.nextInt();
			if (n%2==0) {
				contPar++;
			}
			else {
				contImpar++;
			}
		}
		System.out.println("O n�mero de pares foi: "+contPar+".");
		System.out.println("O n�mero de �mpares foi: "+contImpar+".");
	}
}