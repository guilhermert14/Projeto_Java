
public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "248.488.366-44";
		paulo.profissao = "Programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		contaDoPaulo.titular = paulo;
		
		System.out.println(contaDoPaulo.titular.nome);
	}
	
	
}
