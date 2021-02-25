import java.util.Scanner;

public class Exercicio3
{
	public static void main(String[] args)
	{
		int idade;
		
		Scanner s = new Scanner(System.in);
	
		System.out.println("Exercício 3");
		
		System.out.print("Digite a idade: ");
		idade = s.nextInt();
		
		if ((10 <= idade) && (idade <= 14)) 
		{
			System.out.println("categoria infantil.");
		}
		if ((15 <= idade) && (idade <= 17)) 
		{
			System.out.println("categoria juvenil.");
		}
		if ((18 <= idade) && (idade <= 25)) 
		{
			System.out.println("categoria adulto.");
		}
		else
		{
			System.out.println("ERRO");
		}
	}
}