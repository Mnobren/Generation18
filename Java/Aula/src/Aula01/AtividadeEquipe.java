package Aula01;

import java.util.Scanner;

public class AtividadeEquipe
{
	public static void main(String[] args)
	{
		int num;
		int maior = 0;
		
		Scanner s = new Scanner(System.in);

		System.out.println("Digite um número :");
		num = s.nextInt();

		if (num > 0)
		{
			while(num > 0)
			{
				if(maior < num) {maior = num;}
				System.out.println("Digite mais um número :");
				num = s.nextInt();
			}
			System.out.print("O maior número é "+maior+".");
		}
		else
		{
			System.out.print("Nenhum número válido inserido.");
		}

	}
}