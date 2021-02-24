import java.util.Scanner;

public class Exercicio1
{
	public static void main(String[] args)
	{
		int age;
		int years;
		int months;
		int days;
		
		Scanner s = new Scanner(System.in);

		System.out.println("Exercício 1");//////////////////
		
		System.out.println("Digite quantos anos você tem: ");
		years = s.nextInt();

		System.out.println("e quantos meses: ");
		months = s.nextInt();

		System.out.println("e quantos dias:");
		days = s.nextInt();
		
		age = (years*365)+(months*30)+days;

		System.out.println("Você viveu aproximadamente "+age+" dias ao todo.");
	}
}
