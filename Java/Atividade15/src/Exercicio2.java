import java.util.Scanner;

public class Exercicio2
{
	public static void main(String[] args)
	{
		int n1;
		int n2;
		int n3;
		
		Scanner s = new Scanner(System.in);

		System.out.println("Exerc�cio 2");
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = s.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		n2 = s.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
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
		
		System.out.println("Os n�meros em oredem crescente s�o: "+n1+", "+n2+", "+n3+".");
	}
}