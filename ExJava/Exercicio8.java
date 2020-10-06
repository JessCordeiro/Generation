package ExJava;

import java.util.Scanner;

public class Exercicio8{
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		Double custoFabrica;
		Double custoConsumidor;
		Double distribuidor;
		Double impostos;
		
		System.out.println("Informe o custo de fábrica:");
		custoFabrica=(double) read.nextInt();
		
		distribuidor=custoFabrica*0.28;
		impostos=custoFabrica*0.45;
		custoConsumidor= custoFabrica + distribuidor + impostos;
		
		System.out.println("O custo ao consumidor de um carro novo é:"+ custoConsumidor);
	}
}
