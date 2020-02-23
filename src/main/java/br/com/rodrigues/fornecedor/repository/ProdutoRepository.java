package br.com.rodrigues.fornecedor.repository;

import br.com.rodrigues.fornecedor.model.Produto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProdutoRepository extends CrudRepository<Produto, Long>{

	List<Produto> findByEstadoIgnoreCase(String estado);
	
	List<Produto> findByIdIn(List<Long> ids);
}
