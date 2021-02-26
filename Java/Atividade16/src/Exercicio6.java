import java.util.Scanner;

public class Exercicio6
{
	public static void main(String[] args)
	{
		double num;
		double soma = 0;
		int lista = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Exercício 6");

		var indice = 0;
		do
		{
			indice++;
			System.out.print("Digite o "+indice+" número: ");
			num = s.nextInt();
			if(num%3 == 0)
			{
				soma = soma + num;
				lista = lista + 1;
			}
		}
		while(num != 0);
		System.out.println("\nHá "+lista+" multiplos de três, os quais a média é "+(soma/lista)+".");
	}
}
