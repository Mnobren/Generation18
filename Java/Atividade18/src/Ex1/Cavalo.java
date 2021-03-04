package Ex1;

public class Cavalo extends Animal
{
	public Cavalo(String nome, int idade)
	{
		super(nome, idade);
	}
	
	public void EmitirSom()
	{
		super.EmitirSom();
		System.out.println(nome+" relinchou.");
	}
	
	public void Correr()
	{
		System.out.println(nome+" está correndo.");
	}
}
