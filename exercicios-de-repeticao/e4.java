package lacocondicional;
import java.util.Scanner;
public class e4 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int x=0,i,s,t,c=0,n=0,a=0,n2=0,c1=0,c2=0;
		while(x<5) {
			System.out.println("Informe a sua idade: ");
			i=ler.nextInt();
			System.out.println("Informe o seu sexo:\nHomem - 1\nMulher - 2\nOutro - 3 ");
			s=ler.nextInt();
			System.out.println("Informe o seus temperamento: \nCalmo - 1\nNervoso - 2\nAgressivo - 3");
			t=ler.nextInt();
			switch (t) {
				case 1: 
					c++;
					if(s==3) {
						c1++;
					}
					if (i<18) {
						c2++;
					}
					break;
				case 2:
					if(s==2) {
						n++;
					}
					if (i>40) {
						n2++;
					}
					break;
				case 3:
					if(s==1) {
						a++;
					}
					break;
			}
			x++;
	}
		System.out.println("O número de pessoas calmas é: "+c);
		System.out.println("O número de mulheres nervosas é: "+n);
		System.out.println("O número de homens agressivos é: "+a);
		System.out.println("O número de outros calmos é: "+c1);
		System.out.println("O número de pessoas neverosas com mais de 40 é: "+n2);
		System.out.println("O número de pessoas calmas com menos de 18 é: "+c2);
 }
}
