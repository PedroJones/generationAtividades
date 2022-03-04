programa
{

	
	funcao inicio()
	{
		inteiro N1[2][3],N2[2][3],M1[2][3],M2[2][3], linha,coluna
		
		para (linha=0;linha<2;linha++){
			
			para(coluna=0;coluna<3;coluna++){
				escreva("Entre com um valor para N1: ")
				leia(N1[linha][coluna])
				escreva("Entre com um valor para N2: ")
				leia(N2[linha][coluna])
				
			}
		}
		limpa()
		escreva("A matriz M1 é: \n")
		para (linha=0;linha<2;linha++){
			
			para(coluna=0;coluna<3;coluna++){

				M1[linha][coluna]=N1[linha][coluna]+N2[linha][coluna]
				escreva("[",M1[linha][coluna],"]")
				
			}
			escreva("\n")
		}
		escreva("\nA matriz M2 é: \n")
		para (linha=0;linha<2;linha++){
			
			para(coluna=0;coluna<3;coluna++){

				M2[linha][coluna]=N1[linha][coluna]-N2[linha][coluna]
					escreva("[",M2[linha][coluna],"]")
				
			}
			escreva("\n")
		}
		
		

		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 339; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {M1, 7, 28, 2}-{M2, 7, 37, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */