import java.util.Scanner;

public class Exercicio4
{
	public static void main (String[] args)
	{
		float a;
		float b;
		float c;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Exercício 4");
		
		System.out.println("Digite o valor de A :");
		a = scan.nextFloat();
		System.out.println("Digite o valor de B :");
		b = scan.nextFloat();
		System.out.println("Digite o valor de C :");
		c = scan.nextFloat();
		
		var r = Math.pow((a+b), 2);
		var s = Math.pow((b+c), 2);
		var d = (r+s)/2;
		
		System.out.println("O resultado da equanção é igual a "+d);
	}
}
