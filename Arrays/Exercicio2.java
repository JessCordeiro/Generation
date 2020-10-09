package Arrays;

import java.util.Scanner;

public class Exercicio2 {
	public static void main (String args[]) {
		Scanner numeros = new Scanner(System.in);
		int[] listanumeros= new int[6];
		int  i, par=0, impar=0;
		
		for(i=0;i<6;i++) {
			System.out.println("Entre com valor do vetor:");
			listanumeros[i]=(numeros.nextInt());
			
			if(listanumeros[i]%2==0) {
				par++;
			}else {
				impar++;
			}
		}
		System.out.println("Todos os números pares: \n");
		for(i=0;i<6;i++) {
			if(listanumeros[i]%2==0) {
				System.out.println(listanumeros[i]);
			}
		}
		System.out.println("Quantidade de números pares:\n"+par);
		System.out.println("Números ímpares digitados:");
		for(i=0;i<6;i++) {
			if(listanumeros[i]%2!=0) {
				System.out.println(listanumeros[i]);
			}
		}
		System.out.println("Quantidade de números ímpares:\n "+impar);
}
	
}