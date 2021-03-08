package CLASSES;

import java.util.Scanner;

public class ContaEspecial extends Conta {

    double limiteEspecial = 1000;
    Scanner s = new Scanner(System.in);
    
    public ContaEspecial() {
		System.out.println("        Painel - Informe os dados da sua conta \n");
		System.out.println("    ========================================== \n");
		System.out.println("              Informe o numero da contas");
		System.out.print("                      (4 digitos):               \n");
		numero = s.nextInt();
		System.out.println("              Informe o numero do CPF:           ");
		System.out.print("                      (8 digitos):               \n");
		cpf = s.next();
		System.out.println("              Essa conta esta ativa?           \n");
		System.out.println("              [1]Ativa    [2]Inativa           \n");
		int a = s.nextInt();
		System.out.println("    ========================================== \n");
		if (a == 1)
			ativa = true;
		if (a == 2)
			ativa = false;
    }
    
    @Override
    public void Debito(double valor) {
    	double saldoAtual = getSaldo();  
    	
        if(valor <= saldoAtual) {
            super.Debito(valor);
        }
        
        if(valor > saldoAtual) {
        	double limiteNecessario = valor - saldoAtual; 
        	if (limiteNecessario > limiteEspecial) {
        		System.out.println("Saldo e limite insuficientes para realizar o debito...");
        		return;
        	}
        	
        	if(saldoAtual > 0) {
        		System.out.println("Debitando "+saldoAtual+" da conta");
        		super.Debito(saldoAtual);
        	}
        	
        	usarLimite(limiteNecessario);
        }        
    }
    
    public void usarLimite(double valor) {
    	System.out.println("Utilizando R$"+valor+" do limite especial...");
        limiteEspecial = limiteEspecial - valor;
        System.out.println("Limite especial restante R$"+limiteEspecial + " utilize com sabedoria :)");
    }
}