package br.com.engs.petbuy.imposto;

import java.math.BigDecimal;

import br.com.engs.petbuy.orcamento.Orcamento;

public class CalculadoraImpostos {
	public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {
		switch (tipoImposto) {
		case ICMS:
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		case ISS:
			return orcamento.getValor().multiply(new BigDecimal("0.06"));
		
		default:
			return BigDecimal.ZERO;
		
		}
		
		
	}

}
