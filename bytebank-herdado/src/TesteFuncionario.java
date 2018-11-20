
public class TesteFuncionario{

	public static void main(String[] args) {
		
		Funcionario nico = new Gerente();
		
		nico.setNome("Nico steppat");
		nico.setCpf("223344546-8");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		

	}

}
