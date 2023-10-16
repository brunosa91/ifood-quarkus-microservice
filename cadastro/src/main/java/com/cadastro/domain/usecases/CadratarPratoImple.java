package com.cadastro.domain.usecases;

import com.cadastro.domain.gateway.PratoGateway;
import com.cadastro.domain.model.PratoModel;
import jakarta.inject.Inject;

public class CadratarPratoImple implements CadastrarPrato {
    @Inject
    PratoGateway pratoGateway;
    @Override
    public PratoModel cadastrarPrato(PratoModel pratoModel) {
        return pratoGateway.cadastrarPrato(pratoModel);

    }
}
