
public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total da conta é: " + total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta " + "numero da conta: " + this.numero);
	}
	
	public abstract void deposita(double valor);

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}

	}

	public boolean transfere(double valor, Conta destino) {
//		if (this.saldo >= valor) {
//			this.saldo -= valor;
//			destino.deposita(valor);
//			return true;
//		} else {
//			return false;
//		}
		this.saca(valor);
		destino.deposita(valor);
		return true;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("não pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("não pode valor <= 0");
		}
		this.numero = numero;
	}
	
	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}

	

}
