
public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		
		gerente.setNome("Guilherme");
		gerente.setCpf("5632387263");
		gerente.setSalario(5000.0);
		
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		
		gerente.setSenha(2323);
		
		boolean autentico = gerente.autenticacao(2323);
		
		System.out.println(autentico);
		
		System.out.println(gerente.getBonificacao());

	}

}
