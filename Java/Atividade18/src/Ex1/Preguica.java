package Ex1;

public class Preguica extends Animal
{
	public Preguica(String nome, int idade)
	{
		super(nome, idade);
	}
	
	public void EmitirSom()
	{
		super.EmitirSom();
		System.out.println(nome+" não fez nada.");
	}
	
	public void SubirEmArvore()
	{
		System.out.println(nome+" está subindo na árvore.");
	}
}