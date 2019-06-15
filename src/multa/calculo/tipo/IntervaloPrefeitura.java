package multa.calculo.tipo;

import multa.calculo.CalculoMulta;

public class IntervaloPrefeitura implements ICalculoMulta{

	@Override
	public double retornarValorCalculado(CalculoMulta multa) {
		return multa.getValorBase() * 0.39; //Seria buscado da tabela no banco de dados
	}


}
