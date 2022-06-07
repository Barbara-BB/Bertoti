package br.com.petbuy.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.petbuy.loja.orcamento.Orcamento;
import br.com.petbuy.loja.pedido.acao.AcaoAposGerarPedido;


public class GeraPedidoHandler {
	
	// injecao de dependencias para servicos de infra

	private List<AcaoAposGerarPedido> acoes;
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}
	
	public void executar(GeraPedido geraPedido) {
		Orcamento orcamento = new Orcamento(geraPedido.getValorOrcamento(), geraPedido.getQuantidadeItens());
		Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);
		acoes.forEach(a -> a.executarAcao(pedido));

	}
	
}
