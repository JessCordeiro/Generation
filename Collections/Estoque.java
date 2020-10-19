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

		do {
			
			System.out.println("Digite uma opção: \n(1) Adicionar item \n(2) Remover item \n(3) Atualizar estoque \n(4) Visualizar estoque");
			opcao=ler.nextInt();
			
			switch(opcao) {
				case 1:
					System.out.println("Digite o nome do produto a ser adicionado: ");
					String produto=ler.next();
					produtos.add(produto);
					break;
				case 2:
					System.out.println("Digite o nome do produto a ser removido: ");
					String produto2=ler.next();
					produtos.remove(produto2);
					break;
					
				case 3:
					System.out.println("Digite o produto a ser substituído: ");
					String sub=ler.next();
					System.out.println("Digite o produto que entrará: ");
					String novo=ler.next();
					
				if(produtos.contains(sub)) {
					produtos.remove(sub);
					produtos.add(novo);
				}
				System.out.println(produtos);
				break;
				
				
				case 4:
					System.out.println("Lista de produtos:  "+produtos);
				default:
					System.out.println("Obrigado!");	
					
					
					
			}
			
			
		}while(opcao!=0);
		
		
	}
	
}
