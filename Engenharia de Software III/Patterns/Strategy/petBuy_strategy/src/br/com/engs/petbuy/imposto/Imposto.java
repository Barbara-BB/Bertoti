package br.com.engs.petbuy.imposto;

import java.math.BigDecimal;

import br.com.engs.petbuy.orcamento.Orcamento;

public interface Imposto {
	
	BigDecimal calcular(Orcamento orcamento);

}
