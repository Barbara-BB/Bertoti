package br.com.petbuy.loja.imposto;

import java.math.BigDecimal;

import br.com.petbuy.loja.orcamento.Orcamento;

public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);

}
