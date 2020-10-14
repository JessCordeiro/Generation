
public class Cliente2 {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("João");
		cliente.setEndereço("Rua Feira de Santana");
		cliente.setIdade(24);
		
		
		
			
		System.out.println(cliente.getNome());
		System.out.println(cliente.getEndereco());
		System.out.println(cliente.getIdade());
	}
}
