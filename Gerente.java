
public class Gerente extends FuncionarioAutenticavel {
		
	public double getBonificacao() {
		System.out.println("Teste Gerente");
		return super.getSalario();
	}
	
}
