package Arrays;

import java.util.Scanner;

public class AtividadeCalendario
{
	public static void main(String[] args)
	{
		string[][] ev = new String[30][];
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Qual � o evento ?");
		var e = s.next();
		System.out.println("Acontecer� em que dia ? (n�mero)");
		var d = s.next();
		System.out.println("Acontecer� em que horas ?");
		var h = s.next();
		ev[d][1] = e;
		ev[d][2] = h;
		
		for(int dia = 1; dia <= 30; dia++)
		{
			System.out.println("Programa��o para dia "+dia+", "+ev[][]+" horas: ");
		}
	
	}
}
