package br.com.petbuy.loja.pedido.acao;

import br.com.petbuy.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {
	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando email para cliente sobre pedido...");
		
	}

}
