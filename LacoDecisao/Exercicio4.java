package LacoDecisao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		double n,r;
		
		System.out.print("Digite um número:   \n");
		n = input.nextInt();
		if (n%2==0) {
			r=Math.sqrt(n);
			System.out.println("Este número é par");
		}else {
			r=(int) Math.pow(n, 2);
			System.out.println("Este número é ímpar");
		}
		System.out.println(" O resultado é: "+r);
}
}