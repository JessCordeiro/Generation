package Repeticao;

import java.util.Scanner;

public class Exercicio3 {
	public static void main (String args[]) {
		Scanner numeros = new Scanner(System.in);
		int idade=0,total=0,conta=0,contb=0;
		
		
		while(idade!=-99) {
			System.out.println("Entre com idade: ");
			idade=numeros.nextInt();
			if(idade<21 && idade>0) {
				conta++;
			}if(idade>50) {
				contb++;
			}
		}
		System.out.println("Total de pessoas com menos de 21 anos:"+conta);
		System.out.println("Total de pessoas com mais de 50 anos: "+ contb);
		
}
}
