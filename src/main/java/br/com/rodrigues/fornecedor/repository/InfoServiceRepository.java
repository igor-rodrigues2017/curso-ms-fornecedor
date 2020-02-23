package br.com.rodrigues.fornecedor.repository;

import br.com.rodrigues.fornecedor.model.InfoFornecedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoServiceRepository extends CrudRepository<InfoFornecedor, Long> {

    InfoFornecedor findByEstadoIgnoreCase(String estado);

}
