package lacocondicional;

public class e1 {
	public static void main(String args[]) {
		int x;
		System.out.println("Os n�meros entre 1000 a 1999 que divididos por 11 obtemos o resto 5 s�o: ");
		for (x=1000;x<=1999;x++) {
			if (x%11==5) {
				System.out.println(x);
			}
		}
	}
}
