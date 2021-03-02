package Ex1;

public class Cliente
{
	String nome;
	int idade;
	int cpf;
	
	public Cliente(String nome, int idade, int cpf)
	{
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		System.out.println("O cliente se chama "+nome+", tem "+idade+" anos com CPF "+cpf);
	}
}
