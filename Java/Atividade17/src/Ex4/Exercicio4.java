package Ex4;

public class Exercicio4
{
	public static void main(String[] args)
	{
		Funcionario[] func = new Funcionario[25];
		Gerador gerar = new Gerador();
		
		System.out.println("Inst�nciando objetos Funcion�rio.");
		
		for (int i = 0; i < 10; i++) 
		{
			func[i] = new Funcionario(gerar.Nome(), gerar.Nome(), gerar.Acao());
			System.out.println();
		}

		System.out.println("Objetos Funcion�rio foram inst�nciados.");
	}
}