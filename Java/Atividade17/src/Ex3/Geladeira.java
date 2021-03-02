package Ex3;

public class Geladeira
{
	String id;
	String modelo;
	String dono;
	Comida estoque[];
	
	public Geladeira(String id, String modelo, String dono, Comida[] estoque)
	{
		this.id = id;
		this.modelo = modelo;
		this.dono = dono;
		this.estoque = estoque;
		System.out.println("A geladeira de ID "+id+", é um "+modelo+" registrado no nome de "+dono+". Contém:");
		for(int i = 0; i < estoque.length; i ++)
		{
			System.out.println(estoque[i].nome+", "+estoque[i].variedade+", "+estoque[i].marca+", "+estoque[i].peso+" Kg.");
		}
	}
}
