programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro vetor[10],soma=0,somaMaior=0,maior=0,contMaior=0,media=0,x
		
	

		para (x=0;x<10;x++){
			vetor[x]=Util.sorteia(1, 6)
			se(maior<vetor[x]){
				maior=vetor[x]
			}
			
			soma+=vetor[x]
		}
		para(x=0;x<10;x++){
			se(vetor[x]==maior){
				contMaior++
				somaMaior+=maior
			}
		}
		media=soma/10
		escreva("A média dos lançamentos é: ",media,".\n")
		escreva("A soma do maior número foi: ",somaMaior,".\n")
		escreva("O maior número foi ",maior," e ele aparenceu ",contMaior," vez(es).")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 129; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 7, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */