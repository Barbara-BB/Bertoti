package br.com.petbuy.loja.pedido;

import java.time.LocalDateTime;

import br.com.petbuy.loja.orcamento.Orcamento;
import br.com.petbuy.loja.pedido.acao.EnviarEmailPedido;
import br.com.petbuy.loja.pedido.acao.SalvarPedidoBancoDados;

public class GeraPedidoHandler {
	
	// injecao de dependencias para servicos de infra
	public GeraPedidoHandler() {
	}

	public void executar(GeraPedido geraPedido) {
		Orcamento orcamento = new Orcamento(geraPedido.getValorOrcamento(), geraPedido.getQuantidadeItens());
		Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

		// utilizacao dos servicos de infra
	EnviarEmailPedido email = new EnviarEmailPedido();
	SalvarPedidoBancoDados salvar = new SalvarPedidoBancoDados();
	
	email.executar(pedido);
	salvar.executar(pedido);
	}
	
}
