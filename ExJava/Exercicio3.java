package ExJava;

import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int segundos, horas, minutos,segundo;
		System.out.println("Entre com dura��o do evento em segundos:");
		segundos=(int) read.nextInt();
		
		horas = segundos/3600;
		minutos =(segundos%3600)/60;
		segundo = (segundos%3600)%60;
		
		System.out.println("A dura��o do evento �:"+ horas + "horas");
		System.out.println("A dura��o do evento �:"+ minutos + "minutos");
		System.out.println("A dura��o do evento �:"+ segundo + "segundos");

}

}
