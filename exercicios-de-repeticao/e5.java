package lacocondicional;
public class e5 {
	public static void main(String args[]) {
	double x,soma=0;
	do {
		x=Math.round(Math.random() * 10);
		System.out.println(x);
		soma=soma+x;
	} while (x!=0);
	System.out.println("A soma dos números foi: "+ soma +".");
 }
}