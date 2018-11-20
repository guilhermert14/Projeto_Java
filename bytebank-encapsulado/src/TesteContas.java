public class TesteContas {

	public static void main(String[] args) {
		
		Conta conta = new Conta(875, 6869);
		
		conta.deposita(200);
		System.out.println(conta.getSaldo());
		
		conta.setAgencia(75656);
		System.out.println(conta.getAgencia());
		
		System.out.println("O total da conta é: " + Conta.getTotal());

	}

}
