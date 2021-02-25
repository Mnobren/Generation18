import java.util.Scanner;

public class Exercicio21
{
	public static void main(String[] args)
	{
		int size = 15;
		double[] numeros = new double[size];
		
		Scanner s = new Scanner(System.in);
	
		System.out.println("Exercício 2");
		
		for(int i = 0; i < size; i++)
		{
			System.out.print("Digite o "+(i + 1)+"º número: ");
			numeros[i] = s.nextDouble();
		}
		
		for(int x = 0; x < size; x++)
		{
			for(int i = 0; i < size; i++)
			{
				if((i + 1) < size)
				{
					if(numeros[i + 1] < numeros[i]) 
					{
						var aux = numeros[i];
						numeros[i] = numeros[i + 1];
						numeros[i + 1] = aux;
					}
				}
			}
		}
	
		System.out.println("Em ordem crescente os números inseridos são: ");
		for(int i = 0; i < size; i++)
		{
			if (i == (size-1))
			{
				System.out.print(numeros[i]+".");
			}
			else
			{
				System.out.print(numeros[i]+", ");
			}
		}
	}
}