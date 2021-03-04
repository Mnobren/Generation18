package Ex1;

public class Cachorro extends Animal
{
	public Cachorro(String nome, int idade)
	{
		super(nome, idade);
	}
	
	public void EmitirSom()
	{
		System.out.println(nome+" latiu!");
	}
	
	public void Correr()
	{
		System.out.println(nome+" está correndo.");
	}
}
