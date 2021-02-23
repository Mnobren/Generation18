programa
{
	funcao inicio()
	{
		inteiro index
		///
		real peso
		real excesso
		real multa
		///
		inteiro codigo
		real horas
		real extras
		real pagamento1
		real pagamento2
		///
		real n1
		real n2
		real n3
		real n4
		///
		inteiro int
		///
		real poluicao

		escreva("Digite um número de 1 até 5 para selecionar um programa: \n")
		leia(index)

		/*////////*/escreva("\n")

		se (index == 1)
		{
			escreva("Calculando a Multa do Tomate\n\n")
			escreva("Digite o peso do tomate... \n")
			leia(peso)
			excesso = peso - 50
			se (excesso < 0) {excesso = 0.0}
			multa = excesso * 4.00
			escreva("peso: "+peso+" Kg.\n")
			escreva("excesso: "+excesso+" Kg.\n")
			escreva("multa: "+multa+" R$.\n")

			/*////////*/escreva("\n")
		}

		se (index == 2)
		{
			escreva("Calculando o Salário\n\n")
			escreva("Digite o código... \n")
			leia(codigo)
			escreva("Digite a quantidade de horas... \n")
			leia(horas)
			extras = horas - 50
			se (extras < 0) {extras = 0.0}
			se (horas > 50) {horas = 50.0}
			pagamento1 = horas * 10.0
			pagamento2 = extras * 20.00
			escreva("Salário total : "+(pagamento1+pagamento2)+".\n")
			escreva("Salário excedente : "+pagamento2+".\n")

			/*////////*/escreva("\n")
		}

		se (index == 3)
		{
			escreva("Calculando o Quadrado\n\n")
			escreva("Digite o primeiro valor... ")
			leia(n1)
			escreva("\nDigite o segundo valor... ")
			leia(n2)
			escreva("\nDigite o terceiro valor... ")
			leia(n3)
			escreva("\nDigite o quarto valor... ")
			leia(n4)
			n1 = n1 * n1
			n2 = n2 * n2
			n3 = n3 * n3
			n4 = n4 * n4
			escreva("\n")
			se (n3 >= 1000)
			{
				escreva("\nO quadrado do terceiro valor é "+n3+".")
			}
			senao
			{
				escreva("Quadrado do primeiro valor: "+n1+".\n")
				escreva("Quadrado do segundo valor: "+n2+".\n")
				escreva("Quadrado do terceiro valor: "+n3+".\n")
				escreva("Quadrado do quarto valor: "+n4+".\n")
			}

			/*////////*/escreva("\n")
		}
		
		se (index == 4)
		{
			escreva("Análisando um Número\n\n")
			escreva("Digite um numero inteiro... ")
			leia(int)
			se (int < 0)
			{
				escreva("O "+int+" é um número negativo ")
			}
			senao
			{
				escreva("O "+int+" é um número positivo ")
			}
			se ((int % 2) == 0)
			{
				escreva("par.\n")
			}
			senao
			{
				escreva("impar.\n")
			}
		}
		
		se (index == 5)
		{
			escreva("Análisando a Poluição\n\n")
			escreva("Digite o índice de poluíção atual: \n")
			leia(poluicao)
			se (poluicao < 0.3)
			{
				escreva("\nNada a relatar.\n")	
			}
			se (poluicao >= 0.3)
			{
				escreva("\nATENÇÃO\n")
				escreva("As empresas do 1º grupo estão intimadas a suspenderem suas atividades.\n")	
			}
			se (poluicao >= 0.4)
			{
				escreva("As empresas do 2º grupo também estão intimadas a suspenderem suas atividades.\n")	
			}
			se (poluicao >= 0.5)
			{
				escreva("As empresas do 3º grupo também estão intimadas a suspenderem suas atividades.\n")	
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2644; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */