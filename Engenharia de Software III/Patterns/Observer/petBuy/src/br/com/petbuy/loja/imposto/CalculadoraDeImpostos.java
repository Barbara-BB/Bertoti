package br.com.petbuy.loja.imposto;

import java.math.BigDecimal;

import br.com.petbuy.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}

}