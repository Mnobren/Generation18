import java.util.Scanner;

public class Exercicio5
{
	public static void main(String[] args)
	{
		float n1;
		float n2;
		float n3;
		float m;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Exercício 5");
		
		System.out.print("Digite a primeira nota: ");
		n1 = s.nextFloat();
		System.out.print("Digite a segunda nota: ");
		n2 = s.nextFloat();
		System.out.print("Digite a terceira nota: ");
		n3 = s.nextFloat();
		
		n1 = n1/5;
		n2 = n2*0.3f;
		n3 = n3/2;
		
		m = n1+n2+n3;
		
		System.out.print("A média final é: "+m);
	}
}
