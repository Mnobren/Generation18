package Ex3;

public class Exercicio3
{
	public static void main(String[] args)
	{
		Comida[] comida = new Comida[5];
		
		System.out.println("Inst�nciando objeto avi�o.");
		
		comida[0] = new Comida("Leite","Integral","Parmalat", 1);
		comida[1] = new Comida("Manteiga","com sal","Vigor", 0.4);
		comida[2] = new Comida("Leite Condensado","n/a","Mo�a", 0.6);
		comida[3] = new Comida("Iogurte","Integral","Danone", 0.5);
		comida[4] = new Comida("Ma��","n/a","n/a", 0.3);
		
		Geladeira geladeira = new Geladeira("2e567b9e", "Gela-tudo 2000", "Cabe�a de gelo", comida);

		System.out.println("Objeto Avi�o foi inst�nciado.");
	}
}