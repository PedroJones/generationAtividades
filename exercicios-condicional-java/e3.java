package exercicioslacocondicional;
import java.util.Scanner;
public class e3 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.println("Informe a sua idade: ");
		idade=ler.nextInt();
		if(idade>=10 && idade<=14) {
			System.out.println("Voc� est� na categoria infantil.");
		}
		else if(idade>=15 && idade<=17) {
			System.out.println("Voc� est� na categoria juvenil.");
		}
		else if(idade>=18 && idade<=25) {
			System.out.println("Voc� est� na categoria adulto.");
		}
		else {
			System.out.println("Esta idade n�o est� em nenhuma categoria.");
		}
}	
}