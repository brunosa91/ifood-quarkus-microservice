package com.cadastro.domain.usecases;

import com.cadastro.domain.gateway.PratoGateway;
import com.cadastro.domain.model.PratoModel;
import jakarta.inject.Inject;

public class BuscarPratoImpl implements BuscarPrato {
    @Inject
    PratoGateway pratoGateway;
    @Override
    public PratoModel buscarPrato(Long id) {
        return pratoGateway.buscarPrato(id);
    }
}
