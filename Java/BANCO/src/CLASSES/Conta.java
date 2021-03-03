package CLASSES;

public class Conta
{
	protected int numero;
	protected String cpf;
	protected double saldo;
	protected boolean ativa;

	public Conta()
	{
		this.saldo = 0;
	}
	public Conta(int numero)
	{
		this.numero = numero;
		
		this.saldo = 0;
	}
	public Conta(int numero, String cpf)
	{
		this.numero = numero;
		this.cpf = cpf;
		
		this.saldo = 0;
	}
	public Conta(int numero, String cpf, boolean ativa)
	{
		this.numero = numero;
		this.cpf = cpf;
		this.ativa = ativa;
		
		this.saldo = 0;
	}
	
	public void Debito(double valor)
	{
		if(valor < saldo)
		{
			saldo = saldo - valor;
		}
	}
	
	public void Credito(double valor)
	{
		saldo = saldo + valor;
	}
	
	//GetSet
	public int getNumero()
	{
		return numero;
	}
	public void setNumero(int numero)
	{
		this.numero = numero;
	}
	public String getCpf()
	{
		return cpf;
	}
	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}
	public double getSaldo()
	{
		return saldo;
	}
	public boolean getAtiva()
	{
		return ativa;
	}
	public void setAtiva(boolean ativa)
	{
		this.ativa = ativa;
	}
}