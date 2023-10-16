package com.cadastro.domain.gateway;

import com.cadastro.domain.model.PratoModel;

public interface PratoGateway {

    PratoModel buscarPrato(Long id);

    PratoModel cadastrarPrato(PratoModel pratoModel);

    PratoModel atualizarPrato(PratoModel pratoModel, Long id);
}
