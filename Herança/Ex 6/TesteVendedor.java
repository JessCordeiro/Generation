
//Exercicio6
package Heran�a;

public class TesteVendedor {
	public static void main (String args[]) {
		Vendedor vendedor= new Vendedor("Antonio",155, 45000.00,0.08);
		vendedor.calcularVencimento(0.08, 45000.00);
		
}
}