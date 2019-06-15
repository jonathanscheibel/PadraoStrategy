package multa;

import multa.calculo.CalculoMulta;

public class Multa {

	public static void main(String[] args) {
		CalculoMulta multa;
		
		double valorPrincipal = 97.55;	
		double valorCalculadoMulta = 0.00;
		
		multa = new CalculoMulta(CalculoMulta.TIPO_CALCULO_INTERVALO_PREFEITURA, valorPrincipal);						
		valorCalculadoMulta = multa.retornarValorCalculado();	
		System.out.println("Valor for intervalo da prefeitura: " + valorCalculadoMulta);
		
		multa = new CalculoMulta(CalculoMulta.TIPO_CALCULO_INTERVALO_SELIC, valorPrincipal);
		valorCalculadoMulta = multa.retornarValorCalculado();
		System.out.println("Valor for intervalo selic: " + valorCalculadoMulta);
				
	}

}
