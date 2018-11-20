
public class TestaGasolina {

	public static void main(String[] args) {

		Gasolina gasolina = new Gasolina();
		gasolina.setValorGasolina(3.7);

		Alcool alcool = new Alcool();
		alcool.setValorAlcool(2.5);

		Abastecimento abastecimento = new Abastecimento();

		abastecimento.abastece(gasolina);
		abastecimento.abastece(alcool);

		System.out.println(abastecimento.getSoma());
		
	}

}
