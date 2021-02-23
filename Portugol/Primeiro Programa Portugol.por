programa
{
	
	funcao inicio()
	{
		inteiro anos
		inteiro meses
		inteiro dias
		real vida
		//
		real a
		real b
		real c
		//
		real nota1
		real nota2
		real nota3

		escreva("Prog1 - Calculando a Idade\n\n")
	
		escreva("Digite qual a sua idade...\n")
		leia(anos)
		escreva("e quantos meses...\n")
		leia(meses)
		escreva("e quantos dias...\n")
		leia(dias)
		inteiro x = meses+(anos*12)
		vida = dias+(x*30)
		escreva("Você viveu aproximadamente "+vida+" dias.\n")

		escreva("\n")
		
		escreva("Digite quantos dias você tem de vida...\n")
		leia(vida)
		inteiro v = vida
		dias = v%30
		inteiro m = vida/30
		meses = m%12
		anos = m/12
		escreva("Você viveu aproximadamente "+anos+" anos, "+meses+" meses e "+dias+" dias.\n")

		/*//////////*/escreva("\n")
		escreva("Prog2 - Calculando a equação\n\n")
		
		escreva("Digite o valor de A...\n")
		leia(a)
		escreva("Digite o valor de B...\n")
		leia(b)
		escreva("Digite o valor de C...\n")
		leia(c)
		real r = (a+b)*(a+b)
		real s = (b+c)*(b+c)
		real d = (r+s)/2
		escreva("O resultado é igual a "+d+".\n")

		/*//////////*/escreva("\n")
		escreva("Prog3 - Tirando a média final\n\n")

		escreva("Digite a primeira nota...\n")
		leia(nota1)
		escreva("Digite a segunda nota...\n")
		leia(nota2)
		escreva("Digite a terceira nota...\n")
		leia(nota3)
		real m1 = nota1/5//<nota1/100*20>
		real m2 = nota2/100 * 30
		real m3 = nota3/2//<nota3/100*50>
		real media = m1+m2+m3
		escreva("Sua média final é "+media+".")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 814; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */