
//Exercicio 6
package Herança;

public class Pessoa2 {
	protected String nome;
	private int matricula;
	
	public Pessoa2 (String nome, int matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
}
