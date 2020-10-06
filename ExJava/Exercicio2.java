package ExJava;

import java.util.Scanner;

public class Exercicio2 {
public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int anos, idadeMeses, idadeDias,dia;
		
		System.out.println("Entre com sua idade em dias:");
		idadeDias=(int) read.nextInt();
		anos = idadeDias/365;
		idadeMeses= (idadeDias%365)/30;
		dia = (idadeDias%365)%30;
		System.out.println("A idade em anos é:"+ anos);
		System.out.println("A idade em meses é:"+ idadeMeses);
		System.out.println("A idade em dias é:"+ dia);
}
}
