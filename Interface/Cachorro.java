package Interface;

public class Cachorro extends Animal{
	public Cachorro(String nome, int idade ) {
		super(nome, idade);
	}	
	
	public void correr() {
		System.out.println("O cachorro deve correr...");
	}
	
	public void emitirSom() {
		System.out.println("au au au!!!!");
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
