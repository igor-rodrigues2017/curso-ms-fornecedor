package br.com.rodrigues.fornecedor.repository;

import br.com.rodrigues.fornecedor.model.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
