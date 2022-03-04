package TestRPG;
import java.util.Scanner;
public class testMago {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mago mago=new Mago ();
		Scanner ler = new Scanner(System.in);
		String magia = ler.nextLine();
		int danoMin = ler.nextInt();
		int danoMax = ler.nextInt();
		mago.setArma(magia,danoMin,danoMax);
		System.out.println(mago.getArma());
	}

}
