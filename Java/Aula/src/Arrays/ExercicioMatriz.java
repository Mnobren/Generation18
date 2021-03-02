package Arrays;

import java.util.Scanner;

public class ExercicioMatriz
{
	public static void main(String[] args)
	{
		int[][] matriz = new int[3][3];
		int diagonal = 0;
		int soma = 0;
		
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.printf("Digite o valor[%d][%d] da matriz: ", (i+1), (j+1));
				matriz[i][j] = s.nextInt();
				soma = soma + matriz[i][j];
				if(i == j)
				{
					diagonal = diagonal + matriz[i][j];
				}
			}
		}
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.printf(" | %d", matriz[i][j]);
			}
			System.out.println(" |");
		}
		
		System.out.printf("A soma de todos os valores na matriz é %d e\n", soma);
		System.out.printf("a soma dos valores na diagonal principal é %d.\n", diagonal);
	}
}
