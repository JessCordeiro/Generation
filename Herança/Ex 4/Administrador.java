
//Exercicio 4

package Heran�a;

public class Administrador  extends Pessoa{
	private String ajudaDeCusto;
	private String auxilioMoradia;
	public Administrador(String nome, int matricula, String ajudaDeCusto, String auxilioMoradia){
		super (nome, matricula);
		this.ajudaDeCusto = ajudaDeCusto;
		this.auxilioMoradia =auxilioMoradia;
}
	public String getAjudaDeCusto() {
		return ajudaDeCusto;
	}
	public void setAjudaDeCusto(String ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	public String getAuxilioMoradia() {
		return auxilioMoradia;
	}
	public void setAuxilioMoradia(String auxilioMoradia) {
		this.auxilioMoradia = auxilioMoradia;
	}
	public void imprimir() {
		System.out.println("Nome do funcion�rio:  "+ nome +"  Matr�cula:  "+ matricula + "  Possui ajuda de custo?  "+ ajudaDeCusto+ "  Possui aux�lio moradia?  "+ auxilioMoradia);
	}
}
