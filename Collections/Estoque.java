package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Estoque {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int opcao;
		String novoProduto;
		Collection<String> produtos = new ArrayList();
		produtos.add("Produto de limpeza");
		produtos.add("Pão");
		produtos.add("frios");
		produtos.add("Maça");
		produtos.add("Maça");
		produtos.add("Banana");
		produtos.add("Bolacha");
		produtos.add("Abacate");
		produtos.add("Arroz");
		produtos.add("Feijão");

		try{
			System.out.println("Lista de produtos"+ produtos+"\n Retirando o Produto Arroz:");


			for(String nome:produtos) {
				if(nome=="Arroz") {
					produtos.remove("Arroz");
				}
			}
			System.out.println("Lista de produtos"+ produtos);
		}catch (Error e) {
			System.out.println("Erro");
		}
		System.out.println("Deseja adicionar algo à lista?: (1) Sim (2) Não");
		opcao= ler.nextInt();

		if(opcao==1) {
			System.out.println("Digite o nome do produto a ser inserido: ");
			novoProduto= ler.next();
			produtos.add(novoProduto);

			for(String name : produtos) {
				System.out.println("Nova lista de produtos: "+ name);	
			}


		}if(opcao==2) {
			for(String name : produtos) {
				System.out.println("Lista de produtos: "+ name);	
			}
		}


	}
}
