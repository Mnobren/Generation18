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
		System.out.println("O avi�o de ID "+id+", � um "+modelo+" registrado no nome de "+dono);
	}
}
