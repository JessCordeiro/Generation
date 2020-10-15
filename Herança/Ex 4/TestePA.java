
//Exercicio 4

package Herança;

public class TestePA {
	public static void main (String args[]) {
		Pessoa[] pessoa = new Administrador [2];
		Pessoa joao = new Pessoa("Joao",123);
		Administrador pedro= new Administrador("Pedro",258,"Sim","Sim");
		
		
		joao.imprimir();
		pedro.imprimir();
		
		
	}
	
	
}
