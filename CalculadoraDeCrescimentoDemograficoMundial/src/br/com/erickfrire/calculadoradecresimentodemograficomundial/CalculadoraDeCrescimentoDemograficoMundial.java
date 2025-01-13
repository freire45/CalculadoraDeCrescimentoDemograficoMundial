package br.com.erickfrire.calculadoradecresimentodemograficomundial;

import java.util.Scanner;

public class CalculadoraDeCrescimentoDemograficoMundial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double populacaoMundial = 0.0;
		double taxaDeCrescimentoMundial = 0.0;
		
		System.out.println("Programa que calcula o crescimento demografico mundial: ");
		System.out.print("Digite a população mundial atual: ");
		populacaoMundial = entrada.nextDouble();
		
		System.out.print("Digite a taxa de crescimento anual: ");
		taxaDeCrescimentoMundial = entrada.nextDouble();
		
		populacaoMundial = (populacaoMundial * (taxaDeCrescimentoMundial / 100)) + populacaoMundial;		
		System.out.printf("%n%nA população mundial em 1 ano será de: %.2f%n", populacaoMundial);
		
		populacaoMundial = (populacaoMundial * (taxaDeCrescimentoMundial / 100)) + populacaoMundial;		
		System.out.printf("A população mundial em 2 anos será de: %.2f%n", populacaoMundial);
		
		populacaoMundial = (populacaoMundial * (taxaDeCrescimentoMundial / 100)) + populacaoMundial;		
		System.out.printf("A população mundial em 3 anos será de: %.2f%n", populacaoMundial);
		
		populacaoMundial = (populacaoMundial * (taxaDeCrescimentoMundial / 100)) + populacaoMundial;		
		System.out.printf("A população mundial em 4 anos será de: %.2f%n", populacaoMundial);
		
		populacaoMundial = (populacaoMundial * (taxaDeCrescimentoMundial / 100)) + populacaoMundial;		
		System.out.printf("A população mundial em 5 anos será de: %.2f%n", populacaoMundial);

	}

}
