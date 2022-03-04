programa
{
	
	funcao inicio()
	{
		inteiro p,maior=0
		inteiro vetor[5]
		inteiro x

		para (x=0;x<5;x++){
			escreva("Qual é o valor da pontuação? ")
			leia(p)
			vetor[x]=p
			se (maior<p){
				maior=p
			}
			
		}
		para (x=0;x<5;x++){
		escreva("O valor do ponto ",x+1, " é ",vetor[x],".\n")
		}
			
		escreva("O maior valor é: ", maior,".")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 245; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {maior, 6, 12, 5}-{vetor, 7, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */