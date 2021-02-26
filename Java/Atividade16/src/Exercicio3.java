import java.util.Scanner;

public class Exercicio3
{
	public static void main(String[] args)
	{
		int idade = 0;
		int total1 = 0;
		int total2 = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Exercício 3");
		

		System.out.println("Digite a idade da pessoa :");
		idade = s.nextInt();
		while(idade != -99)
		{
			if(idade < 21)
			{
				total1 = total1 + 1;
			}
			else if(idade > 50)
			{
				total2 = total2 + 1;
			}
			System.out.println("Digite a idade da pessoa :");
			idade = s.nextInt();
		};
		System.out.println("Total de pessoal com menos de 21: "+total1);
		System.out.println("Total de pessoal com mais de 50: "+total2);
	}
}