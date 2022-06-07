package br.com.engs.petbuy.imposto;

import java.math.BigDecimal;

import br.com.engs.petbuy.orcamento.Orcamento;

public class ICMS implements Imposto {
	 public BigDecimal calcular(Orcamento orcamento) {
		 return orcamento.getValor().multiply(new BigDecimal("0.1"));
	 }

}
