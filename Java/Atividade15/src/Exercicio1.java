import java.util.Scanner;

public class Exercicio1
{
	public static void main(String[] args)
	{
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int great = 0;

		System.out.println("Exercício 1");
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número inteiro: ");
		n1 = s.nextInt();
		System.out.print("Digite o segundo número inteiro: ");
		n2 = s.nextInt();
		System.out.print("Digite o terceiro número inteiro: ");
		n3 = s.nextInt();

		if (n3 <= n1) {great = n1;}
		if (n1 <= n2) {great = n2;}
		if (n2 <= n3) {great = n3;}

		System.out.print("O maior número dentre os três é "+great+".");
	}
}
