package com.cadastro.domain.usecases;

import com.cadastro.domain.gateway.PratoGateway;
import com.cadastro.domain.model.PratoModel;
import jakarta.inject.Inject;

public class AtualizarPratoImple implements AtualizarPrato{
    @Inject
    PratoGateway pratoGateway;
    @Override
    public PratoModel atualizarPrato(PratoModel pratoModel, Long id) {
       return pratoGateway.atualizarPrato(pratoModel, id);
    }
}
