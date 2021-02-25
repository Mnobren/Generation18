import java.util.Scanner;

public class Exercicio2
{
	public static void main(String[] args)
	{
		int n1;
		int n2;
		int n3;
		
		Scanner s = new Scanner(System.in);

		System.out.println("Exercício 2");
		
		System.out.println("Digite o primeiro número: ");
		n1 = s.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = s.nextInt();
		System.out.println("Digite o terceiro número: ");
		n3 = s.nextInt();
		
		if(n3 < n2)
		{
			var aux = n2;
			n2 = n3;
			n3 = aux;
		}
		if(n2 < n1)
		{
			var aux = n1;
			n1 = n2;
			n2 = aux;
		}
		if(n3 < n2)
		{
			var aux = n2;
			n2 = n3;
			n3 = aux;
		}
		
		System.out.println("Os números em oredem crescente são: "+n1+", "+n2+", "+n3+".");
	}
}