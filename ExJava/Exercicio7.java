package ExJava;

import java.util.Scanner;

public class Exercicio7 {
public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int  a,b,c,d,E,f,g,x,y;
		
		System.out.println("Digite o valor de a:");
		a= read.nextInt();
		System.out.println("Digite o valor de b:");
		b= read.nextInt();
		System.out.println("Digite o valor de c:");
		c= read.nextInt();
		System.out.println("Digite o valor de d:");
		d= read.nextInt();
		System.out.println("Digite o valor de e:");
		E= read.nextInt();
		System.out.println("Digite o valor de f:");
		f= read.nextInt();
		System.out.println("Digite o valor de g:");
		g= read.nextInt();
		
		x=((c*E)-(b*f))/((a*E)-(b*d));
		System.out.println("O valor de x é:"+ x);
		
		y=((a*f)-(c*d))/((a*E)-(b*d));
		System.out.println("O valor de y é:"+ y);
}


}

