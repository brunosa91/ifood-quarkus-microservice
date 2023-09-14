package com.cadastro.domain.gateway;

import com.cadastro.domain.model.PratoModel;
import com.cadastro.domain.model.RestauranteModel;

public interface PratoGateway {

    PratoModel buscarPrato(Long id);

    void cadastrarPrato(PratoModel pratoModel);

    void atualizarPrato(PratoModel pratoModel, Long id);
}
