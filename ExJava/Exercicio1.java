package ExJava;

import java.util.Scanner;

public class Exercicio1{
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int anos, idadeMeses, idadeDias, total;
				
		System.out.println("Entre com sua idade em anos:");
		anos= read.nextInt();
		
		System.out.println("Entre com sua idade em meses:");
		idadeMeses= read.nextInt();
		
		System.out.println("Entre com sua idade em dias:");
		idadeDias= read.nextInt();
		
		idadeMeses = idadeMeses*30;
		anos=anos*365;
		total = anos+ idadeMeses +idadeDias;
		
		System.out.println("A sua idade em dias é:"+ total);
		
	}
}

