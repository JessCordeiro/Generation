package ExJava;

import java.util.Scanner;

public class Exercicio6 {
public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		float  x1,y1,x2,y2,c,d,j;
		System.out.println("Digite X1:");
		x1= read.nextInt();
		System.out.println("Digite Y1:");
		y1= read.nextInt();
		System.out.println("Digite X2:");
		x2= read.nextInt();
		System.out.println("Digite Y2:");
		y2= read.nextInt();
		
		c=(float) Math.pow(x2-x1,2);
		j=(float) Math.pow(y2-y1,2);
		d=(float) Math.sqrt(c+j);
		System.out.println("A distância entre os pontos é:"+ d);
		
}
}