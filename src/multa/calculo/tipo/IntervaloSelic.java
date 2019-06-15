package multa.calculo.tipo;

import multa.calculo.CalculoMulta;

public class IntervaloSelic implements ICalculoMulta{

	@Override
	public double retornarValorCalculado(CalculoMulta multa) {		
		return multa.getValorBase() * 0.25; //Seria buscado da tabela no banco de dados
	}

}
