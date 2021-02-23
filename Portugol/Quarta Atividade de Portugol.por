programa
{
	inteiro num = 0
	///
	real vetor[5]
	real compara = 0
	inteiro maior
	///
	inteiro dados[10]
	inteiro soma = 0
	inteiro repetido = 0
	inteiro vezes = 0
	///
	real N1[4][6]
	real N2[4][6]
	real M1[4][6]
	real M2[4][6]
	///
	real matriz[3][3]
	real som = 0
	real sum = 0
	
	funcao inicio()
	{
		escreva("Digite o número do exercício (1-4) : ")
		leia(num)
		se (num == 1) {Ex1()}
		se (num == 2) {Ex2()}
		se (num == 3) {Ex3()}
		se (num == 4) {Ex4()}
	}

	funcao Ex1()
	{
		escreva("\nExercício 1\n\n")
		escreva("Digite as pontuações da atividade.\n")
		para (inteiro i = 0; i < 5; i++)
		{
			real x
			escreva("Digite a "+(i+1)+"ª pontuaçao: ")
			leia(vetor[i])
		}
		para (inteiro i = 0; i < 5; i++)
		{
			se (compara < vetor[i]) {compara = vetor[i] maior = i}
		}
		escreva("\nA maior pontuação inserida é a pontuação "+(maior+1)+" de valor "+compara+"\n")
	}

	funcao Ex2()
	{
		escreva("\nExercício 2\n\n")
		escreva("Digite os valores do dado.\n")
		para (inteiro i = 0; i < 10; i++)
		{
			real x
			escreva("Digite o valor do "+(i+1)+"º dado: ")
			leia(dados[i])
			se (repetido < dados[i]) {repetido = dados[i]}
		}
		para (inteiro i = 0; i < 10; i++)
		{
			soma = soma + dados[i]
			se (dados[i] == repetido)
			{
				vezes = vezes + 1
			}
		}
		escreva("\nA média dos dados foi "+(soma/10)+" e o maior valor ("+repetido+") apareceu "+vezes+" vezes.\n")
	}

	funcao Ex3()
	{
		escreva("\nExercício 3\n")
		escreva("\nDigite os valores da matriz N1(4,6).\n")
		para (inteiro i = 0; i < 4; i++)
		{
			para (inteiro j = 0; j < 6; j++)
			{
				escreva("Digite o valor ["+i+"]["+j+"]: ")
				leia(N1[i][j])
			}
		}
		escreva("\nDigite os valores da matriz N2(4,6)\n8")
		para (inteiro i = 0; i < 4; i++)
		{
			para (inteiro j = 0; j < 6; j++)
			{
				escreva("Digite o valor ["+i+"]["+j+"]: ")
				leia(N2[i][j])
			}
		}
		para (inteiro i = 0; i < 4; i++)
		{
			para (inteiro j = 0; j < 6; j++)
			{
				M1[i][j] = N1[i][j] + N2[i][j]
				M2[i][j] = N1[i][j] - N2[i][j]
			}
		}
		escreva("\nAs matrizes N1 e N2 foram somadas em uma matriz M1.")
		escreva("\nAs matrizes N1 e N2 foram subtraídas em uma matriz M2.\n")
	}

	funcao Ex4()
	{
		escreva("\nExercício 4\n")
		escreva("\nDigite os valores da matriz 3x3.\n")
		para (inteiro i = 0; i < 3; i++)
		{
			para (inteiro j = 0; j < 3; j++)
			{
				escreva("Digite o valor ["+i+"]["+j+"]: ")
				leia(matriz[i][j])
				som = som + matriz[i][j]
				se (i == j)
				{
					sum = sum + matriz[i][j]
				}
			}
		}
		escreva("\nA soma de todos os valores na matriz é igual a "+som+" e a\n")
		escreva("soma de todos os valores na diagonal principal é "+sum+"\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 413; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */