package Interface;

public class TesteAnimais {
	public static void main (String args[]) {
		Cachorro cachorro = new Cachorro(null, 0);
		cachorro.setNome("Bidu");
		cachorro.setNome(5);
		Cavalo cavalo = new Cavalo (null, 0);
		cavalo.setNome("Honey");
		cavalo.setNome(3);
		Preguica preguica = new Preguica(null, 0);
		preguica.setNome("Folivora");
		preguica.setNome(10);
		
		Animal[] animal = new Animal[3];
		animal[0]= cachorro;
		animal[1]=cavalo;
		animal[2]=preguica;
		
		for(Animal roda:animal) {
			System.out.println("Nome: "+roda.getNome()+"  Idade: "+roda.getIdade()+" anos.");
			
			roda.emitirSom();
			
		}
	}
}	
