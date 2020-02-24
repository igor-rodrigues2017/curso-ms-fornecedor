package br.com.rodrigues.fornecedor.controller;

import br.com.rodrigues.fornecedor.model.Pedido;
import br.com.rodrigues.fornecedor.service.PedidoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pedido")
public class PedidoController {

	private static final Logger log = LoggerFactory.getLogger(PedidoController.class);

	@Autowired
	private PedidoService pedidoService;
	
	@RequestMapping(method = RequestMethod.POST)
	public Pedido realizaPedido(@RequestBody List<ItemDoPedidoDTO> produtos) {
		log.info("Recebedo pedido de compra com os produtos {}", produtos);
		return pedidoService.realizaPedido(produtos);
	}
	
	@RequestMapping("/{id}")
	public Pedido getPedidoPorId(@PathVariable Long id) {
		log.info("Recebendo solicitação de informações para o pedido com id {}", id);
		return pedidoService.getPedidoPorId(id);
	}
}
