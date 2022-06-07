package br.com.petbuy.loja.pedido.acao;

import br.com.petbuy.loja.pedido.Pedido;

public class SalvarPedidoBancoDados implements AcaoAposGerarPedido {
	public void executarAcao(Pedido pedido) {
		System.out.println("Salvando pedido no banco de dados...");
		
	}

}
