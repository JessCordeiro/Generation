package Interface;

public class Preguica extends Animal {
	public Preguica(String nome, int idade ) {
		super(nome, idade);
	}
	public void subir() {
		System.out.println("Preguiça deve subir em árvores...");
	}
	
	public void emitirSom() {
		System.out.println("aahhhhwwww");
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
