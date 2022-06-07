package br.com.engs.petbuy.imposto;

import java.math.BigDecimal;

import br.com.engs.petbuy.orcamento.Orcamento;

public class CalculadoraImpostos {
	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
		
		
	}

}
