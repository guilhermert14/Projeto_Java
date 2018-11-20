
public class Alcool extends Combustiveis {

	double valorAlcool;

	public double abastece() {
		System.out.println("teste alcool");
		return super.getValor() + this.getValorAlcool(); 
	}

	public double getValorAlcool() {
		return valorAlcool + super.getValor();
	}

	public void setValorAlcool(double valorAlcool) {
		this.valorAlcool = valorAlcool;
	}

}
