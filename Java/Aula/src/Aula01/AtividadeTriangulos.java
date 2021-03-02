package Aula01;

import java.util.Scanner;

public class AtividadeTriangulos
{
	public static void main(String[] args)
	{
		double b1, b2, b3;
		double h1, h2, h3; //x = (b*h)²
		double x1, x2, x3; //area = (base*altura)/2
		int maior = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite qual a base do triângulo 1 ; ");
		b1 = s.nextDouble();
		System.out.println("Digite qual a altura do triângulo 1 ; ");
		h1 = s.nextDouble();
		System.out.println("Digite qual a base do triângulo 2 ; ");
		b2 = s.nextDouble();
		System.out.println("Digite qual a altura do triângulo 2 ; ");
		h2 = s.nextDouble();
		System.out.println("Digite qual a base do triângulo 3 ; ");
		b3 = s.nextDouble();
		System.out.println("Digite qual a altura do triângulo 3 ; ");
		h3 = s.nextDouble();
		
		x1 = Math.pow(b1 * h1, 2); // valor = base * altura ;
		x2 = Math.pow(b2 * h2, 2); // Função(valor, 2) ;
		x3 = Math.pow(b3 * h3, 2);
		
		if (x3 <= x1) {maior = 1;}
		if (x1 <= x2) {maior = 2;}
		if (x2 <= x3) {maior = 3;}
		
		System.out.println("O Triângulo 1 tem base de "+b1+", altura de "+h1+" e área de "+x1+".");
		System.out.println("O Triângulo 2 tem base de "+b2+", altura de "+h2+" e área de "+x2+".");
		System.out.println("O Triângulo 1 tem base de "+h3+", altura de "+h3+" e área de "+x3+".");
		System.out.println("Dentre estes triângulos o maior é o Triângulo "+maior+".");
	}
}
