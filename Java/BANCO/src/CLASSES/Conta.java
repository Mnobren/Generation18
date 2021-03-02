package CLASSES;

public class Conta
{
	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativa;
	
	public Conta(int numero)
	{
		this.numero = numero;
	}
	public Conta(int numero, String cpf)
	{
		this.numero = numero;
		this.cpf = cpf;
	}
	public Conta(int numero, String cpf, boolean ativa)
	{
		this.numero = numero;
		this.cpf = cpf;
		this.ativa = ativa;
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