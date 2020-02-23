package br.com.rodrigues.fornecedor.service;

import br.com.rodrigues.fornecedor.model.Produto;
import br.com.rodrigues.fornecedor.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> getProdutosPorEstado(String estado) {
		return produtoRepository.findByEstadoIgnoreCase(estado);
	}

	
}
