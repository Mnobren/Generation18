package Aula01;

import java.util.Scanner;

public class AtividadeEquipe
{
	public static void main(String[] args)
	{
		int num;
		int maior = 0;
		
		Scanner s = new Scanner(System.in);

		System.out.println("Digite um n�mero :");
		num = s.nextInt();

		if (num > 0)
		{
			while(num > 0)
			{
				if(maior < num) {maior = num;}
				System.out.println("Digite mais um n�mero :");
				num = s.nextInt();
			}
			System.out.print("O maior n�mero � "+maior+".");
		}
		else
		{
			System.out.print("Nenhum n�mero v�lido inserido.");
		}

	}
}