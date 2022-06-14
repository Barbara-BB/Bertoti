package br.com.petbuy.loja.pedido.acoes;

import br.com.petbuy.loja.pedido.Pedido;

public class LogDePedido implements AcaoAposGerarPedido{
	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando email para cliente sobre pedido"+pedido);
	}

}
