package br.com.rodrigues.fornecedor.service;

import br.com.rodrigues.fornecedor.model.InfoFornecedor;
import br.com.rodrigues.fornecedor.repository.InfoServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    @Autowired
    private InfoServiceRepository repository;

    public InfoFornecedor getInfoPorEstado(String estado) {
        return repository.findByEstado(estado);
    }
}
