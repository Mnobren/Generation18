package Arrays;

import java.util.Scanner;

public class ExercicioDuasMatrizes
{
	public static void main(String[] args)
	{
		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];
		int[][] M1 = new int[4][6];
		int[][] M2 = new int[4][6];

		System.out.println("N1:");
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 6; j++)
			{
				N1[i][j] = (int) (Math.random()*10);
				System.out.printf(" | %d", N1[i][j]);
			}
			System.out.println(" |");
		}
		System.out.println("-------------------------");
		System.out.println("N2:");
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 6; j++)
			{
				N2[i][j] = (int) (Math.random()*10);
				System.out.printf(" | %d", N2[i][j]);
			}
			System.out.println(" |");
		}
		System.out.println("-------------------------");
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 6; j++)
			{
				M1[i][j] = N1[i][j] + N2[i][j];
				M2[i][j] = N1[i][j] - N2[i][j];
			}
		}
		System.out.println("M1:");
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 6; j++)
			{
				System.out.printf(" | %d", M1[i][j]);
			}
			System.out.println(" |");
		}
		System.out.println("-------------------------");
		System.out.println("M2:");
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 6; j++)
			{
				System.out.printf(" | %d", M2[i][j]);
			}
			System.out.println(" |");
		}
		System.out.println("-------------------------");
	}

}
