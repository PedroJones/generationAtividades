package lacocondicional;

public class e1 {
	public static void main(String args[]) {
		int x;
		System.out.println("Os números entre 1000 a 1999 que divididos por 11 obtemos o resto 5 são: ");
		for (x=1000;x<=1999;x++) {
			if (x%11==5) {
				System.out.println(x);
			}
		}
	}
}
