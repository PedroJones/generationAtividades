package POO_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class e3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler= new Scanner(System.in);
		String produto;
		int x=0;
		List <String> estoque = new ArrayList();
		do {
			System.out.println("-----------Por favor, selecione o que você deseja fazer com o estoque: -------------");
			System.out.println("\n0-Para sair do programa.\n1-Adicionar um item. \n2-Remover um item. \n3-Atualizar itens. \n4-Apresentar itens.");
			x=ler.nextInt();
			ler.nextLine();
			switch (x) {
				case 0:
					break;
				case 1:
					System.out.println("Por favor, informe o item que você gostaria de adcionar: ");
					produto=ler.nextLine();
					estoque.add(produto);
					System.out.println("O item "+produto+" foi adicionado! O estoque agora está assim: "+estoque+".\n");
				break;
				case 2:
					System.out.println("Por favor, informe o item que gostaria de remover: ");
					produto=ler.nextLine();
					if (estoque.contains(produto)) {
						estoque.remove(produto);
						System.out.println("O item "+produto+" foi removido! Seu estoque agora está assim: "+estoque+".\n");
						}
					else {
						System.out.println("Esse item não está no estoque.\n");
					}
					break;
				case 3:
					System.out.println("Vamos atualizar o estoque. Por favor, informe o item que gostaria de remover: ");
					produto=ler.nextLine();
					if (estoque.contains(produto)) {
						estoque.remove(produto);
						System.out.println("O item "+produto+" foi removido! Seu estoque agora está assim: "+estoque+".\n");
						System.out.println("\nAgora informe o item que gostaria de adicionar: ");
						produto=ler.nextLine();
						estoque.add(produto);
						System.out.println("O item "+produto+" foi adicionado! O estoque agora está assim: "+estoque+".\n");
						}
					else {
						System.out.println("Esse item não está no estoque.\n");
					}
					
					break;
				case 4: 
					System.out.println("Os itens do seu estoque até agora são"+estoque+".\n");
					break;
				default:
					System.out.println("Opção inválida.\n");
					break;
			}
		}while(x!=0);
		System.out.println("\nSeu estoque final ficou assim: "+estoque+". Até logo!");
	}

}
