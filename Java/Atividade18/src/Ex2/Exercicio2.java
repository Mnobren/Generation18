package Ex2;

import Ex1.Animal;
import Ex1.Cachorro;
import Ex1.Cavalo;
import Ex1.Preguica;
import java.util.Scanner;

public class Exercicio2
{
	public static void main(String[] args)
	{
		int opcao;
		Animal animal = new Animal("",0);
		Cachorro b = new Cachorro("Churros", 2);
		Cavalo c = new Cavalo("Pé de Pano", 8);
		Preguica d = new Preguica("Sid", 10);
		
		Scanner s = new Scanner(System.in);
		do
		{
			System.out.println("1 - Cachorro");
			System.out.println("2 - Cavalo");
			System.out.println("3 - Preguica");
			System.out.println("Selecione um animal :");
			opcao = s.nextInt();
			if(opcao == 1)
			{
				animal = b;
			}
			if(opcao == 2)
			{
				animal = c;
			}
			if(opcao == 3)
			{
				animal = d;
			}
		}
		while(opcao < 1 || 3 < opcao);
		animal.EmitirSom();
	}
}