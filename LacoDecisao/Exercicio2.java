package LacoDecisao;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {
	public static void main (String args[]) {
		Scanner numeros = new Scanner(System.in);
		int[] listanumeros= new int[3];
		for(int i =0; i< listanumeros.length; i++)
		{
			System.out.println("Digite os números: ");
			listanumeros[i]=(numeros.nextInt());
		}
		Arrays.sort(listanumeros);
		System.out.println("Ordem crescente: ");
		
		for (int j = 0; j < listanumeros.length; j++) 
		{
       		System.out.print(listanumeros[j]+ "  ");       		
		  }
		
		
		
		
	}
}
