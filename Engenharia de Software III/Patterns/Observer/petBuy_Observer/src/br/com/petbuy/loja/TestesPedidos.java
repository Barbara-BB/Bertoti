package br.com.petbuy.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.petbuy.loja.pedido.GeraPedido;
import br.com.petbuy.loja.pedido.GeraPedidoHandler;
import br.com.petbuy.loja.pedido.acao.EnviarEmailPedido;
import br.com.petbuy.loja.pedido.acao.SalvarPedidoBancoDados;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Ana da Silva";
		BigDecimal valorOrcamento = new BigDecimal("745.99");
		int quantidadeItens = 3;
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new SalvarPedidoBancoDados(),
				new EnviarEmailPedido()
				));
		handler.executar(gerador);
	}

}
