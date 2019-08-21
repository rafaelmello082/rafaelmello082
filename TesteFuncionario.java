
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Gerente fulano = new Gerente();
		fulano.setNome("Fulano");
		fulano.setCpf("000111222-33");
		fulano.setSalario(8000.00);
		
		System.out.println(fulano.getNome());
		System.out.println(fulano.getCpf());
		System.out.println(fulano.getSalario());
		System.out.println(fulano.getBonificacao());
		
	}

}
