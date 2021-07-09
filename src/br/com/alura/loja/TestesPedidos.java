package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;

public class TestesPedidos {

	public static void main(String[] args) {

		// Representação de interface com usuário
		String cliente = "Vanessa"; // args[0];
		BigDecimal valorOrcamento = new BigDecimal("100"); // new BigDecimal(args[1]);
		int quantidadeItens = 5; //// Integer.parseInt(args[2]);

		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(/*dependencias*/);
		handler.executa(gerador);
	}

}
