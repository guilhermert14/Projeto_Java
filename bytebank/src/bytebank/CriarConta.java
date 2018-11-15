package bytebank;

public class CriarConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println(segundaConta.saldo);

		if (primeiraConta == segundaConta) {
			System.out.println("São a mesma conta");
		} else
			System.out.println("Não é a mesma conta!");

		System.out.println(primeiraConta);

		System.out.println(segundaConta);
	}

}
