package Repeticao;

import java.util.Scanner;

public class Exercicio5 {
	public static void main (String args[]) {
		Scanner numeros = new Scanner(System.in);
		int x,soma=0;
		do {
			System.out.println("Entre com número: ");
			x=numeros.nextInt();
			soma=soma+x;
			
			}while(x!=0);
	
		System.out.println("Soma é igual a:"+soma);
	}
	
}
