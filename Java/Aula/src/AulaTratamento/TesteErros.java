package AulaTratamento;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteErros
{
	public static void main(String[] args)
	{
		int numero = 0;
		String[] nomes = {"Jõao", "Maria", "Pedro"};
		
		try
		{
			numero = Pergunta();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Você digitou uma letra ao invés de um número.");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Você digitou um índice que não existe.");
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
		System.out.print("Digite o valor do índex: ");
		numero = s.nextInt();
		return numero;
	}
}