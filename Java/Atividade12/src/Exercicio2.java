import java.util.Scanner;

public class Exercicio2
{
	public static void main(String[] args)
	{
		int age;
		int years;
		int months;
		int days;
		
		Scanner s = new Scanner(System.in);

		System.out.println("Exercício 2");
		
		System.out.println("Digite a sua idade em dias: ");
		age = s.nextInt();
		
		years = age/365;
		var r1 = age%365;
		months = r1/30;
		days = r1%30;

		System.out.println("Você viveu aproximadamente "+years+" anos, "+months+" meses e "+days+" dias.");
	}
}
