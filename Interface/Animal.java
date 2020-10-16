package Interface;

public class Animal {
	String nome;
	int idade;
	
	public Animal(String nome, int idade) {
		super();
	}
	
	
	public void emitirSom() {
		System.out.println("Emitindo sommm!!!!");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setNome(int idade) {
		this.idade = idade;
	}
}
