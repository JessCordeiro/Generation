package LacoDecisao;

import java.util.Scanner;

public class Exercicio1 {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		int n1,n2,n3,x;
		
		System.out.print("Digite o primeiro número:   \n");
		n1 = input.nextInt();
		System.out.print("Digite o segundo número:   \n");
		n2 = input.nextInt();
		System.out.print("Digite o terceiro número:   \n");
		n3 = input.nextInt();
		
		if (n1 > n2)
	    	   x = n1;
	       else
	    	   x = n2;
	       
	       if(x > n3)
	    	   System.out.printf("O número maior é: %d", x);
	       else
	           System.out.printf("O número maior é: %d", n3);
	}
}
