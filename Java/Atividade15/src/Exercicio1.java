import java.util.Scanner;

public class Exercicio1
{
	public static void main(String[] args)
	{
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int great = 0;

		System.out.println("Exerc�cio 1");
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero inteiro: ");
		n1 = s.nextInt();
		System.out.print("Digite o segundo n�mero inteiro: ");
		n2 = s.nextInt();
		System.out.print("Digite o terceiro n�mero inteiro: ");
		n3 = s.nextInt();

		if (n3 <= n1) {great = n1;}
		if (n1 <= n2) {great = n2;}
		if (n2 <= n3) {great = n3;}

		System.out.print("O maior n�mero dentre os tr�s � "+great+".");
	}
}
