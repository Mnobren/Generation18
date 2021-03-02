package Ex4;

public class Exercicio4
{
	public static void main(String[] args)
	{
		Funcionario[] func = new Funcionario[25];
		Gerador gerar = new Gerador();
		
		System.out.println("Instânciando objetos Funcionário.");
		
		for (int i = 0; i < 10; i++) 
		{
			func[i] = new Funcionario(gerar.Nome(), gerar.Nome(), gerar.Acao());
		}

		System.out.println("Objetos Funcionário foram instânciados.");
	}
}