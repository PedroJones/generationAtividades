programa
{
	
	funcao inicio()
	{
		inteiro M[3][3],linha,coluna,soma=0,somaDiagonal=0
		
		para (linha=0;linha<3;linha++){
			
			para(coluna=0;coluna<3;coluna++){
				escreva("Entre com um valor para a matriz: ")
				leia(M[linha][coluna])
				soma+=M[linha][coluna]
				
				
			}
		}
		somaDiagonal=M[0][0]+M[1][1]+M[2][2]
		escreva("A soma dos elementos da matriz é: ",soma,".\n")
		escreva("A soma da diagonal princiapal da matriz é ",somaDiagonal,".")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 387; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {M, 6, 10, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */