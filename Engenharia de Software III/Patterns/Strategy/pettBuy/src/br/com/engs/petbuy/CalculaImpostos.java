package br.com.engs.petbuy;

import java.math.BigDecimal;

import br.com.engs.petbuy.imposto.CalculadoraImpostos;
import br.com.engs.petbuy.imposto.TipoImposto;
import br.com.engs.petbuy.orcamento.Orcamento;

public class CalculaImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		CalculadoraImpostos calculadora = new CalculadoraImpostos();
		System.out.println(calculadora.calcular(orcamento, TipoImposto.ISS));
	

	}

}