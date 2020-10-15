
//Exercicio 4

package Herança;

public class Pessoa {
	protected String nome;
	protected int matricula;
	
	public Pessoa (String nome, int matricula) {
		this.nome = nome;
		this.matricula= matricula;
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
	public void imprimir() {
		System.out.println("Nome do funcionário: "+ nome +"  Matrícula: "+ matricula);
	}
	
}
