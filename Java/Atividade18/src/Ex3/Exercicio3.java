package Ex3;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3
{
	public static void main(String[] args)
	{
		int opcao;
		List<Produto> estoque = new ArrayList<>();
		
		Scanner s = new Scanner(System.in);
		
		do
		{
			System.out.println("1 - Adicionar produto.");
			System.out.println("2 - Remover produto");
			System.out.println("3 - Atualizar produto");
			System.out.println("4 - Apresentar Estoque");
			System.out.println();
			System.out.print("Escolha uma opção: ");
			opcao = s.nextInt();
			if(opcao == 1)
			{
				System.out.println("\n");
				estoque = Insercao(estoque);
				System.out.println("\nProduto adicionado com sucesso.");
				System.out.println("\n");
			}
			if(opcao == 2)
			{
				System.out.println("\n");
				Exibicao(estoque);
				System.out.print("Digite o índice do produto a ser removido:");
				int x = s.nextInt();
				estoque.remove((x-1));
				System.out.println("\nProduto removido com sucesso.");
				System.out.println("\n");
			}
			if(opcao == 3)
			{
				System.out.println("\n");
				Exibicao(estoque);
				System.out.print("Digite o índice do produto a ser modificado:");
				int x = s.nextInt();
				//estoque.remove((x-1));
				estoque = Insercao(estoque, x);
				System.out.println("\nProduto alterado com sucesso.");
				System.out.println("\n");
			}
			if(opcao == 4)
			{
				System.out.println("\n");
				Exibicao(estoque);
				System.out.println("\n");
			}
		}
		while(1 <= opcao && opcao <= 4);
	}
	
	public static List<Produto> Insercao(List<Produto> lista, int casa)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Digite o nome do produto:");
		var n = s.next();
		System.out.print("Digite a marca do produto:");
		var m = s.next();
		System.out.print("Digite a quantidade do produto:");
		var q = s.nextInt();
		System.out.print("Digite o peso do produto:");
		var w = s.nextDouble();
		System.out.print("Digite o preço do produto:");
		var p = s.nextDouble();
		lista.set((casa-1), new Produto(n,m,q,w,p));
		return lista;
	}
	public static List<Produto> Insercao(List<Produto> lista)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Digite o nome do produto:");
		var n = s.next();
		System.out.print("Digite a marca do produto:");
		var m = s.next();
		System.out.print("Digite a quantidade do produto:");
		var q = s.nextInt();
		System.out.print("Digite o peso do produto:");
		var w = s.nextDouble();
		System.out.print("Digite o preço do produto:");
		var p = s.nextDouble();
		lista.add(new Produto(n,m,q,w,p));
		return lista;
	}
	
	public static void Exibicao(List<Produto> lista)
	{
		for(int i = 0; i < lista.size(); i++)
		{
			System.out.println((i+1)+" - "+lista.get(i).nome+", "+lista.get(i).marca+", "+lista.get(i).quant+" unidades, "+lista.get(i).peso+"Kg , R$"+lista.get(i).preco+".");
		}
	}
}
