package LacoDecisao;

import java.util.Scanner;

public class Exercicio1 {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		int n1,n2,n3,x;
		
		System.out.print("Digite o primeiro n�mero:   \n");
		n1 = input.nextInt();
		System.out.print("Digite o segundo n�mero:   \n");
		n2 = input.nextInt();
		System.out.print("Digite o terceiro n�mero:   \n");
		n3 = input.nextInt();
		
		if (n1 > n2)
	    	   x = n1;
	       else
	    	   x = n2;
	       
	       if(x > n3)
	    	   System.out.printf("O n�mero maior �: %d", x);
	       else
	           System.out.printf("O n�mero maior �: %d", n3);
	}
}
