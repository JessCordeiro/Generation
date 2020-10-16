package Interface;

public class Cavalo extends Animal{
	public Cavalo(String nome, int idade ) {
		super(nome, idade);
	}
	public void correr() {
		System.out.println("O cavalo deve correr...");
	}
	
	public void emitirSom() {
		System.out.println("hinn in in");
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
