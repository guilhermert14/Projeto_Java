package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();

		primeiraConta.saldo = 300;
		System.out.println(primeiraConta.saldo);

		Conta segundaConta = primeiraConta;
		System.out.println(segundaConta);

		segundaConta.saldo += 100;
		System.out.println(segundaConta.saldo);

		System.out.println(primeiraConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("São a mesma conta!");
		}
		else {
			System.out.println("São contas diferentes!");
		}
		System.out.println(primeiraConta);
		
		System.out.println(segundaConta);
		
	}

}
