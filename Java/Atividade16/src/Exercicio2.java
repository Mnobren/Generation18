import java.util.Scanner;

public class Exercicio2
{
	public static void main(String[] args)
	{
		int n = 0;
		int par = 0;
		int impar = 0;
		
		Scanner s = new Scanner(System.in);

		System.out.println("Exercício 2");
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.print("Digite o "+i+"º valor: ");
			n = s.nextInt();
			if(n%2 == 0)
			{
				par = par + 1;
			}
			else
			{
				impar = impar + 1;
			}
		}
		
		System.out.print("\n"+par+" valores par.");
		System.out.print("\n"+impar+" valores impar.");
	}
}
