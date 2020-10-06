package ExJava;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		Double a,b,c,r,s,d,r2,s2;
		
		System.out.println("escreva o primeiro número:");
		a=(double) read.nextInt();
		
		System.out.println("escreva o segundo número:");
		b=(double) read.nextInt();
		
		System.out.println("escreva o terceiro número:");
		c=(double) read.nextInt();
		
		r=Math.pow(a+b,2);
		s=Math.pow(b+c, 2);
		d=(r+s)/2;
		System.out.println("O custo ao consumidor de um carro novo é:"+ d);
	}
}
