
package exercicioslacocondicional;
import java.util.Scanner;
public class e1 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int x,y,z;
		System.out.println("Informe o número: ");
		x=ler.nextInt();
		System.out.println("Informe o número: ");
		y=ler.nextInt();
		System.out.println("Informe o número: ");
		z=ler.nextInt();
		if(x>y && x>z) {
			System.out.println("O maior número é: "+x+".");
		}
		else if (y>x && y>z) {
			System.out.println("O maior número é: "+y+".");
		}
		else {
			System.out.println("O maior número é: "+z+".");
		}
}
}