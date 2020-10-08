package Repeticao;

import java.util.Scanner;

public class Exercicio2 {
	public static void main (String args[]) {
		Scanner numeros = new Scanner(System.in);
		int par=0, n,i,impar=0;
		for(i=1;i<=10;i++) {
			System.out.println("Entre com um número:");
			n=numeros.nextInt();
			if(n%2==0) {
				par=par+1;
			}else {
				impar=impar+1;
			}
		}
		
		System.out.println("Quantidade de números pares:"+par);
		System.out.println("Quantidade de números impares:"+impar);
		
		
}
}

