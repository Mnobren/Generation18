package AulaTratamento;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteErros
{
	public static void main(String[] args)
	{
		int numero = 0;
		String[] nomes = {"J�ao", "Maria", "Pedro"};
		
		try
		{
			numero = Pergunta();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Voc� digitou uma letra ao inv�s de um n�mero.");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Voc� digitou um �ndice que n�o existe.");
		}
		finally
		{
			numero = Pergunta();
		}
		System.out.println("O nome escolhido foi: "+nomes[numero]);
	}
	
	public static int Pergunta()
	{
		int numero;
		Scanner s = new Scanner(System.in);
		System.out.print("Digite o valor do �ndex: ");
		numero = s.nextInt();
		return numero;
	}
}