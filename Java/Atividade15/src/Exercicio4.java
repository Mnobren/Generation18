
import java.util.Scanner;

public class Exercicio4
{
	public static void main(String[] args)
	{
		int num;
		
		Scanner s = new Scanner(System.in);
	
		System.out.println("Exerc�cio 4");
		
		System.out.print("Digite um n�mero inteiro qualquer: ");
		num = s.nextInt();
		
		if (num % 2 == 0) 
		{
			System.out.print("O n�mero "+num+" � par, e sua raiz quadrada � "+(Math.sqrt(num))+".");
		}
		else
		{
			System.out.print("O n�mero "+num+" � impar, e sua pot�ncia de dois � "+(Math.pow(num, 2))+".");
		}
	}
}
