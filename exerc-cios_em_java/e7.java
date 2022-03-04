package exerciciosJava;
import java.util.Scanner;
public class e7 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double a,b,c,d,e,f,x,y;
		System.out.println("Informe o coeficiente a: ");
		a=ler.nextDouble();
		System.out.println("Informe o coeficiente b: ");
		b=ler.nextDouble();
		System.out.println("Informe o coeficiente c: ");
		c=ler.nextDouble();
		System.out.println("Informe o coeficiente d: ");
		d=ler.nextDouble();
		System.out.println("Informe o coeficiente e: ");
		e=ler.nextDouble();
		System.out.println("Informe o coeficiente f: ");
		f=ler.nextDouble();

		x = (((c*e)-(b*f))/((a*e)-(b*d)));
		y = (((a*f)-(c*d))/((a*e)-(b*d)));
		
		
		System.out.printf("O valor de x é: %.2f. \nO valor de y é: %.2f.",x , y);
		
}		
}