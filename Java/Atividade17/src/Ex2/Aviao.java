package Ex2;

public class Aviao
{
	String id;
	String modelo;
	String dono;
	
	public Aviao(String id, String modelo, String dono)
	{
		this.id = id;
		this.modelo = modelo;
		this.dono = dono;
		System.out.println("O avião de ID "+id+", é um "+modelo+" registrado no nome de "+dono);
	}
}
