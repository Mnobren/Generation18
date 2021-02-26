package Aula01;

import java.util.Scanner;

public class AtividadeEquipe2
{
	public static void main(String[] args)
	{
		int num;
		int maior = 0;
		
		Scanner s = new Scanner(System.in);

		do
		{
			System.out.println("Digite um número :");
			num = s.nextInt();
			if(maior < num) {maior = num;}
		}
		while(0 < num);

		System.out.print("O maior número é "+maior+".");
	}
}