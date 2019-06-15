package multa.calculo;

import multa.calculo.tipo.ICalculoMulta;
import multa.calculo.tipo.IntervaloPrefeitura;
import multa.calculo.tipo.IntervaloSelic;

public class CalculoMulta {

	public static final int TIPO_CALCULO_INTERVALO_PREFEITURA 	= 1;
	public static final int TIPO_CALCULO_INTERVALO_SELIC 		= 2;

	ICalculoMulta calculoMulta;
	double valorBase;
	
	public CalculoMulta() {
		super();	
	}
				
	public CalculoMulta(int tipoCalculo, double valorBase) {
		super();	
		this.valorBase = valorBase;
		
		switch (tipoCalculo) {
		case 1:
			calculoMulta = new IntervaloPrefeitura();
			break;
		case 2:
			calculoMulta = new IntervaloSelic();
			break;
		default:
			break;
		}			
	}
	
	public double getValorBase() {
		return valorBase;
	}
	
	public double retornarValorCalculado() {
		return calculoMulta.retornarValorCalculado(this);
	}
	
}
