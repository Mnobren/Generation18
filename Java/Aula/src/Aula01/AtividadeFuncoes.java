package Aula01;

import java.util.Scanner;

public class AtividadeFuncoes
{
	public static void main(String[] args)
	{
		int length;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da linha :");
		length = s.nextInt();
		Linha(length);
	}
	
	public static void Linha(int length)
	{
		for(int i = 0; i < length; i++) 
		{
			System.out.print("-");
		}
	}
}