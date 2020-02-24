package br.com.rodrigues.fornecedor.controller;

import br.com.rodrigues.fornecedor.model.InfoFornecedor;
import br.com.rodrigues.fornecedor.service.InfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

    private static final Logger log = LoggerFactory.getLogger(InfoController.class);

    private final InfoService infoService;

    @Autowired
    public InfoController(InfoService infoService) {
        this.infoService = infoService;
    }

    @GetMapping("/{estado}")
    public InfoFornecedor getInfoPorEstado(@PathVariable String estado) {
        log.info("Recebendo pedido de informação para o estado {}", estado);
        return infoService.getInfoPorEstado(estado);
    }

}
