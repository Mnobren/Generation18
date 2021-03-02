package Ex4;

public class Funcionario
{
	String nome;
	String sobrenome;
	String acao;
	
	public Funcionario(String nome, String sobrenome, String acao)
	{
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.acao = acao;
		System.out.println("Há um novo funcionário chamado "+nome+" "+sobrenome+", ele está "+acao);
	}
}
