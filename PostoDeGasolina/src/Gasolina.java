
public class Gasolina extends Combustiveis {

	double valorGasolina;

	public double abastece() {
		System.out.println("teste gasolina");
		return super.getValor() + this.getValorGasolina(); 
	}

	public double getValorGasolina() {
		return valorGasolina;
	}

	public void setValorGasolina(double valorGasolina) {
		this.valorGasolina = valorGasolina;
	}

}
