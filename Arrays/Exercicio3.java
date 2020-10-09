package Arrays;

import java.util.Scanner;

public class Exercicio3 {
	public static void main (String args[]) {
		Scanner entrada = new Scanner(System.in);
		int [][] matriz = new int [3][3];
		int cont=0;
		
		for(int linha=0;linha<3;linha++) {
			for(int coluna=0;coluna<3;coluna++) {
				System.out.println("Entre com valor:");
				matriz[linha][coluna]=(entrada.nextInt());
				if(matriz[linha][coluna]>10) {
					cont++;
				}
			}
		}
		
		
		System.out.println("Quantidade de valores maiores que 10:"+ cont);
	}
	
}
