
import java.util.Scanner;

public class Exercicio4
{
	public static void main(String[] args)
	{
		int num;
		
		Scanner s = new Scanner(System.in);
	
		System.out.println("Exercício 4");
		
		System.out.print("Digite um número inteiro qualquer: ");
		num = s.nextInt();
		
		if (num % 2 == 0) 
		{
			System.out.print("O número "+num+" é par, e sua raiz quadrada é "+(Math.sqrt(num))+".");
		}
		else
		{
			System.out.print("O número "+num+" é impar, e sua potência de dois é "+(Math.pow(num, 2))+".");
		}
	}
}
