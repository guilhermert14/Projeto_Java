
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(672, 81963);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(6789, 8967);
		
		Conta conta3 = new Conta(67899, 896787);
		
		System.out.println(Conta.getTotal());

	}

}
