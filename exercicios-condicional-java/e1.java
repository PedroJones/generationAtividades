
package exercicioslacocondicional;
import java.util.Scanner;
public class e1 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int x,y,z;
		System.out.println("Informe o n�mero: ");
		x=ler.nextInt();
		System.out.println("Informe o n�mero: ");
		y=ler.nextInt();
		System.out.println("Informe o n�mero: ");
		z=ler.nextInt();
		if(x>y && x>z) {
			System.out.println("O maior n�mero �: "+x+".");
		}
		else if (y>x && y>z) {
			System.out.println("O maior n�mero �: "+y+".");
		}
		else {
			System.out.println("O maior n�mero �: "+z+".");
		}
}
}