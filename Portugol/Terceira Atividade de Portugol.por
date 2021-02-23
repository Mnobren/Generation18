programa
{
	funcao inicio()
	{
		inteiro zero = 0
		inteiro index
		real x
	
		escreva("Olá !\n")
		enquanto(zero == 0)
		{
			escreva("\nDigite um número para selecionar um programa... \n")
			leia(index)
			escreva("\n")
			se (index == 1)
			{
				x = 0.0
				cadeia responder = "sim"
				inteiro i = 0
				real soma = 0.0
				inteiro filhos = 0
				real maior = 0.0
				real baixo = 0.0
				
				escreva("1 - Calculador de Estatíticas\n")
				para(i = 0; i < 20; i++)
				{
					escreva("\nOlá cidadão. Por favor, responda:\n")
					escreva("Qual o seu salário ?\n")
					leia(x)
					soma = soma + x
					se (maior < x) {maior = x}
					se (x <= 100.00) {baixo = baixo + 1}
					escreva("Quantos filhos você tem ?\n")
					leia(x)
					filhos = filhos + x
				}
				real medfil = filhos/i
				escreva("\nA média do salário da população é de "+(soma / i)+", "+(baixo/i*100)+"% da população")
				escreva("\ntem um salário menor ou igual a 100,00 R$, o maior salário registrado é de "+maior+",")
				escreva("\na média da quantidade de filhos é de "+medfil+".\n")
			}
			///
			se (index == 2)
			{
				x = 0.0
				cadeia responder = "sim"
				inteiro contador = 0
				inteiro limite
				real soma = 0.0
				
				escreva("2 - Análise de Dados\n")
				escreva("\nQuantos números serão inseridos ?\n")
				leia(limite)
				escreva("\n")
				para(inteiro i = 0; i < limite; i++)
				{
					escreva("Digite o "+(contador+1)+"º número: ")
					leia(x)
					inteiro y = x
					se(y % 2 == 1 e y % 3 == 0 e 0 < x e x <= 500)
					{
						soma = soma + x
					}
					contador = contador + 1
				}
				escreva("\nA soma dos valores inseridos que são ímpares, múltiplos de três, maiores que 0")
				escreva("\ne também menores ou iguais a 500 é: "+soma+". \n")
			}
			///
			se (index == 3)
			{
				x = 0.0
				inteiro contador = 0
				real soma = 0.0
				
				escreva("3 - Calculador de Estatíticas\n\n")
				enquanto(x >= 0)
				{
					soma = soma + x
					escreva("valores inseridos: "+contador)
					escreva("\nsoma dos valores: "+soma)
					escreva("\nmedia dos valores: "+(soma/contador))
					contador = contador + 1
					escreva("\n")
					escreva("\nInsira o "+contador+"º valor : \n")
					leia(x)
				}
			}
			///
			se (index == 4)
			{
				x = 0.0
				inteiro contador = 0
				
				escreva("4 - Calculador de Cubo\n")
				escreva("\nDigite o valor desejado: ")
				leia(x)
				se(x > 1)
				{
					escreva("\nValores resultantes:\n")
					escreva(" "+x+", ")
					enquanto(x <= 100)
					{
						x = x * 3
						escreva(" "+x+", ")
					}
				}
				senao
				{
					escreva("\nAtenção, valor inválido.\n")
				}
				escreva("\n")
			}
			///
			se (index == 5)
			{
				inteiro contagem = 233
				inteiro passo = 5
				inteiro linha = 0
				
				escreva("5 - Incrementando Passos\n")
				escreva("\nIniciando contagem...\n")
				escreva("\n233")
				faca
				{
					
					linha = linha + 1
					se (linha > 10) {escreva("\n") linha = 0}
					senao {escreva(", ")}
					se (300 < contagem e contagem < 400) {passo = 3}
					senao {passo = 5}
					contagem = contagem + passo
					escreva(contagem)
				}
				enquanto (contagem < 456)
				escreva("\n")
			}
			///
			se (index == 6)
			{
				x = 0.0
				inteiro contagem = 0
				inteiro soma = 0
				
				escreva("6 - Somando a Contagem\n")
				escreva("\nDigite um valor: ")
				leia(x)
				faca
				{
					contagem = contagem + 1
					soma = soma + contagem
				}
				enquanto (contagem < x)
				escreva("\nA soma de todos os números inteiros que precedem\n")
				escreva("o "+x+" é igual a : "+soma+".\n")				
			}
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3586; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */