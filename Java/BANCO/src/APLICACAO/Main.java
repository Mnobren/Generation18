package APLICACAO;

import java.util.Scanner;
import CLASSES.Conta;
import CLASSES.ContaPoupanca;
import CLASSES.ContaCorrente;
import CLASSES.ContaEspecial;
import CLASSES.ContaEmpresa;
import CLASSES.ContaEstudantil;

public class Main
{
	public static void main(String[] args)
	{
		int opcao = 0;
		int acao = 0;
		double valor;
		int mov = 0;
		String variedade;
		
		Scanner s = new Scanner(System.in);
		
		do
		{
			System.out.println("Banco Edbank");
			System.out.println("*Slogan*");
			System.out.println();
			System.out.println("1 - CONTA POUPAN�A");
			System.out.println("2 - CONTA CORRENTE");
			System.out.println("3 - CONTA ESPECIAL");
			System.out.println("4 - CONTA EMPRESA");
			System.out.println("5 - CONTA ESTUDANTIL");
			System.out.println("6 - SAIR");
			System.out.println();
			System.out.print("DIGITE O C�DIGO DA OP��O SELECIONADA: ");
			opcao = s.nextInt();
			if(opcao == 1)//////////////////////////////////////CONTA/POUPAN�A///////////////////////////////////////////
			{
				ContaPoupanca conta = new ContaPoupanca();
				variedade = "POUPAN�A";
			}
			else if(opcao == 2)//////////////////////////////////////CONTA/CORRENTE///////////////////////////////////////////
			{
				ContaCorrente conta = new ContaCorrente();
				variedade = "CORRENTE";
			}
			else if(opcao == 3)//////////////////////////////////////CONTA/ESPECIAL///////////////////////////////////////////
			{
				ContaEspecial conta = new ContaEspecial();
				variedade = "ESPECIAL";
			}
			else if(opcao == 4)//////////////////////////////////////CONTA/EMPRESA////////////////////////////////////////////
			{
				ContaEmpresa conta = new ContaEmpresa();
				variedade = "EMPRESA";
			}
			else if(opcao == 5)//////////////////////////////////////CONTA/ESTUDANTIL/////////////////////////////////////////
			{
				ContaEstudantil conta = new ContaEstudantil();
				variedade = "ESTUDANTIL";
			}
			else
			{
				Conta conta = new Conta();
			}
			do
			{
				System.out.println("Banco Edbank");
				System.out.println("*Slogan*");
				System.out.println();
				System.out.println("CONTA "+variedade);
				System.out.println("Saldo Atual: ");
				System.out.print("MOVIMENTO : 1-Debito ou 2-Credit: ");
				acao = s.nextInt();
				System.out.print("Valor do movimento: R$");
				valor = s.nextInt();
				if(acao == 1)
				{
					conta.Debito(valor);
				}
				else if(acao == 2)
				{
					conta.Credito(valor);
				}
				else
				{
					System.out.println("Erro, entrada inv�lida.");
					mov = mov - 1;
				}
				mov = mov + 1;
			}
			while(mov < 10);
		}
		while(opcao != 6);
	}
}