package Ex4;

public class Gerador
{
	private String[] silabas = {"a","e","i","o","u","ba","be","bi","bo","bu","ca","ke","ki","co","cu",
						"da","de","di","do","du","fa","fe","fi","fo","fu","ga","ge","gi","go","gu",
						"ha","he","hi","ho","hu","la","le","li","lo","lu","ma","me","mi","mo","mu",
						"na","ne","ni","no","nu","pa","pe","pi","po","pu","sa","se","si","so","su",
						"ta","te","chi","to","tu","va","ve","vi","vo","vu","za","ze","zi","zo","zu"};
	private String[] verbo = {"escalando ","enfrentado ","descobrindo ","erguendo ",
							"levantando ","criando ","redescobrindo ","eliminando ",
							"caçando ","desbravando ","análisando ","pirando com ",};
	private String[] coisa = {"código ","algoritmo ","vetor ","função ",
							"objeto ","classe ","matriz ","variável ",
							"computador ","criptografia ","impressora "};
	private String[] elogio = {", assustador!",", impressionante.",
							", incrível !",", bom, admirável.",
							", muito interessante.",". Quem diria !?",
							", ora... inesperado.",". irônico não ?",};
	
	public String Nome()
	{
		String[] s = {"","","","","","","",""};
		int r = NumeroAleatorio(8+1);
		for(int i = 0; i < r; i++)
		{
			s[i] = silabas[NumeroAleatorio(silabas.length)];
		}
		return (s[0]+s[1]+s[2]+s[3]+s[4]+s[5]+s[6]+s[7]);
	}
	
	public String Acao()
	{
		var a = NumeroAleatorio(12);
		var b = NumeroAleatorio(11);
		var c = NumeroAleatorio(8);
		return (verbo[a]+((int)(Math.random()*5)+1)+" "+coisa[b]+elogio[c]);
	}
	
	public int NumeroAleatorio(int max)
	{
		return ((int)(Math.random()*max));
	}
}