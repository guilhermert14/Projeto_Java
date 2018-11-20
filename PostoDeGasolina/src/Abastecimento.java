
public class Abastecimento{
	
	private double soma;
	
	public void abastece(Combustiveis co) {
		double abastece = co.abastece();
		this.soma = abastece;
	}
	
	public double getSoma() {
		return soma;
	}

}
