import java.util.Scanner;

public class Exercicio6
{
	public static void main(String[] args)
	{
		double num;
		double soma = 0;
		int lista = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Exerc�cio 6");

		var indice = 0;
		do
		{
			indice++;
			System.out.print("Digite o "+indice+" n�mero: ");
			num = s.nextInt();
			if(num%3 == 0)
			{
				soma = soma + num;
				lista = lista + 1;
			}
		}
		while(num != 0);
		System.out.println("\nH� "+lista+" multiplos de tr�s, os quais a m�dia � "+(soma/lista)+".");
	}
}
