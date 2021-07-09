package br.com.alura.loja.pedido;

import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;

public class GeraPedidoHandler {

	// construtor com injecao de dependencias: repository, service, etc

	public void executa(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

		System.out.println("Salvar pedido no BD");
		System.out.println("Enviar e-mail com dados do novo pedido!");
	}

}
