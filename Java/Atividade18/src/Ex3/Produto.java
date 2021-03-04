package Ex3;

public class Produto
{
	String nome;
	String marca;
	int quant;
	double peso;
	double preco;

	public Produto(String nome, String marca, int quant, double peso, double preco) {
		this.nome = nome;
		this.marca = marca;
		this.quant = quant;
		this.peso = peso;
		this.preco = preco;
	}

	//GetSet
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
