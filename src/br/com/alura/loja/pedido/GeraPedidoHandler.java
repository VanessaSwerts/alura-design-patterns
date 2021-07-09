package br.com.alura.loja.pedido;

import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBD;

public class GeraPedidoHandler {

	// construtor com injecao de dependencias: repository, service, etc

	public void executa(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		EnviarEmailPedido email = new EnviarEmailPedido();
		SalvarPedidoNoBD salvar = new SalvarPedidoNoBD();
		
		email.executa(pedido);
		salvar.executa(pedido);
	}

}
