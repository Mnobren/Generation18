
public class Exercicio1
{
	public static void main(String[] args)
	{
		System.out.println("Exerc�cio 1");
		
		System.out.println("Dentre os n�meros de 1000 � 1999, s�o estes que divididos por 11 restam 5:");
		
		for(int x = 1000; x < 2000; x++)
		{
			if(x % 11 == 5)
			{
				System.out.print(x+", ");
			}
		}
	}
}
