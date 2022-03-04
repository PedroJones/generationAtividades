package exercicioslacocondicional;
import java.util.Scanner;
public class e2 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int x,y,z;
		System.out.println("Informe o número: ");
		x=ler.nextInt();
		System.out.println("Informe o número: ");
		y=ler.nextInt();
		System.out.println("Informe o número: ");
		z=ler.nextInt();
		if(x>=y && x>=z) {
			if (y>=z) {
				System.out.println("A ordem crescente dos números é:\n"+z+"\n"+y+"\n"+x);
			}
			else {
				System.out.println("A ordem crescente dos números é:\n"+y+"\n"+z+"\n"+x);
			}
		}
		if(y>=x && y>=z) {
			if (x>=z) {
				System.out.println("A ordem crescente dos números é:\n"+z+"\n"+x+"\n"+y);
			}
			else {
				System.out.println("A ordem crescente dos números é:\n"+x+"\n"+z+"\n"+y);
			}
		}
		if(z>=y && z>=x) {
			if (y>=x) {
				System.out.println("A ordem crescente dos números é:\n"+x+"\n"+y+"\n"+z);
			}
			else {
				System.out.println("A ordem crescente dos números é:\n"+y+"\n"+x+"\n"+z);
			}
		}
}
}