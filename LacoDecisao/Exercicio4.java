package LacoDecisao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		double n,r;
		
		System.out.print("Digite um n�mero:   \n");
		n = input.nextInt();
		if (n%2==0) {
			r=Math.sqrt(n);
			System.out.println("Este n�mero � par");
		}else {
			r=(int) Math.pow(n, 2);
			System.out.println("Este n�mero � �mpar");
		}
		System.out.println(" O resultado �: "+r);
}
}