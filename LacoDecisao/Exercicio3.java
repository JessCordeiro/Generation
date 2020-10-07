package LacoDecisao;

import java.util.Scanner;

public class Exercicio3 {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		double idade;
		
		System.out.print("Digite a sua idade:   \n");
		idade = input.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("Categoria infantil");
		}else if(idade>=15 && idade<=17){
			System.out.println("Categoria juvenil");
		}else if(idade>=18 && idade<=25){
			System.out.println("Categoria adulto");
		}else {
			System.out.println("Idade inválida");
		}
}
}