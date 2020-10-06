package ExJava;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Double n1,n2,n3, media;
		
		System.out.println("Informe a primeira nota:");
		n1= (double) read.nextInt();
		
		System.out.println("Informe a segunda nota:");
		n2= (double) read.nextInt();
		
		System.out.println("Informe a terceira nota:");
		n3= (double) read.nextInt();
		
		media= (n1*2 + n2*3 +n3*5)/10;
		
		System.out.println("A média é igual a:"+ media);
	}

}
